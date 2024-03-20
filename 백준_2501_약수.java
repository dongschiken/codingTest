package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_2501_약수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int number = Integer.parseInt(st.nextToken());
		int count_num = Integer.parseInt(st.nextToken());
		int remaind_num = 1;
		int count = 0;
		while (remaind_num <=  number) {
			
			if( number % remaind_num == 0 ) {
				count++;
			}
			if ( count == count_num) {
				break;
			}
			remaind_num++;
		}
		if (count == count_num) {
			System.out.println(remaind_num);
		}else {
			System.out.println(0);
		}
	}
}
