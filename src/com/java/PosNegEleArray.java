
package com.java;

import java.util.Scanner;

public class PosNegEleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row,col,i,j;

int arr[][]=new int[10][10];
Scanner sc=new Scanner(System.in);
System.out.println("enter row for the array(max 10)");
row=sc.nextInt();
System.out.println("enter col for the array(max 10)");
col=sc.nextInt();
System.out.println("enter" +(row*col) + " array element:");
for( i=0;i<row;i++) {
	for(j=0;j<col;j++) {
		arr[i][j]=sc.nextInt();
	}
	
}

System.out.print("the array is:\n");
for( i=0;i<row;i++) {
	for(j=0;j<col;j++) {
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();

}



	}
}
