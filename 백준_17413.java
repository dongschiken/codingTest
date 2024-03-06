package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 백준_17413 {

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		ArrayList list = new ArrayList();
		Queue queue = new LinkedList();
		String str_line = br.readLine();
		String change_str = new String();
		String[] str = new String[str_line.length()];
		
		for (int i = 0; i < str_line.length(); i++) {
			queue.offer(str_line.substring(i, i+1));
		}
		// <open><close>
		OUT :
		while(!queue.isEmpty()) {
			if((str_line = (String)queue.poll()).equals("<")) {
				change_str += str_line;
				while (!((str_line = (String)queue.poll()).equals(">"))) {
					change_str += str_line;
				}
				change_str += str_line;
			}else {
				while (!((str_line = (String)queue.poll()).equals(" "))) {
					if(str_line.equals("<")) {
						sb.reverse();
						change_str += sb.substring(0, sb.length());
						sb.delete(0, sb.length());
						queue.offer(str_line);
						continue OUT;
					}
					sb.append(str_line);
				}
				sb.reverse();
				sb.append(str_line);
				change_str += sb.substring(0, sb.length());
				sb.delete(0, sb.length());
			}
		}
		System.out.println(change_str);
	}

}
