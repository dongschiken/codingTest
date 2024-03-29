package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_1120_문자열 {

	public static void main(String[] args) throws IOException {
		/*
		문자열 성공
		시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
		2 초	128 MB	19776	11206	9772	58.229%
		문제
		길이가 N으로 같은 문자열 X와 Y가 있을 때, 두 문자열 X와 Y의 차이는 X[i] ≠ Y[i]인 i의 개수이다. 예를 들어, X=”jimin”, Y=”minji”이면, 둘의 차이는 4이다.

		두 문자열 A와 B가 주어진다. 이때, A의 길이는 B의 길이보다 작거나 같다. 이제 A의 길이가 B의 길이와 같아질 때 까지 다음과 같은 연산을 할 수 있다.

		A의 앞에 아무 알파벳이나 추가한다.
		A의 뒤에 아무 알파벳이나 추가한다.
		이때, A와 B의 길이가 같으면서, A와 B의 차이를 최소로 하는 프로그램을 작성하시오.

		입력
		첫째 줄에 A와 B가 주어진다. A와 B의 길이는 최대 50이고, A의 길이는 B의 길이보다 작거나 같고, 알파벳 소문자로만 이루어져 있다.

		출력
		A와 B의 길이가 같으면서, A와 B의 차이를 최소가 되도록 했을 때, 그 차이를 출력하시오.

		예제 입력 1 
		adaabc aababbc
		예제 출력 1 
		2
		예제 입력 2 
		hello xello
		예제 출력 2 
		1
		예제 입력 3 
		koder topcoder
		예제 출력 3 
		1
		예제 입력 4 
		abc topabcoder
		예제 출력 4 
		0
		예제 입력 5 
		giorgi igroig
		예제 출력 5 
		6
		*/
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		String str2 = st.nextToken();

		int count = 0;
		// 한문자씩 비교하면서 앞에 먼저 더하기 -> 뒤에 더하기
		// 차이가 최소인놈을 뽑기 min값으로 계속 비교
		if( str.length() == str2.length()) {
			for (int i = 0; i < str.length(); i++) {
				if((str.charAt(i) != str2.charAt(i))) {
					count++;
				}
			}
		}else {
			count = compare_solution(str, str2);
		}

		System.out.print(count);

	}
	
	
	//abc topabcoder
	private static int compare_solution(String str, String str2) {
		int[] index_arr = new int[str.length()];
		int[] temp_index_arr = new int[str.length()];	
		int max = 0;
		int count = 0;
		// str2는 str의 길이에서 1뺀값까지 비교
		for (int i = 0; i < str2.length()-(str.length()-1); i++) {
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == str2.charAt(j+i)){				
					count++;
				}
				index_arr[j] = j+i;
			}
			max = Math.max(max, count);
			
			if( max == count ) {
				for (int j = 0; j < temp_index_arr.length; j++) {
					temp_index_arr[j] = index_arr[j];
				}
			}
			count = 0;
		}
		//wegar asdfwegargrgarege
		//	    asdfwegargrgarege 	4,5,6,7,8
		// 같은값이 최대일때의 str2의 index를 가져와서 str과 str2(index)를 비교해나가면서 다른값이 있을때 count++
		// 어차피 나머지 문자열은 비교할 필요가 없다. 왜냐면 어차피 str2에 해당하는 문자열 대입해버리면 그만
		for (int k = 0; k < temp_index_arr.length; k++) {
			if(str.charAt(k) != str2.charAt(0+temp_index_arr[k])){
				count++;
			}	
		}
		return count;
	}
}
