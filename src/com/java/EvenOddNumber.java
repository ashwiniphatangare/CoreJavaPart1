package com.java;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
System.out.println("enter given number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%2==0) {
				System.out.println(num);
			}
			else {
				System.out.println("Given number is odd");
				
			}
		}
	}

}
