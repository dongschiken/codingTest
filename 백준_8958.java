package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 백준_8958 {

	public static void main(String[] args) {
		/*
		OX퀴즈 다국어
		시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
		1 초	128 MB	218930	110870	91258	50.725%
		문제
		"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.

		"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

		OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

		입력
		첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.

		출력
		각 테스트 케이스마다 점수를 출력한다.

		예제 입력 1 
		5
		OOXXOXXOOO
		OOXXOOXXOO
		OXOXOXOXOXOXOX
		OOOOOOOOOO
		OOOOXOOOOXOOOOX

		예제 출력 1 
		10
		9
		7
		55
		30
		 */
		
		// 일단 ArrayList로 ox문자열 n개를 입력받고
		// while문 돌면서 sb에 한개씩 넣어서 첫번째 문자가 O라면 sum에 count를 더해주고 1씩 증가 그 문자를 delete
		// 만약 X가 나오면 count는 다시 1로 초기화 해주고 
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			// 몇번 반복할지 입력받고
			int n = Integer.parseInt(br.readLine());
			int sum = 0;
			int m = 0;
//			String[] oxStr = new String[n];
			ArrayList<String> oxList = new ArrayList();
			for (int i = 0; i < n; i++) {
				oxList.add(br.readLine());
			}
			while (m < n) {
				StringBuilder sb = new StringBuilder(oxList.get(m));
				int count = 1;
				for (int i = 0; i < oxList.get(m).length(); i++) {
					if(sb.substring(0,1).contains("O")) {
						sum += count++;
						sb.delete(0, 1);
					}else {
						count = 1;
						sb.delete(0, 1);
					}
				}
				System.out.println(sum);
				sum = 0;
				m++;
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}

