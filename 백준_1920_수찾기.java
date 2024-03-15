package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 백준_1920_수찾기 {

	public static void main(String[] args) throws IOException, NumberFormatException {
		
		
		/*
		수 찾기 성공
		시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
		1 초	128 MB	251458	77850	51625	30.016%
		문제
		N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.

		입력
		첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다. 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.

		출력
		M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.

		예제 입력 1 
		5
		4 1 5 2 3
		5
		1 3 7 9 5
		예제 출력 1 
		1
		1
		0
		0
		1
		*/
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] n_arr = new int[n];
		// 숫자 찾을 배열 n개만큼 받기
		for (int i = 0; i < n_arr.length; i++) {
			n_arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(n_arr);
		int a = Integer.parseInt(br.readLine());
		int[] target = new int[a];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		// 찾아질 target 넘버 a개 만큼 받기
		// 여기서 target을 int값으로 계속 생성했는데 시간초과 나서 int[]로 선언
		for (int i = 0; i < target.length; i++) {
			target[i] = Integer.parseInt(st2.nextToken());
			int b = binarySearch(n_arr, target, i); 
//			int b = Arrays.binarySearch(n_arr, target[i]);
			
			bw.write(b + "\n");
			bw.flush();
		}
		br.close();
		bw.close();		
	}
	
	private static int binarySearch(int[] n_arr, int[] target, int i) {
		// row는 항상 첫번째 숫자 0
		int row = 0;
		int middle = 0;
		int high = n_arr.length-1;
		// middle은 row + (high - row)한 값 ==> (row + high) / 2 해도 상관없을것 같다. 
		while (row <= high) {
			middle = row + (high - row)/2;
			if(target[i] == n_arr[middle]) return 1;
			// target이 n_arr[middle]보다 크면 찾기 시작하는 값(row)에 middle + 1(기존 middle값보다 1개 큰값으로 설정), 작으면 그 반대
			if(target[i] > n_arr[middle]) {
				row = middle + 1;
			} else{
				high = middle - 1;
			}
		}
		return 0;
		
		
	}

}
