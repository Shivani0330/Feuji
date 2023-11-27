package com.cnts.nov7_assignment;

public class ArrayDeclarations {

	public static void main(String[] args) {
		int[] array1=new int[4];
		
		int[] array2=null;
		array2=new int[3];
		
		int array3[]=new int[5];
		
		int array4[]= {78,43,98,32,19};
		
		int[] array5= {0,0,0,0};
		ArrayDeclarations array=new ArrayDeclarations();
		array.values(array5);
		
		array.values(new int[] {1,2,3,4,5}); //Anonymous Array

	}
	
	public int[] values(int[] array5) {
		array5[1]=78;
		array5[3]=98;
		System.out.println("Values of Array5 : ");
		for(int array:array5) {
			System.out.println(array);
		}
		return array5;
	}

}
