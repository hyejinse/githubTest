package javabasic;

public class LoofExer {

	public static void main(String[] args) {
	
		// 별찍기 1
//		for (int i=0; i<5; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//		System.out.println();
//		}
//		// 별찍기 2
//			for (int i=0; i<5; i++) {
//				for(int k=0; k<4-i; k++) {
//					System.out.print(" ");
//					}
//				for(int j=0; j<=i; j++) {
//				System.out.print("*");
//				}
//		System.out.println();
//	}
//	//별찍기 3)
//			for (int i=5; i>0; i--) {
//				for(int j=0; j<i; j++) {
//				System.out.print("*");
//				}
//		System.out.println();
//	}
//			//별찍기 3)
//			for (int i=0; i<5; i++) {
//				for(int j=5; j>i; j--) {
//				System.out.print("*");
//				}
//		System.out.println();
//			}
			
//		// 별찍기4)
//			for (int i=0; i<5; i++) {
//				for(int j=0; j<5; j++) {
//					if(i%4==0 || j%4==0) {
//					System.out.print("*");}
//					else {
//						System.out.print(" ");
//					}
//				}
//				System.out.println();
//			}
//		// 별찍기 5
//			for(int i=0; i<5; i++) {
//				for(int j=0; j<5; j++) {
//					if(i%4==0 || j%4==0 || i==j || i*j==3) {
//						System.out.print("*");
//					}else {
//							System.out.print(" ");}
//				
//			}System.out.println();
//		}	
//		//별찍기 6 (z)
//			int keynum = 8;
//			for(int i=0; i<keynum+1; i++) {
//				for(int j=0; j<keynum+1; j++) {
//					if(i%keynum==0 || i+j==keynum) {
//						System.out.print("*");
//					}else {System.out.print(" ");
//					}
//				}System.out.println();
//			}
//			
//			
//		//별찍기 7(H)
//			int key = 8;
//			for(int i=0; i<key+1; i++) {
//				for(int j =0; j<key+1; j++) {
//					if(j%key==0 || i==key/2) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}System.out.println();
//			}
		//별찍기 8 (다이아몬드)
	
//		for(int i=1; i<=5; i++) {
//			for (int j=1; j<=5-i; j++) {
//			 System.out.print("  "); 
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");{
//				for (int j=2; j<=i; j++) {
//					System.out.print("* ");
//			System.out.println();
//			}
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++)
				System.out.print(" ");{
					int j = 0;
					if(j<=1) {
						System.out.print("**");
					}else {
		                System.out.print("***");
					}
				}System.out.println();
		}
		
		
	 }
	}


