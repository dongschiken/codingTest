package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 백준_2108_통계학 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		통계학  
		시간 제한	 2 초 
		메모리 제한	 256 MB
		제출	     161395
		정답	     39156
		맞힌 사람	 31392
		정답 비율   26.407%
							
		문제
		수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.

		산술평균 : N개의 수들의 합을 N으로 나눈 값
		중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
		최빈값 : N개의 수들 중 가장 많이 나타나는 값
		범위 : N개의 수들 중 최댓값과 최솟값의 차이
		N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.

		입력
		첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 단, N은 홀수이다. 그 다음 N개의 줄에는 정수들이 주어진다. 입력되는 정수의 절댓값은 4,000을 넘지 않는다.

		출력
		첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.

		둘째 줄에는 중앙값을 출력한다.

		셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.

		넷째 줄에는 범위를 출력한다.

		예제 입력 1 
		5
		1
		3
		8
		-2
		2
		예제 출력 1 
		2
		2
		1
		10
		
		예제 입력 2 
		1
		4000
		예제 출력 2 
		4000
		4000
		4000
		0
		
		예제 입력 3 
		5
		-1
		-2
		-3
		-1
		-2
		예제 출력 3 
		-2
		-2
		-1
		2
		*/
		
		// 중앙값 구하는 함수
		// 로직 : 배열을 받아와서 그 가운데 있는 숫자 하나 출력 == middle
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList found_list = new ArrayList();

		int n = Integer.parseInt(br.readLine());
		int[] counting = new int[8001];
		int[] n_arr = new int[n];
		for (int i = 0; i < n_arr.length; i++) {
			n_arr[i] = Integer.parseInt(br.readLine());
			counting[n_arr[i]+4000]++;
		}		
		Arrays.sort(n_arr);
		
		int max = counting[0];
		for (int i = 1; i < counting.length; i++) {
			if( max < counting[i]) {
				max = counting[i];
			}
		}
			
		// 산술 평균 함수
		avg(n_arr, n);
		// 중앙값 함수
		middle(n_arr, n);
		// 최빈값 구하는 함수
		foundIndex(counting, max, found_list);
		Collections.sort(found_list);
		if(found_list.size() >= 2) {
			System.out.println(found_list.get(1));
		}else {
			System.out.println(found_list.get(0));
		}		
		// 범위 구하는 함수
		minus(n_arr);
		
			
	}

	private static ArrayList foundIndex(int[] counting, int max, ArrayList found_list) {
		//리스트 사이즈가 2개이상이라면 정렬해서 가장 작은값 -> 2번째값 가져오기 list.get[1];
		for (int i = 0; i < counting.length; i++) {
			if( counting[i] == max ) found_list.add(i-4000);
		}
		return found_list;
		
	}
	
	
	private static void minus(int[] n_arr) {
		System.out.println(n_arr[n_arr.length-1] - n_arr[0]);
		
	}
	
	private static void avg(int[] n_arr, int n) {
		double sum = 0;
//		float float_n = n;
		for (int i = 0; i < n_arr.length; i++) {
			sum += n_arr[i];
		}
		System.out.println(Math.round(sum/n));
		
	}
	
	private static void middle(int[] n_arr, int n) {
		// 리턴값 줄지 안줄지는 ??
		int middle = (int)Math.ceil(n/2);
		System.out.println(n_arr[middle]);
	}

}


