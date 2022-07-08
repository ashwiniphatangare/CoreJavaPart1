//package com.java;
//
//public class TranglePattern {
//
//	public static void main(String[] args) {
//		int i,j;
//		for(i=0;i<=5;i++) {
//			for(j=0;j<i;j++) {
//				System.out.print("*");
//				
//			}
//			System.out.println();
//		}
//
//	}
//
//}



//package com.java;
//
//public class TranglePattern {
//
//	public static void main(String[] args) {
//		int i,j;
//		for(i=1;i<=5;i++) {
//			for(j=1;j<i;j++) {
//				System.out.print(j);
//				
//			}
//			System.out.println();
//		}
//
//	}
//
//}
// ******output
//1
//12
//123
//1234





package com.java;

public class TranglePattern {

	public static void main(String[] args) {
		int i,j,n=7;
		for(i=0;i<=n;i++) {
			for(j=1;j<n-i;j++) {
				System.out.print(" ");
				
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
				
			}
			System.out.println("");
		}

	}
}






















