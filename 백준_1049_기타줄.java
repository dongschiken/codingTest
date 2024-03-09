package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 백준_1049_기타줄 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int member_num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] counting = new int[26];
		String pull_name = new String();
		int count = 0;
		for (int i = 0; i < member_num; i++) {
			pull_name = br.readLine();
			counting[pull_name.charAt(0)-97]++;
		}
		for (int i = 0; i < counting.length; i++) {
			if(counting[i] >= 5) {
				sb.append((char)(i+97)); 
				count++;
			}
		}
		if(count == 0) {
			System.out.println("PREDAJA");
		}else {
			System.out.println(sb);
		}
		
	}

}
