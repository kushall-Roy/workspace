package com.kushal;

public class DemoClass {

	public static void main(String[] args) {
		int[] a = {10,20,30,40};
		
		for(int ele : a) {
			System.out.println(ele);
		}		
		String name = "Sachin";
		int count = name.toUpperCase().length();
		System.out.println("The length of the String is :: "+count);
		
		StringBuffer sb = new StringBuffer("Sachin Tendulkar");
		int length = sb.append("INDMI").reverse().length();
		System.out.println("Length is :: "+length);
	}
}
