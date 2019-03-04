package com.learning.java.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {

		int[] ages = {5,10,23,34,34,23,45,65};
		/*int[] newAges;
		newAges = removeDuplicate(ages);
		for(int newAge: newAges)
		{
		System.out.print(newAge +"  ");
		} */
		
		/*List<Integer> newAges = removeDuplicateUsingList(ages);
		System.out.print(newAges);*/
		System.out.println(removeDuplicateUsingList(ages));
	}

	private static Set<Integer> removeDuplicateUsingList(Integer[] ages)
	{
		return Set.of(ages);
	}
	
	private static List<Integer> removeDuplicateUsingList(int[] ages)
	{
		List<Integer> newAges = new ArrayList<>();
		
		for(int age: ages)
		{
			if(!newAges.contains(age))
			{
				newAges.add(age);
			}
		}
		return newAges;
	}


	private static int[] removeDuplicate(int[] ages)
	{
		int[] newAges = new int[ages.length];
		
		int index = 0;
		for(int age: ages)
		{
			boolean valuePresent = false;
			for(int newAge: newAges)
			{
				if (age == newAge)
				{
					valuePresent = true;
					break;
				}
			}
			
			if (!valuePresent)
			{
				newAges[index] = age;
				index++;
			}
		}
		return newAges;
	}
}
