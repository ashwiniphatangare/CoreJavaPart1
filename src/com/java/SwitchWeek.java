package com.java;

import java.util.Scanner;

public class SwitchWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter day");
		int week=sc.nextInt();
		String day="";
		switch (week) {
		case 1:
			day="Sunday";
			System.out.println("day is" +day);
			break;
			
		case 2:
			day="Monday";
			System.out.println("day is" +day);
			break;
			
		case 3:
			day="Tuesday";
			System.out.println("day is" +day);
			break;
			
		case 4:
			day="thursday";
			System.out.println("day is" +day);
			break;
			
		case 5:
			day="Friday";
			System.out.println("day is" +day);
			break;
		case 6:
			day="Saturday";
			System.out.println("day is" +day);
			break;
		default:
			System.out.println("invalid day");
			
			
		}
			
	}

}
