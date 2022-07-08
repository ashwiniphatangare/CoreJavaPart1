package com.java;

import java.util.Scanner;

public class ArrayInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
int num[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("enter row for the array(max 10)");

for(int i=0;i<num.length;i++) {
	num[i]=sc.nextInt();
}
System.out.print("element in my array");
for(int i=0;i<num.length;i++) {
	System.out.println(num[i]);
}
int countp=0;
for(int i=0;i<num.length;i++) {
	if(num[i]<0)
		countp++;
	System.out.println("pos arrray ele is"+num[i]);
}
	}
}
