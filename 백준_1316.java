package 백준_브론즈문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class 백준_1316 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		시간 제한	2 초
		메모리 제한 128 MB
		제출 152164	
		정답 80297	
		맞힌 사람 66094	
		정답 비율 53.150%

		문제
		그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

		단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

		입력
		첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

		출력
		첫째 줄에 그룹 단어의 개수를 출력한다.

		예제 입력 1 
		3
		happy
		new
		year
		예제 출력 1 
		3

		예제 입력 2 
		4
		aba
		abab
		abcabc
		a
		예제 출력 2 
		1

		예제 입력 3 
		5
		ab
		aa
		aca
		ba
		bb
		예제 출력 3 
		4

		예제 입력 4 
		2
		yzyzy
		zyzyz
		예제 출력 4 
		0

		예제 입력 5 
		1
		z
		예제 출력 5 
		1

		예제 입력 6 
		9
		0이랑 1을 빼주면 -1 //  1이랑 2를 빼주면 -1
		012
		aaa
		aaazbz
		babb
		aazz
		azbz
		aabbaa
		abacc
		aba
		 */
		// a라고 하면 65니까
		
		// 주석 달아놓기
		// 연속된 문자열을 하나의 문자로 보는방법
		// 그럼 문자가 2개 이상나오면 추가 안하고 continue
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// n에 입력된 값을 숫자로 변환해서 받는다.
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		char c = '0';
		// 문자열을 받을 arr문자열 선언
		String[] arr = new String[n];
		// 문자배열을 가변배열로 선언해서 n개만큼 방을 잡고 []가변배열로 잡아서 
		// 나중에 for문 돌면서 가변배열에 새로운 배열객체 선언해주겠다.
		char[][] ch = new char[n][];
		// 알파벳의 갯수를 체크할 배열 입력받는 n만큼 배열방 잡아서 26 == 'A' ~ 'Z'까지 
		int[][] alpa = new int[n][26];
		// 이름있는 반복문(continue할때 이름붙은곳으로 루프돌고 싶을 때)
		out :
		for (int i = 0; i < n; i++) {
			// 일단 입력받는 값을 전부 대문자로 바꿔서 대문자만 비교하겠다
			// (필요는 없는 코딩인데 그냥 굳이 넣어둠)
			arr[i] = br.readLine().toUpperCase();
			// 가변배열에 새로운 방하나 잡아준다.
			ch[i] = new char[arr[i].length()];
			c = '0';
			// 여기 for문은 돌면서 알파벳이 같은게 있으면 건너띈다.
			// 만약에 aabba이렇게 들어오면 aa가 1번 체크되고 bb가 1번 체크되고 다시 a가 1번 체크되어서
			// alpa[0][]
			for (int j = 0; j < arr[i].length(); j++) {
				if(arr[i].charAt(j) == c) continue;
				// c만들어서 배열값 넣어주고 값이 똑같으면 continue하는 변수 c
				c = arr[i].charAt(j);
				ch[i][j] = arr[i].charAt(j);
				alpa[i][ch[i][j] - 65]++;
			}
			for (int j2 = 0; j2 < alpa[i].length; j2++) {
				// 2이상이 하나라도 있으면 sum++ 안한다는 조건
				if(alpa[i][j2] >= 2 ) continue out;
			}
			sum+=1;
		}
		System.out.println(sum);			
		
	}
}

