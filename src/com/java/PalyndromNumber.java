package com.java;

import java.util.Scanner;

public class PalyndromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
//				Scanner sc=new Scanner(System.in);
//				System.out.println("enter given number");
//						int num=sc.nextInt();
	int	num=1221;
 int reverse=0;
 int temp=num;
 while(num!=0) {
	 int remainder=num%10;
	 reverse=reverse*10+remainder;
	 num=num/10;
 }
 if(reverse==temp)
 System.out.println("number is palyndrom");
 else
	 System.out.println("number is not palyndrom");
	}

}
