package com.java;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your string");
		String s=sc.nextLine();
		int words=1;
		int characters=1;
		
		for(int i=0;i<s.length()-1;i++) {
			

			char ch=s.charAt(i);
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				
				words++;
				
			}
			else if(s.charAt(i)!=' ') {
				characters++;
				
			}
		}
		System.out.println("total words" +words);
		System.out.println("total characters" +characters);
		System.out.println("total space" +(words-1));
		

	}

}
