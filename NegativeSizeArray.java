package com.cnts.nov7_assignment;

public class NegativeSizeArray {

	public static void main(String[] args) {
		
		double[] doubleArray=new double[-7]; //throws Exception
		doubleArray[0]=76.45;
		doubleArray[1]=23.56;
		doubleArray[2]=33.44;
		doubleArray[3]=15.95;
		System.out.println("Size of array is : "+doubleArray.length);
		System.out.println(doubleArray[0]); 
		System.out.println(doubleArray[1]); 
		System.out.println(doubleArray[2]);
		System.out.println(doubleArray[3]); 
		System.out.println(doubleArray[4]);
		System.out.println(doubleArray[5]);
		System.out.println(doubleArray[6]);

	}

}
