package com.java;
public class PrintPrimeNumber {
	public static void main(String[] args) {
        int i,j;
        
        
        for(j=2;j<=50;j++) {
        	boolean	flag=false;
        	for(i=2;i<=j/2;i++) {
        		
    			if(j%i==0) {
    				flag=true;
    				break;
    			}
        	}
        	if(flag==false) {
        		System.out.print(j+" ");
        	}
        }
	}

}



/*package com.java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		boolean flag=false;
		for(int j=2;j<=number;j++) {
			flag=false;
		for(int i=2;i<=j/2;i++) {
			if(j%i==0) {
				flag=true;
				break;
			}
		}
 if(flag==false) 
	 System.out.print(j+"");
		}
	}

}

*/