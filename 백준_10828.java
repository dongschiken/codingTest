package 백준_브론즈문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Stack;

public class 백준_10828 {

	public static void main(String[] args) throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack s = new Stack();
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		String str = null;
		while (count < n) {
			
			
			if((str = br.readLine()).contains("push")) {
				s.push(Integer.parseInt(str.substring(5)));
			}else if(str.contains("top")) {
				if(s.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(s.peek());
				}
			}else if(str.contains("pop")) {
				if(s.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(s.pop());
				}
			}else if(str.contains("size")) {
				System.out.println(s.size());
			}else if(str.contains("empty")) {
				if(s.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}
			count++;
		}
		br.close();
	}

}
