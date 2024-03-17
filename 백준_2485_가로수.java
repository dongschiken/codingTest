package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class 백준_2485_가로수 {

	public static void main(String[] args) throws IOException, NumberFormatException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
		int tree_count = Integer.parseInt(br.readLine());
		int temp = 0;
		ArrayList tree_list = new ArrayList(10000000);

		int[] arrs = new int[10];
		
		for (int i = 0; i < tree_count; i++) {
			tree_list.add(Integer.parseInt(br.readLine()));
		}



		// 홀수가 시작일때
		if( (int)tree_list.get(0)%2 == 1) {
			solution1(tree_list, temp);
			// 짝수가 시작일때
		}else {
			solution2(tree_list, temp);
		}

	}

	private static void solution2(ArrayList tree_list, int temp) {
		long start = System.currentTimeMillis();
		int count = 0;
		temp = 2;
		int size = (int)tree_list.size();
		while (temp <(int)tree_list.get(size-1)) {
			if(!tree_list.contains(temp)) {
				tree_list.add(temp);
				count++;
			}
			temp +=2;
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println(count);

	}

	private static void solution1(ArrayList tree_list, int temp) {
		int count = 0;
		temp = 1;
		int size = (int)tree_list.size();
		while (temp <(int)tree_list.get(size-1)) {
			if(!tree_list.contains(temp)) {
				tree_list.add(temp);
				count++;
			}
			temp +=2;
		}
		System.out.println(count);

	}

}
