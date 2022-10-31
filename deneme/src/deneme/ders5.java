package deneme;

import java.util.Arrays;

public class ders5 {

	public static void main(String[] args) {
	import java.util.Arrays;
	
	public class ArrayManipulations{
		public static void main(String[]args) {
			double[] doubleArray= {8.4, 9.3, 0.2, 7.9, 3.4};
			Arrays.sort(doubleArray);
			System.out.println("%ndoubleArray: ");
			
			for(double value: doubleArray) {
				System.out.println("%.1f", value);
				
			}
			int[]filledIntArray=new int[10];
			Arrays.fill(filledIntArray, 7);
			displayArray(filledIntArray,"filledIntArray");
			
			int[] intArray= {1, 2, 3, 4, 5, 6};
			int[] intArrayCopy =new int[intArray.lenght];
			System.arraycopy(intArray, 0, intArrayCopy, 0, 0);
			displayArray(intArray,"intArray");
			displayArray(intArrayCopy,"intArrayCopy%n");
			
			boolean b=Array.equals(intArray,intArrayCopy);
			System.out.printf("%n%nintArray %s intArrayCopy%n",
					(b ?"==":"!="));
			
			
			b=Array.equals(intArray, filledIntArray);
			System.out.printf("intArray %s filledIntArray%n",
					(b ?"==":"!="));
					
			
			
		}
	}
		

	}

}
