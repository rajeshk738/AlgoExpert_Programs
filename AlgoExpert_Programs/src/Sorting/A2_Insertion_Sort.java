package Sorting;

import java.util.*;

class Program2 {
  public static int[] insertionSort(int[] array) {
	  
	  if(array.length == 0 )
		  return new int[] {};
	  else if(array.length == 1)
		  return array;
	  
	  int i=1, j=0;
	  
	  while(i<array.length) {
		  
		  j=i;
		  
		  if(array[i] < array[i-1]) {
			  while(j > 0) {
				  
				  if(array[j] < array[j-1])
					  swap(j, j-1, array);
				  else
					  break;
				  j--;
			  }
			  
		  }
		  
		  i++;
	  } 
	  
	  return array;
	
	  
  }

private static void swap(int i, int j, int[] array) {
	
	int temp = array[i];
	array[i] = array[j];
	array[j] = temp;
	
}
}

public class A2_Insertion_Sort {

	public static void main(String[] args) {
		
		int array[] = {8, 5, 2, 9, 5, 6, 3};
		Program2 p = new Program2();
		int []arr = Program2.insertionSort(array);
		
		for(int i:arr) {
			System.out.print("\t"+i);
		}

	}

}
