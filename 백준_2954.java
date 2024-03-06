package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.Queue;

public class 백준_2954 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		Queue queue = new LinkedList();

		for (int i = 0; i < str.length(); i++) {
			queue.offer(str.substring(i, i+1));
		}
		
		while(!queue.isEmpty()) {
			switch ((str=(String)queue.poll())) {
			case "a": {
				for (int j = 0; j < 2; j++) {
					queue.poll();
				}
				sb.append(str);
			}
			break;
			case "e": {
				for (int j = 0; j < 2; j++) {
					queue.poll();
				}
				sb.append(str);
			}
			break;
			case "i": {
				for (int j = 0; j < 2; j++) {
					queue.poll();
				}
				sb.append(str);
			}
			break;
			case "o": {
				for (int j = 0; j < 2; j++) {
					queue.poll();
				}
				sb.append(str);
			}
			break;
			case "u": {
				for (int j = 0; j < 2; j++) {
					queue.poll();
				}
				sb.append(str);
			}
			break;
			default :
				sb.append(str);
			}
			
			}
		System.out.print(sb);
	}
}
