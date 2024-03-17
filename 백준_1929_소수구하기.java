package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 백준_1929_소수구하기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 출력을 s_number부터 출력


		// 소수 : 약수가 자신과 1밖에 없는 숫자
		// 11 ==> 1, 11		  ( 소수 o )
		// 10 ==> 1, 2, 5, 10 ( 소수 x )
		//		long start = System.currentTimeMillis();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s_number = Integer.parseInt(st.nextToken());
		int e_number = Integer.parseInt(st.nextToken());
		int[] num_arr = new int[e_number+1];
		for (int i = 2; i <= e_number; i++) {
			num_arr[i] = i;
		} 
		// 2부터 e_number까지 반복하면서 num_arr[i]가 0으로 바뀌어 있으면 continue;
		for (int i = 2; i <= e_number; i++) {
			if(num_arr[i] == 0) continue;
			// i+i index를 0으로 바꿔준다. i를 계속 더해준다. e_number까지
			// i가 2일때 i+i = 4 => num_arr[4]를 0으로 바꾼다. 
			// i+i+i => num_arr[6]을 0으로 바꾼다...계속 반복 
			for (int j = i+i; j <= e_number; j += i) {
				num_arr[j] = 0;
			}
		}

		// 출력을 s_number부터 출력
		for (int i = s_number; i <= e_number; i++) {
		if(num_arr[i] != 0) {
			bw.write(num_arr[i]+"\n");
		}
	}
		bw.flush();
    	bw.close();
    	br.close();
		
	}

}

