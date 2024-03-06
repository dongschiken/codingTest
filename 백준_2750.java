package 백준문제_브론즈;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class 백준_2750 {

	public static void main(String[] args) {
		/*
		시간 제한	1 초
		메모리 제한 128 MB
		제출 195509
		정답 111611
		맞힌 사람 76767
		정답 비율 58.005%

		문제
		N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

		입력
		첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

		출력
		첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

		예제 입력 1 
		5
		5
		2
		3
		4
		1

		예제 출력 1 
		1
		2
		3
		4
		5
		 */

		// 0 1 2 3 4
		// 01 02 03 04
		// 12 13 14
		// 23 24
		// 34
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nArr = new int[n];
		for (int i = 0; i < n; i++) {
			nArr[i] = sc.nextInt();
		}
		SelectionSort(nArr);
		for (int i = 0; i < nArr.length; i++) {
			System.out.println(nArr[i]);
		}
		

	}
	public static void SelectionSort(int[] nArr) {
		// 선택 정렬
		for (int i = 0; i < nArr.length-1; i++) {
			int index = i;
			for (int j = i+1; j < nArr.length; j++) {
				if(nArr[index] > nArr[j]) index = j;
			}
			if(index == i) continue;
			int temp = nArr[i];
			nArr[i] = nArr[index];
			nArr[index] = temp;
		}


	}
}


