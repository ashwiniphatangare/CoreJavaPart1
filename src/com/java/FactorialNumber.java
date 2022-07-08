package com.java;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter given number");
				int num=sc.nextInt();
				for(int i=1;i<=num;i++) {
					fact=fact*i;
				}
				System.out.println("fact is"+fact);

	}

}
