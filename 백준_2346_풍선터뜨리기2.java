package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class 백준_2346_풍선터뜨리기2 {

<<<<<<< HEAD
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
=======
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int balloons_count = Integer.parseInt(br.readLine());
		ArrayDeque<int[]> balloons = new ArrayDeque<int[]>(balloons_count);
		
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < balloons_count; i++) {
			balloons.add( new int[]{ i, Integer.parseInt(st.nextToken())} );
		}
		
		
		// balloons1 0 3
		// balloons2 1 2
		// balloons3 2 1
		// balloons4 3 -3
		// balloons5 4 -1
		// balloon[0] == index
		// balloon[1] == balloon_number
		int[] balloon = balloons.pollFirst();
		bw.write(balloon[0]+1+" ");
		while (balloons.size() > 1) {
			
			if(balloon[1] > 0) {
				for (int i = 0; i < balloon[1]-1; i++) {
					balloons.offerLast(balloons.pollFirst());
				}
				balloon = balloons.pollFirst();
			}else {
				balloon[1] = Math.abs(balloon[1]);
				for (int i = 0; i < balloon[1]-1; i++) {
>>>>>>> 9604b69c19a760bf13d43cf96f01d04e7e02dc54
					balloons.offerFirst(balloons.pollLast());
				}
				balloon = balloons.pollLast();
			}
<<<<<<< HEAD
			bw.write((balloon[0]+1) + " ");
			balloon_num = balloon[1];
		}
		
		balloon = balloons.poll();
		bw.write((balloon[0]+1) + " ");
		
		bw.flush();
		bw.close();
		br.close();
=======
			bw.write(balloon[0]+1+" ");
			
		}
		balloon = balloons.poll();
		bw.write(balloon[0]+1+" ");
		bw.flush();
		

>>>>>>> 9604b69c19a760bf13d43cf96f01d04e7e02dc54
	}

}
