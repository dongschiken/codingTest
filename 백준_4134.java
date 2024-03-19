package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 백준_4134 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		long test_case = Long.parseLong(br.readLine());
		long check_num = 0;
		while (test_case > 0) {
			check_num = Long.parseLong(br.readLine());
			while (true) {			
				if(prime_num_sol(check_num)) {
					sb.append(check_num).append("\n");
					break;
				}
				check_num++;
			}
			test_case--;
		}
		System.out.println(sb);
		br.close();

		
	}

	private static boolean prime_num_sol(long check_num) {
		boolean sol = true;
		if(check_num < 2) {
			return sol = false;
		}
		// 여기서 return을 안넣어서 시간초과가 계속 걸림
		// 원래는 sol = false만 했는데
//		check_num = (long) Math.sqrt(check_num);
		for (long j = 2; j <= Math.sqrt(check_num); j++) {
			if(check_num % j == 0) {
				return sol = false;
			}
		}
		return sol;
	}

}
