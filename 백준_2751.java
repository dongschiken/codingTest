package 백준문제_브론즈;

import java.util.Arrays;
import java.util.Scanner;

public class 백준_2751 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int m = arr.length;
		SelectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

	private static void SelectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int index = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[index] > arr[j]) index = j;
				if(index == i) continue;
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}
		
	}

}
