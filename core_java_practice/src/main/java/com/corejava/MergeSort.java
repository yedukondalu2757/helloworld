package com.corejava;

public class MergeSort {
	
	void merge(int arr[], int beg, int mid, int end)  
	{  

		System.out.println("beg value: "+beg);
		System.out.println("mid value: "+mid); 
		System.out.println("end value: "+end);
	int n1 = mid - beg + 1;  
	int n2 = end - mid;  
	  
	int LeftArray[] = new int [n1];  
	int RightArray[] = new int [n2];  
	  
	for (int i=0; i<n1; ++i)  
	LeftArray[i] = arr[beg + i];  
	  
	for (int j=0; j<n2; ++j)  
	RightArray[j] = arr[mid + 1+ j];  
	  
	  
	int i = 0, j = 0;  
	int k = beg; 
	
	while (i<n1&&j<n2)  
	{ 
	System.out.println(i+" iterarion N1 value: "+n1); 
	System.out.println(i+" iterarion N2 value: "+n2);
	System.out.println(i+" iterarion LeftArray value: "+LeftArray[i]); 
	System.out.println(i+" iterarion RightArray value: "+RightArray[i]);
	if (LeftArray[i] <= RightArray[j])  
	{  
	arr[k] = LeftArray[i];  
	System.out.println(i+" common while loop iterarion arr[k] value: "+arr[k]);
	i++;  
	}  
	else  
	{  
	arr[k] = RightArray[j];  
	System.out.println(i+" common while loop iterarion arr[k] value: "+arr[k]);
	j++;  
	}  
	k++;  
	}  
	while (i<n1)  
	{  
	arr[k] = LeftArray[i];  
	System.out.println(i+" i while loop iterarion arr[k] value: "+arr[k]);
	i++;  
	k++;  
	}  
	  
	while (j<n2)  
	{  
	arr[k] = RightArray[j];  
	System.out.println(j+" j while loop iterarion arr[k] value: "+arr[k]);
	j++;  
	k++;  
	}  
	}  
	  
	void sort(int arr[], int beg, int end)  
	{  
	if (beg<end)  
	{  
	int mid = (beg+end)/2;  
	sort(arr, beg, mid);  
	sort(arr , mid+1, end);  
	merge(arr, beg, mid, end);  
	}  
	}  
	public static void main(String args[])  
	{  
	int arr[] = { 12, 31, 25, 8, 32, 17, 40, 42 };  
	MergeSort ms = new MergeSort();  
	ms.sort(arr, 0, arr.length-1);  
	  
	System.out.println("\nSorted array");  
	for(int i =0; i<arr.length;i++)  
	{  
	  System.out.println(arr[i]+"");  
	}  
	}  

}
