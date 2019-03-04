
/***********************************************************************************************************
 * Module Name - MyAssessment
 * Version Control Block
 * 
 * Date			Version	   Author			Reviewer			Change Description
 * -----------  ---------  --------------	----------------	-------------------------------------------
 * Mar 3, 2019 1.0		   Jain, Vipin		XXXXXXXX			Created.
 * -----------  ---------  --------------	----------------	-------------------------------------------
 * 
 ***********************************************************************************************************/

package com.learning.java.sample;

import java.util.Arrays;
import java.util.Collections;

/***********************************************************************************************************
 * Java File - BinarySearch.java
 * Author - Vipin Jain
 * Date   - Mar 3, 2019
 * Description - This class is used to find the number using binary search.
 ***********************************************************************************************************/

public class BinarySearch {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,7,8,9,10};
		int element = 5;
		boolean doesElementExists = binarySearch(numbers, element);
		System.out.println("doesElementExists: " +doesElementExists);
		
		int positionOfElement = binarySearchReturnPosition(numbers, element);
		System.out.println("positionOfElement: " +positionOfElement);
		
		Integer [] numbersCollection = {1,2,3,4,5,7,8,9,10};
		int positionOfElementUsingCoolections = binarySearchUsingCollection(numbersCollection, element);
		System.out.println("positionOfElementUsingCoolections: " +positionOfElementUsingCoolections);
	}

	private static int binarySearchUsingCollection(Integer[] numbers, int element)
	{
		return Collections.binarySearch(Arrays.asList(numbers), element);
	}
	
	private static int binarySearchReturnPosition(int[] numbers, int element)
	{
		int low, mid, high;
		int length = numbers.length;
		low = 0;
		high = length-1;
		while(high>=low)
		{
			mid = (low +high)/2;
			if(element == numbers[mid])
			{
				return mid;
			}
			else if(element > numbers[mid])
			{
				low = mid+1;
			}
			else if(element < numbers[mid])
			{
				high = mid-1;
			}
		}
		return -1;
	}
	
	private static boolean binarySearch(int[] numbers, int element)
	{
		int low, mid, high;
		int length = numbers.length;
		low = 0;
		high = length-1;
		while(high>=low)
		{
			mid = (low +high)/2;
			if(element == numbers[mid])
			{
				return true;
			}
			else if(element > numbers[mid])
			{
				low = mid+1;
			}
			else if(element < numbers[mid])
			{
				high = mid-1;
			}
		}
		return false;
	}

}
