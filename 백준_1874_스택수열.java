package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 백준_1874_스택수열 {

	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		int seq_count = Integer.parseInt(br.readLine());
		int[] sequence_arr = new int[seq_count];
		
		for (int i = 0; i < sequence_arr.length; i++) {
			sequence_arr[i] = Integer.parseInt(br.readLine());
		}
		while (stack.isEmpty()) {
			
		}

	}

}
