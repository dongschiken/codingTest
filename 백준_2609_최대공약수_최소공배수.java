package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


/**
 * 1934_최소공배수
 * 13241_최소공배수 3문제 모두 풀수있는 로직
 */
public class 백준_2609_최대공약수_최소공배수 {
	
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		while (count < n) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long max = Integer.parseInt(st.nextToken());
			long min = Integer.parseInt(st.nextToken());
			long max_temp = Math.max(max, min);
			long min_temp = Math.min(max, min);
			max = max_temp;
			min = min_temp;
			long minimal = 0;
			long mod_temp = 0;
			do {
				mod_temp = max%min;
				max = min;
				min = mod_temp;
			} while (mod_temp > 0);
			minimal = max_temp*min_temp/max;
//			System.out.println(max);
			System.out.println(minimal);
			count++;
		}
		
		
	}

}

