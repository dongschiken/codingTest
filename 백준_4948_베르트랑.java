package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 백준_4948_베르트랑 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 소수 구하기 + 배열만들기 + 몇개인지 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 1;
		int double_x = 0;
		while ((x = Integer.parseInt(br.readLine())) != 0) {
				
			double_x = x * 2;
			solution(x, double_x);
		}

	}
	// 1 2
	// 11 12 13 14 15 16 17 18 19 20
	private static void solution(int x, int double_x) {
		int[] x_arr = new int[double_x+1];
		for (int i = 0; i < x_arr.length; i++) {
			x_arr[i] = i;
		}
		for (int i = 2; i <= x_arr.length; i++) {
			for (int j = i+i; j < x_arr.length; j += i) {
				if( x_arr[i] == 0) {
					break;
				}
				if(j % i == 0){
					x_arr[j] = 0;
				}
			}
		}
		int count = 0;
		for (int i = x+1; i < x_arr.length; i++) {
			if( x_arr [i] != 0) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
