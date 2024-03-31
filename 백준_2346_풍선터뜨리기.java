package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class 백준_2346_풍선터뜨리기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int balloon_count = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<Integer>(balloon_count);
		
		/* StringBuilder sb = new StringBuilder(); */

		// 그 순번의 요소를 찾으면 그것만 체크해서 del_list에 담고 마지막에 2중 루프문 돌면서 같은 숫자 index 출력
		int[] index_arr = new int[balloon_count];
		


		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < index_arr.length; i++) {
			int temp = Integer.parseInt(st.nextToken());
			index_arr[i] = temp;
			list.add(temp);
		}
		
		
		
		
		
		int balloon_number = list.get(0);
		int index = 0;
		while (list.size() >= 1) { 
			list.remove(index);
			for (int i = 0; i < index_arr.length; i++) {
				if( index_arr[i] == balloon_number) {
					bw.write((i+1)+" ");
				}
			}
			if(list.size() == 1)break;
			if(balloon_number > 0) { 
				for (int i = 0; i < balloon_number-1; i++) {
					if(index > list.size()-1) {
						index = 0;
					}
					index++;
				} 
				if(index > list.size()-1) index=0;
				balloon_number = list.get(index);
			}else { 
				balloon_number = Math.abs(balloon_number);
				for (int i = 0; i < balloon_number; i++) {
					if(index < 0) {
						index = list.size()-1;
					}
					index--;
					
				}
				if(index < 0)index = list.size()-1;
				balloon_number = list.get(index);

			}
			
			
		}
		balloon_number = list.get(0);
		for (int i = 0; i < index_arr.length; i++) {
			if( index_arr[i] == balloon_number) {
				bw.write((i+1)+" ");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	
//		10
//		3 2 1 -3 -1 4 -2 -5 5 6
//		1 4 10 7 5 3 6 8 2 9 



	}
}
