package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 백준_5635_생일 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		생일 성공다국어
		시간 제한  1 초		 
		메모리 제한 128 MB	 
		제출	 11999
		정답	 7966
		맞힌 사람	7094
		정답 비율  68.561%
						
		문제
		어떤 반에 있는 학생들의 생일이 주어졌을 때, 가장 나이가 적은 사람과 가장 많은 사람을 구하는 프로그램을 작성하시오.

		입력
		첫째 줄에 반에 있는 학생의 수 n이 주어진다. (1 ≤ n ≤ 100)

		다음 n개 줄에는 각 학생의 이름과 생일이 "이름 dd mm yyyy"와 같은 형식으로 주어진다. 
		이름은 그 학생의 이름이며, 최대 15글자로 이루어져 있다. dd mm yyyy는 생일 일, 월, 연도이다. 
		(1990 ≤ yyyy ≤ 2010, 1 ≤ mm ≤ 12, 1 ≤ dd ≤ 31) 주어지는 생일은 올바른 날짜이며, 연, 월 일은 0으로 시작하지 않는다.

		이름이 같거나, 생일이 같은 사람은 없다.

		출력
		첫째 줄에 가장 나이가 적은 사람의 이름, 둘째 줄에 가장 나이가 많은 사람 이름을 출력한다.

		예제 입력 1 
		5
		Mickey 1 10 1991
		Alice 30 12 1990
		Tom 15 8 1993
		Jerry 18 9 1990
		Garfield 20 9 1990
		예제 출력 1 
		Tom
		Jerry
		*/
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int std_count = Integer.parseInt(br.readLine());
		String[] temp = new String[4];
		StringTokenizer st = null;
		String[] std_arr = new String[std_count];
		String[] temp_arr = new String[std_count];	
		int index = 0;
		int j = 0;
		
		for (int i = 0; i < std_arr.length; i++) {
			temp_arr[i] = br.readLine();
			st = new StringTokenizer(temp_arr[i]);
			while (st.hasMoreTokens()) {
				temp[j] = st.nextToken();
				j++;
			}
			j=0;
			if( temp[2].length() == 1) {
				temp[2] = "0"+temp[2];
			}
			if( temp[1].length() == 1) {
				temp[1] = "0"+temp[1];
			}
			std_arr[i]= temp[3] + temp[2] + temp[1] + temp_arr[i];			
			
		}
		Arrays.sort(std_arr, Comparator.reverseOrder());
		index = std_arr[0].indexOf(" ");
		System.out.println(std_arr[0].substring(8, index+1));
		index = std_arr[std_arr.length-1].indexOf(" ");
		System.out.println(std_arr[std_arr.length-1].substring(8, index+1));
		
	}

}
// 단어뒤집기, 단어뒤집기2, 생일, 전국대학생프로그래밍대회동아리연합