package com.java;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("enter given number");
						int num=sc.nextInt();
 int reverse=0;
 while(num!=0) {
	 int remainder=num%10;
	 reverse=reverse*10+remainder;
	 num=num/10;
 }
 System.out.println("reverse of number is"+reverse);
	}

}
