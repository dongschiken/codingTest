package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_10798 {

	public static void main(String[] args) throws IOException {
		
		/*
		시간 제한	1 초
		메모리 제한 256 MB		
		제출 61238	
		정답 29862	
		맞힌 사람 25646	
		정답 비율 49.517%
						
		문제
		아직 글을 모르는 영석이가 벽에 걸린 칠판에 자석이 붙어있는 글자들을 붙이는 장난감을 가지고 놀고 있다. 

		이 장난감에 있는 글자들은 영어 대문자 ‘A’부터 ‘Z’, 영어 소문자 ‘a’부터 ‘z’, 숫자 ‘0’부터 ‘9’이다. 영석이는 칠판에 글자들을 수평으로 일렬로 붙여서 단어를 만든다. 다시 그 아래쪽에 글자들을 붙여서 또 다른 단어를 만든다. 이런 식으로 다섯 개의 단어를 만든다. 아래 그림 1은 영석이가 칠판에 붙여 만든 단어들의 예이다. 

		A A B C D D
		a f z z 
		0 9 1 2 1
		a 8 E W g 6
		P 5 h 3 k x
		<그림 1>

		한 줄의 단어는 글자들을 빈칸 없이 연속으로 나열해서 최대 15개의 글자들로 이루어진다. 또한 만들어진 다섯 개의 단어들의 글자 개수는 서로 다를 수 있다. 

		심심해진 영석이는 칠판에 만들어진 다섯 개의 단어를 세로로 읽으려 한다. 세로로 읽을 때, 각 단어의 첫 번째 글자들을 위에서 아래로 세로로 읽는다. 다음에 두 번째 글자들을 세로로 읽는다. 이런 식으로 왼쪽에서 오른쪽으로 한 자리씩 이동 하면서 동일한 자리의 글자들을 세로로 읽어 나간다. 위의 그림 1의 다섯 번째 자리를 보면 두 번째 줄의 다섯 번째 자리의 글자는 없다. 이런 경우처럼 세로로 읽을 때 해당 자리의 글자가 없으면, 읽지 않고 그 다음 글자를 계속 읽는다. 그림 1의 다섯 번째 자리를 세로로 읽으면 D1gk로 읽는다. 

		그림 1에서 영석이가 세로로 읽은 순서대로 글자들을 공백 없이 출력하면 다음과 같다:

		Aa0aPAf985Bz1EhCz2W3D1gkD6x

		칠판에 붙여진 단어들이 주어질 때, 영석이가 세로로 읽은 순서대로 글자들을 출력하는 프로그램을 작성하시오.

		입력
		총 다섯줄의 입력이 주어진다. 각 줄에는 최소 1개, 최대 15개의 글자들이 빈칸 없이 연속으로 주어진다. 주어지는 글자는 영어 대문자 ‘A’부터 ‘Z’, 영어 소문자 ‘a’부터 ‘z’, 숫자 ‘0’부터 ‘9’ 중 하나이다. 각 줄의 시작과 마지막에 빈칸은 없다.

		출력
		영석이가 세로로 읽은 순서대로 글자들을 출력한다. 이때, 글자들을 공백 없이 연속해서 출력한다. 

		예제 입력 1 
		ABCDE
		abcde
		01234
		FGHIJ
		fghij
		예제 출력 1 
		Aa0FfBb1GgCc2HhDd3IiEe4Jj
		예제 입력 2 
		AABCDD
		afzz
		09121
		a8EWg6
		P5h3kx
		예제 출력 2 
		Aa0aPAf985Bz1EhCz2W3D1gkD6x
		*/
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String child = "";
		char[][] ch = new char[15][15];
		// 15개 받으면서 문자열 더이상 없으면 그냥 공백으로 남긴다.
		
		for (int i = 0; i <5; i++) {
			child = br.readLine();			
			for (int j = 0; j <child.length(); j++) {
				ch[i][j] = child.charAt(j);
			}
		}
		 //j의 값이 ch[][]의 길이보다 짧으면 continue하자
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				if(ch[j][i] == '\0')continue;
				System.out.print(ch[j][i]);
			}
		}
		
		/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[][] ch = new char[15][15];
		// 15개 받으면서 문자열 더이상 없으면 그냥 공백으로 남긴다.
		
		for (int i = 0; i <5; i++) {
//			child = br.readLine();
			sb.append(br.readLine());			
			for (int j = 0; j < sb.length(); j++) {
				ch[i][j] = sb.charAt(j);
			}
			sb.delete(0,sb.length());
		}
		 //j의 값이 ch[][]의 길이보다 짧으면 continue하자
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				if(ch[j][i] == '\0')continue;
				System.out.print(ch[j][i]);
			}
		}
    }
}      
		 */

		
		
		
		
	}

}
