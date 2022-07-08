package com.java;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,reverse=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter given number");
				 num=sc.nextInt();
 int temp=num;
 while(num!=0) {
	 int remainder=num%10;
	 reverse=reverse+(remainder*remainder*remainder);
	 num=num/10;
 }
 if(reverse==temp)
 System.out.println("the number is armstrong");

	
 else 
	 System.out.println("number is not armstrong");
 
	}
}
