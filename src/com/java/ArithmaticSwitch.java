package com.java;

import java.util.Scanner;

public class ArithmaticSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
	
		
		System.out.println("1)ADDITION");
		System.out.println("2)SUBSTRACTION");
		System.out.println("enter Your Choice");
		char operator=sc.next().charAt(0);
		
		System.out.println("enter num1");
		int num1=sc.nextInt();
		System.out.println("enter num2");
		int num2=sc.nextInt();
		double result;
		switch(operator) {
		case '+':
			result=num1+num2;
			System.out.println("addition is" +result);
			break;
		case '-':
			result=num1-num2;
			System.out.println("substraction is" +result);
			break;
		case 5:
			System.exit(0);
		}
	}

}
