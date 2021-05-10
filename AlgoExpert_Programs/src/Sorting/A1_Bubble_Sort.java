package Sorting;

import java.util.*;

class Program1 {
  public static int[] bubbleSort(int[] array) {
	
	  if(array.length == 0 )
		  return new int[] {};
	  else if(array.length == 1)
		  return array;
	  else {
		  
		  for(int i=0; i<array.length;i++) {
			  
			  int flag = 0;
			  
			  for(int j=1;j<array.length;j++) {
				  
				  if(array[j] < array[j-1]) {
					  swap(j, j-1,array);
					  flag = 1;
				  }
			  }
			  
			  if(flag == 0)
				  break;
		  }
		  
	  }
    return array;
  }

private static void swap(int i, int j, int[] array) {
	
	int temp = array[i];
	array[i] = array[j];
	array[j] = temp;
	
}
}

public class A1_Bubble_Sort {

	public static void main(String[] args) {
		
		int array[] = {8, 5, 2, 9, 5, 6, 3};
		Program1 p = new Program1();
		int []arr = Program1.bubbleSort(array);
		
		for(int i:arr) {
			System.out.print("\t"+i);
		}

	}

}
