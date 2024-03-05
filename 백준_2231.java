package 백준_브론즈문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_2231 {
	
	public static void main(String[] args) throws IOException, NumberFormatException{
		/*
		분해합 성공다국어
		시간 제한 2 초		
		메모리 제한 192 MB	
		제출 148688	
		정답 68733	
		맞힌 사람 54047	
		정답 비율 45.418%
						
		문제
		어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다. 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다. 물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.

		자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.

		입력
		첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.

		출력
		첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.

		예제 입력 1 
		216
		예제 출력 1 
		198
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 자연수 n
		int n = Integer.parseInt(br.readLine());
		// temp는 분해합을 더해서 n이 되는지를 체크할 변수, s는 분해합에서 완전한 정수형태 ex) 216 => 198(s)
		int s = 0;
		int temp = 0;
		 StringBuilder sb = new StringBuilder();
		// arr = 분해합에서 한자리 정수를 담아줄 배열
		int[] arr = null;
		while(true) {
			sb.append(s+"");
			arr = new int[sb.length()];
			for (int i = 0; i < sb.length(); i++) {
				arr[i] = Integer.parseInt( sb.substring(i, i+1));
			}
			// s가 0부터 시작해서 분해합 찾을때 까지 반복 // 한자리 정수 arr[i]를 temp에 더해주기
			for (int i = 0; i < arr.length; i++) {
				temp += arr[i];
			}
			temp += s;
			
			if(temp == n) break;
			if(s > n) {
				s = 0;
				break;
			}
			s++;
			temp = 0;
			sb.delete(0, sb.length());
		}
		System.out.println(s);
	}
}
