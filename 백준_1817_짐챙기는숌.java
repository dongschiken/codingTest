package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_1817_짐챙기는숌 {

	public static void main(String[] args) throws IOException , NumberFormatException {
		
//		5 100
//		51 51 51 51 51
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int book_count = Integer.parseInt(st.nextToken());
		int box_weight = Integer.parseInt(st.nextToken());
		int[] book_weight = new int[book_count];
		int count = 0;
		if(book_count == 0) {
			System.out.println(count);
			return;
		}
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < book_count; i++) {
			book_weight[i] +=  Integer.parseInt(st2.nextToken());
		}
		
		int temp = 0;
		for (int j = 0; j < book_weight.length; j++) {
			temp += book_weight[j];
			if(temp > box_weight) {
				temp = 0;
				count += 2;
			}else if(temp == box_weight) {
				temp = 0;
				count++;
			}
		}
		if( temp > 0) {
			count++;
		}
		System.out.println(count);
		
	}

}
