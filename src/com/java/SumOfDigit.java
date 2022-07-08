package com.java;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int sum=0,i;
		System.out.println("enter given number");

		int num=sc.nextInt();
		for(i=1;i<=num;i++) 
		{
			sum+=1;
		}
		sum=num*(num+1)/2;
		System.out.println("sum of numbers"+sum);
	}

}
