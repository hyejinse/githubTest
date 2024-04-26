package javabasic;

import java.util.ArrayList;
import java.util.List;

public class Roof {

	public static void main(String[] args) {
		
	 for(int i=1; i<11; i++) {
		 System.out.println(i);
	 }
	 
	 //실습 1) 11부터 33까지 반복해서 출력
	 for(int i=11; i<34; i++) {
		 System.out.println(i);
	 }
	 
	 //실습 2) 15부터 30까지 홀수만 출력
	 for(int odd =15; odd<31; odd=odd+2) {
		 System.out.println(odd);
	 }

	 //실습 3) 1부터 100까지의 3의 배수만 출력
	 for(int i=3; i<101; i=i+3) {
		 System.out.println(i);
	 }
	 
	 //실습 4) 1부터 1000까지 정수 중에서 5와 7로 나누어 떨어지는 수 출력
	 for(int i=1; i<1001; i=i+1) {
		 if(i%5==0 || i%7==0) {
		 System.out.println(i);
		 }	 }
	 
	 // 실습5) 1부터 1000까지 소수(1과 자기자신으로만 나누어 떨어지는수)만 출력
	 //1) 1일때는 소수이므로 출력
	 //2) 1이 아닌경우는 현재수부터 마지막수까지 나눠본다
	 //3) 나누어 떨어지는 수의 갯수가 1개이면 소수 그렇지 않으면 소수가 아니다.
	
	 for(int i=1; i<1001; i++) {	
		if(isPrime(i)) {
			System.out.println(i);	
		}
		//enhanced for
//		int[] intArray = {10, 20, 30, 40};
//		for(int i1 :intArray, length; i++) {
//			System.out.println(intArray[i]);
//		}
		List<String> strList = new ArrayList<String>();
		strList.add("홍길동");
		strList.add("강김찬");
		strList.add("유관순");
		for (String str : strList) {
			System.out.println(str);
			
		}
		for (int i1=0; i1<strList.size(); i1++) {
			System.out.println(strList.get(i1));}
		
		int k = 10;
		while(k<100) {
			System.out.println(k);
			k++;}
		
		int I =1;
		while (I<100) {
			if(I==50)break;
			I++;
		if(I%2==0) continue;
		System.out.println(I);
		}
		}
		
//		while(true) {
//			System.out.println("무한반복");
	 
	//실습 1)while문을 사용하여 10부터 100까지의 정수 중에서 3의 배수만 출력
	 int thr =10;
	 while (thr<101) {
		 if (thr%3==0) {		 
		 System.out.println(thr+"는 3의 배수");
	 }thr++;}
	 
	 //실습 2)while문을 사용하여 10부터 100까지의 정수 중에서 3의 배수이지만 6의 배수는 아닌 수들만 출력
	 
	 int q =10;
	 while (q<101) {
		 if (q%3==0 && q%6!=0) {		 
		 System.out.println(q+"는 3의 배수이면서  6의 배수는 아닌 것");
	 }
		 q++;}
	 
	 //실습 3)while문을 사용해서 10부터 100까지의 정수 중에서 3의 배수가 아닌것
	 int u =10;
	 while(u<101) {
		 if (u%3==0) continue;  //3의 배수면 계속 다시 검토해라
		 System.out.println(u);
		 u++;
		 
		 int i = 1;
		 do {
			 System.out.println(i);
			 i++;
		 }while (i<100);
		 
	 }
	 
//	}
	} 
	 static boolean isPrime(int n) {
		 if(n ==1) return true;
		 for(int i=2; i<n; i++) {
			 if (n%i ==0) return false;
		 }return true;
		 
	 }	
	}











