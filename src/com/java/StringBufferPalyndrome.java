package com.java;

public class StringBufferPalyndrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String myString="anna";
StringBuffer buffer=new StringBuffer(myString);
buffer.reverse();
String data=buffer.toString();

if(myString.equals(data)) {
	System.out.println("given string is palyndrome");
}
else {
	System.out.println("given string is not palyndrome");
}
	}

}
