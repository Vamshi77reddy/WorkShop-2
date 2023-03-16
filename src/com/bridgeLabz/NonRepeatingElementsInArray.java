package com.bridgeLabz;
/*1>Java program to find non-repeating elements in an array
printing non repeating elements in an array in java programming language We are given with an array and need to print the distinct elements among them. You will found different methods to solve this problem in this page.*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class NonRepeatingElementsInArray {
public static void countFrequency(int array[], int n) {
	boolean visited[]=new boolean[n];
	Arrays.fill(visited,false);
	for(int i=0;i<n;i++) {
		if(visited[i]==true)
			continue;
		int count=1;
		for(int j=1+i;j<n;j++) {
			if(array[i]==array[j]) {
			visited[j]=true;
			count++;//counting the frequency
		
		}
	}
	if(count==1)
		System.out.println(array[i]);
}}
public static void distinctElements(int array[], int n) {
	int i,j;
	for( i=0;i<n;i++) {
		for ( j=0;j<i;j++)
			if(array[i]==array[j])
				break;
		if(i==j)
			System.out.println( "Distint Elements are" +array[i]);
	}
}
public static void main (String [] args) {
	int array[]=new int[] {10, 20, 40, 30, 50, 20, 10, 20};
	int n=array.length;
	countFrequency(array, n);
	distinctElements(array,n);
}
}
/*Input : arr[8] = [10, 20, 40, 30, 50, 20, 10, 20]
Output : 40 30 50*/