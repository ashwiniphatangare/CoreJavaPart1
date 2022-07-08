package com.java;

public class CapacityString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();  
        System.out.println(sb.capacity());  
        sb.append("DataFlair");  
        System.out.println(sb.capacity());
        sb.append("DataFlair is company that teaches programming!!!");  
        System.out.println(sb.capacity()); 
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());  
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
        
        StringBuffer scan=new StringBuffer("java");
		System.out.println("capacity"+scan.capacity());
		System.out.println("reverse"+scan.reverse());
		System.out.println("replace"+scan.replace(2,4,"bio"));
		System.out.println("replace"+scan.insert(2,"math"));
		System.out.println("replace"+scan.delete(2,6));
		scan.ensureCapacity(10);
		System.out.println("ensure capacity"+scan.capacity());



	}

}
