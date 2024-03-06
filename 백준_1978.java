package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class 백준_1978 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		소수 찾기(테라토스테네스의 체 알고리즘 사용해서 문제풀이)
		시간 제한 2 초	
		메모리 제한 128 MB
		제출 197439	
		정답 93348	
		맞힌 사람 74625	
		정답 비율 47.163%

		문제
		주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

		입력
		첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

		출력
		주어진 수들 중 소수의 개수를 출력한다.

		예제 입력 1 
		4
		1 3 5 7

		예제 출력 1 
		3
		 */
		
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int x = 0;
//		int sum = 0;
//		int count = 0;
//		int y = 0;
//		while (n > x) {
//			y = sc.nextInt();
//			if(y == 1) {
//				x++;
//				continue;
//			}
//			for (int i = 1; i <=10; i++) {
//				if(y % i == 0) {
//					sum++;
//				}
//			}
//			if(y > 10) {
//				if(y % y == 0) {
//					sum++;
//				}
//			}
//			if(sum <= 2) {
//				count++;
//			}
//			sum = 0;
//			x++;
//		}
//		System.out.println(count);
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int x = 0;
		int sum = 0;
		
		// 버퍼드리더의 성능이 얼마나 좋은지 확인해봤는데 엄청 빨라진다..
		// 입력받은 값을 공백을 기준으로 자르고나서 다시 arr[]에 대입
		String[] str = br.readLine().split(" ");
		int[] arr = new int[n];
		for (int i = 0; i < str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}	
		br.close();
		out:
		while (n > x) {
			// 0번방이 1이면 continue
			if(arr[x] == 1) {
				x++;
				continue;
			}
			// 2부터 입력받은 숫자 -1 까지 ex) 10 -> 2~9까지만
			// 비교해서 나눠지는 숫자가 하나라도 있으면 x++하고 continue out;
			for (int i = 2; i < Math.sqrt(arr[x]); i++) {
				if( arr[x] % i == 0) {
					x++;
					continue out;
				}
			}
			sum++;
			x++;
		}
		System.out.println(sum);	
	}
}
