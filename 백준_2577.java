package 백준문제_브론즈;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 백준_2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		a = a*b*c;
		String aStr = String.valueOf(a);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < aStr.length(); i++) {
			a = Integer.parseInt(aStr.substring(i, i+1)); 
			list.add(a);
		}
		int[] arr = new int[10];
		for (int i = 0; i < list.size(); i++) {
			arr[list.get(i)]++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
	}

}
