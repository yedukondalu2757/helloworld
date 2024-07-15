package com.corejava.collections;

import java.util.Arrays;

public class ArraysSorting {

	public static void main(String[] args) {
		int arr[] = {1,0,2,0,3,0};
		// expected output as [1,2,3,0,0,0]

		for(int i=0; i<arr.length-2; i++){
			
			if(arr[i] > arr[i+1]){
				arr[i] = arr[i];
			}else if(arr[i] < arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}else if(arr[i] == arr[i+1]){
				if(arr[i]< arr[i+2]) {
				int temp = arr[i];
				arr[i] = arr[i+2];
				arr[i+2] = temp;
				}
			}

	
		}
		System.out.println("required output is: "+Arrays.toString(arr));
	}

}
