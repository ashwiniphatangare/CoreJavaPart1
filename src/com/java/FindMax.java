package com.java;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a=2,b=3,c=4;
		Scanner sc=new Scanner(System.in);
		
		
		
		
		System.out.println("enter a");
		int a=sc.nextInt();
		System.out.println("enter b");
		int b=sc.nextInt();
		System.out.println("enter c");
		int c=sc.nextInt();
if(a>b && a>c) {
	System.out.println("a is greater" +a);
}
else if(b>a && b>c){
	System.out.println("b is greater" +b);
}
else {
	System.out.println("c is greater" +c);
}

	}

}
