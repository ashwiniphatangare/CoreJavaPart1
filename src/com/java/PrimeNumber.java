


package com.java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				flag=true;
				break;
			}
		}
 if(!flag) 
	 System.out.print("Given number is prime");
 else
	 System.out.println("Given number is not prime");
	}

}

