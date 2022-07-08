package com.java;
import java.util.Scanner;


public class StringOperation {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
String s=new String("i love java");
System.out.println("length"+s.length());	
System.out.println("uppercase"+s.length());	
String s1="jhjyguy";
System.out.println("equal method"+s.equals(s1));	
System.out.println("conacat method"+s.concat("sci"));	
System.out.println("replace method"+s.replace("java","bio"));	
System.out.println("indexof method"+s.indexOf("love"));	
System.out.println("lastindex method"+s.lastIndexOf("love"));	
String s2="jhjyguy";
System.out.println("length"+s2.length());	

System.out.println(s2.trim());
System.out.println("trim length"+s2.length());
String str="hellow how are u";
String[]arrofstr=str.split(" ",4);
for(String a:arrofstr)
{
System.out.println(a); 
}

String emptyStr=" ";
System.out.println(emptyStr.isEmpty());//false
System.out.println(emptyStr.isBlank());//true


System.out.println(s1.compareToIgnoreCase("java"));
System.out.println(s1.compareTo(s2));


String str1="      Anil      ";
System.out.println(str1.strip());
System.out.println("Stripleading:" +str1.stripLeading());
System.out.println("Striptrailling:"+str1.stripTrailing());
System.out.println("Repeat:"+str1.repeat(3));

System.out.println(str1.trim());



System.out.println("coking".startsWith("king"));
System.out.println("coking".endsWith("king"));
//System.out.println("replace method"+s.subString(2,6));	



String dest1="java";
char[] dest=new char[4];
dest1.getChars(0, 4, dest, 0);
//System.out.println(" "+Arrays.toString(dest));
System.out.println(dest1.toCharArray());







}

}
