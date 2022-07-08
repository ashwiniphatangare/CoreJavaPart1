package com.java;

import java.util.Scanner;

public class FibbonaciSeries {

	public static void main(String[] args) {
	 int n1=0,n3;
	 int n2=1;
//	 Scanner sc=new Scanner(System.in);
//		System.out.println("enter number");
//				int num=sc.nextInt();
				System.out.print("fibbonaci series"+n1+""+n2);
	 for(int i=2;i<=5;i++) {
		n3=n1+n2;
		System.out.print(n3);
		n1=n2;
		n2=n3;
		
	 }

	}

}
