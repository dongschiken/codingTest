package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class 백준_2346_풍선터뜨리기2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayDeque<int[]> balloons = new ArrayDeque<int[]>();
		
		int balloon_count = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < balloon_count; i++) {
			balloons.add(new int[] {i, Integer.parseInt(st.nextToken())});
		}
		
		// int[0] = index
		// int[1] = 풍선의 번호
		
		int[] balloon = balloons.pollFirst();
		
		int index = balloon[0];
		int balloon_num = balloon[1];
		bw.write((balloon[0]+1) + " ");
		while (balloons.size() > 1) {
			if(balloon_num > 0) {
				for (int i = 0; i < balloon_num-1; i++) {
				   balloons.offerLast(balloons.pollFirst())	;
				}
				balloon = balloons.pollFirst();
			}else {
				balloon_num = Math.abs(balloon_num);
				for (int i = 0; i < balloon_num-1; i++) {
					balloons.offerFirst(balloons.pollLast());
				}
				balloon = balloons.pollLast();
			}
			bw.write((balloon[0]+1) + " ");
			balloon_num = balloon[1];
		}
		
		balloon = balloons.poll();
		bw.write((balloon[0]+1) + " ");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
