package com.BridgeLabz;

public class MaxValueGenerics {
	public static void MaxValue(int a,int b,int c){
		Integer n1=a;
		Integer n2=b;
		Integer n3=c;
		Integer max=n1;
		if(n2.compareTo(max)>0) {

			max=n2;
		}
		if(n3.compareTo(max)>0) {
			max=n3;
		}
		System.out.println("Maximum number is "+max);
	}
	public static void main(String[] args) {
		System.out.println("TC 1.1 Keeping max value at 1");
		MaxValue(3,2,1);
		System.out.println("TC 1.2 keeping max value at 2");
		MaxValue(2,3,1);
		System.out.println("TC 1.3 keeping max value at 3");
		MaxValue(1,2,3);
	}  
}  