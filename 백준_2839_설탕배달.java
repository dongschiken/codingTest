package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 백준_2839_설탕배달 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sugar = Integer.parseInt(br.readLine());
		// sugar에 101이 들어오면 sugar_remaind5는 100으로 바꿔준다.
		int sugar_remaind5 = 5*(sugar/5);
		int temp_sugar = sugar;
		int sum = 0;
		// 모든 경우의 수를 전부 나눠야한다.
		// 11만 처리하면 문제 풀수있음
		// 처음에 5를 1개씩++ 하면서 나누고 나머지를 3으로 나눠서 0이면 그 갯수 출력
		// 만약 위의 로직에서 안나눠지면 temp를 3으로 나눈 나머지를 계산하고 0이면 그 몫 출력
		// 만약 위의 모든 로직에 만족 못하면 -1을 출력
//		// 제일 큰수부터 --5 하면서 진행
		for (int i = sugar_remaind5; i >= 5; i -= 5) {
			sum += i/5;
			sugar = sugar-i;
			sum += sugar/3;
			sugar = sugar%3;
			if( sugar == 0 ) {
				System.out.println(sum); return;
			}
			sugar = temp_sugar;
			sum = 0;
		}
		if( sugar % 3 == 0) {
			System.out.println(sugar/3);
		}else {
			System.out.println(-1);
		}
	}
}
