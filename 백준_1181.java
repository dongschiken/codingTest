package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class 백준_1181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = null;
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
		}
		br.close();
		// 만약에 꺼꾸로 입력받으면 어차피 이후에 for문으로 길이대로 정렬할때 올곧게 정렬된다??(이 말은 너무 어렵긴한데)
		Arrays.sort(arr, Comparator.reverseOrder());
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].length() >= arr[j].length()) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					System.out.println(arr[i]);
				}
			}
		}
		
		for (int i = 0, j = 1; i < arr.length; i++, j++) {
			if(j == arr.length) {
				System.out.println(arr[i]);
				break;
			}
			if(arr[i].equals(arr[j])) continue;
			System.out.println(arr[i]);
		}	
		
//		for (int i = 0; i < arr.length; i++) {
//			lhs.add(arr[i]);
//		}
//		Iterator it = lhs.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
	}
}
/*
14
but
i
wont
hesitate
no
more
no
more
it
cannot
wait
im
yours
buu
*/