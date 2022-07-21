package com.BridgeLabz;

public class MaxValueGenerics {
	public static <T extends Comparable<T>>T  MaxValue(T a1,T a2,T a3,T a4,T a5){
		T max=a1;
		if(a2.compareTo(max)>0) 
			max=a2;
		if(a3.compareTo(max)>0) 
			max=a3;
		if(a4.compareTo(max)>0) 
			max=a4;
		if(a5.compareTo(max)>0) 
			max=a5;
		return max;
	}


	public static void main(String[] args) {
		System.out.println("Max value in 3 Integers is:"+MaxValue(3,2,1,4,5));
		System.out.println("Max value is 3 Float is:"+MaxValue(3.10f,2.20f,1.10f,4.10f,5.20f));
		System.out.println("Max value is 3 String is:"+MaxValue("Apple","Peach","Banana","Orange","Kivi"));
	}  
}
