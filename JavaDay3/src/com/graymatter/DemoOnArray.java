package com.graymatter;

import java.util.Scanner;

public class DemoOnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int arr[]=new int[5];
		System.out.println("Enter 5 elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int mat1[][]=new int[2][3];
		int mat2[][]=new int [3][2];
//		for(int i=0 ;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		//printing only even numbers
		//finding the sum of elements of array
		
		findDuplicate(arr,2);
//		
	}	
		public static void lsearch(int arr[],int key) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==key) { System.out.println("Element found");
				break;
				}
				
				if(i==arr.length-1) {
					System.out.println("Element not found");
			}
				
			}
		}
		
		public static void binarySearch(int arr[],int key) {
			int l= 0;
			int h= arr.length-1;
			int mid;
			
			while(l<=h) {
				mid=(l+h)/2;
				if(key== arr[mid]) {
					System.out.println("Element found");
					break;
				}else if(key<arr[mid]) {
					h=mid-1;
				}
				else
					l=mid+1;
			}
			if(l>h) {
				System.out.println("not found");
			}
		}
		//bubble sort
		public static void bubbleSort(int a[])
		{
			for(int i=1;i<a.length;i++)
			{
				for(int j=0;j<a.length-i;j++)
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		// find the count of given element (number of times)
		public static void findDuplicate(int arr[],int num) {
			int count=1;
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]==num)
					count++;
			}
			System.out.println("count "+count);
		}
		
		//insert an element at a given position
		
		public static void insert(int arr[],int pos,int ele) {
			if(pos>arr.length-1) {
				System.out.println("Cannot be placed");				
			}else if(arr[arr.length-1]<=0) {
				 int i;

			        // create a new array of size n+1
			        int newarr[] = new int[arr.length+ 1];
				 for (i = 0; i < arr.length + 1; i++) {
			            if (i < pos - 1)
			                newarr[i] = arr[i];
			            else if (i == pos - 1)
			                newarr[i] = ele;
			            else
			                newarr[i] = arr[i - 1];
			        }
			}
		}
		
		//matrix multiplication
		public static void matrixMul(int mat1[][], int mat2[][]) {
			for (int )
		}
		
		//Delete an element at given position
		public static void delete(int arr[],int pos) {
					
		
		
	}

}

