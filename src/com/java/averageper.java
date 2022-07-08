package com.java;

import java.util.Scanner;

public class averageper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter subject marks");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
//		int avg=sc.nextInt();
//		int total=sc.nextInt();
		int total=a+b+c;
		int avg=total/3;
		if(avg>=40 && avg<=50) {
			System.out.println("c grade");
		}
		
		else if(avg>=60 && avg<=70) {
			System.out.println("b grade");
		}
		else {
			System.out.println("a grade");
		}
	}

}
