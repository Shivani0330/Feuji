package com.cnts.nov7_assignment;

public class ArraysOfDiffDataTypes {

	public static void main(String[] args) {
		
		ArraysOfDiffDataTypes object=new ArraysOfDiffDataTypes();
		
		object.byteArray();
		object.shortArray();
		object.intArray();
		object.longArray();
		object.floatArray();
		object.doubleArray();
		object.booleanArray();
		object.charArray();
	}
	
	public byte[] byteArray() { //Array of byte datatype
		
		byte[] array=new byte[3];
		array[0]=0;
		array[1]=1;
		array[2]=0;
		System.out.println("Values of byte array are : ");
		System.out.println(array[0]); //0
		System.out.println(array[1]); //1
		System.out.println(array[2]); //0
		
		return array;
	}
	
	public short[] shortArray() { //Array of short datatype
		
		short[] array=new short[3];
		array[0]=4;
		array[1]=6;
		array[2]=9;
		System.out.println("Values of short array are : ");
		System.out.println(array[0]); //4
		System.out.println(array[1]); //6
		System.out.println(array[2]); //9
		
		return array;
	}
	
	public int[] intArray() { //Array of int datatype
		
		int[] array=new int[3];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		System.out.println("Values of int array are : ");
		System.out.println(array[0]); //10
		System.out.println(array[1]); //20
		System.out.println(array[2]); //30
		
		return array;
	}
	
	public long[] longArray() { //Array of long datatype
		
		long[] array=new long[3];
		array[0]=6789;
		array[1]=7653;
		array[2]=85353;
		System.out.println("Values of long array are : ");
		System.out.println(array[0]); //6789
		System.out.println(array[1]); //7653
		System.out.println(array[2]); //85353
		
		return array;
	}
	
	public float[] floatArray() { //Array of float datatype
		
		float[] array=new float[3];
		array[0]=67.8f;
		array[1]=986.4f;
		array[2]=432.53f;
		System.out.println("Values of float array are : ");
		System.out.println(array[0]); //67.8
		System.out.println(array[1]); //986.4
		System.out.println(array[2]); //432.53
		
		return array;
	}
	
	public double[] doubleArray() { //Array of double datatype
		
		double[] array=new double[3];
		array[0]=1023.55;
		array[1]=20567.5;
		array[2]=30378.89;
		System.out.println("Values of double array are : ");
		System.out.println(array[0]); //1023.55
		System.out.println(array[1]); //20567.5
		System.out.println(array[2]); //30378.89
		
		return array;
	}
	
	public boolean[] booleanArray() { //Array of boolean datatype
		
		boolean[] array=new boolean[3];
		array[0]=false;
		array[1]=true;
		array[2]=true;
		System.out.println("Values of boolean array are : ");
		System.out.println(array[0]); //false
		System.out.println(array[1]); //true
		System.out.println(array[2]); //true
		
		return array;
	}

	public char[] charArray() { //Array of char datatype
	
	char[] array=new char[3];
	array[0]='g';
	array[1]='x';
	array[2]='$';
	System.out.println("Values of char array are : ");
	System.out.println(array[0]); //g
	System.out.println(array[1]); //x
	System.out.println(array[2]); //$
	
	return array;
}

}
