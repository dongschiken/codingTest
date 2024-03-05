package 백준_브론즈문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 백준_2164_카드 {

	public static void main(String[] args) throws IOException, NumberFormatException {
		// 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList();
		for (int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		while (queue.size() != 1) {
			queue.poll();
			queue.offer(queue.poll());
		}
		System.out.println(queue.peek());
	}
}
