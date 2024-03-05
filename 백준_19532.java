package 백준_브론즈문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 백준_19532 {

	public static void main(String[] args) throws IOException, NumberFormatException {
		/*
		수학은 비대면강의입니다 성공
		시간 제한 1 초 (추가 시간 없음)		
		메모리 제한 1024 MB	
		제출 30685	
		정답 15505	
		맞힌 사람 13699	
		정답 비율 51.386%
						
		문제
		수현이는 4차 산업혁명 시대에 살고 있는 중학생이다. 코로나 19로 인해, 수현이는 버추얼 학교로 버추얼 출석해 버추얼 강의를 듣고 있다. 수현이의 버추얼 선생님은 문자가 2개인 연립방정식을 해결하는 방법에 대해 강의하고, 다음과 같은 문제를 숙제로 냈다.

		다음 연립방정식에서 
		$x$와 
		$y$의 값을 계산하시오.
		 
		\[\begin{cases}ax+by=c\\dx+ey=f\end{cases}\] 
		4차 산업혁명 시대에 숙제나 하고 앉아있는 것보다 버추얼 친구들을 만나러 가는 게 더 가치있는 일이라고 생각했던 수현이는 이런 연립방정식을 풀 시간이 없었다. 다행히도, 버추얼 강의의 숙제 제출은 인터넷 창의 빈 칸에 수들을 입력하는 식이다. 각 칸에는 
		$-999$ 이상 
		$999$ 이하의 정수만 입력할 수 있다. 수현이가 버추얼 친구들을 만나러 버추얼 세계로 떠날 수 있게 도와주자.

		입력
		정수 
		$a$, 
		$b$, 
		$c$, 
		$d$, 
		$e$, 
		$f$가 공백으로 구분되어 차례대로 주어진다. (
		$-999 \leq a,b,c,d,e,f \leq 999$)

		문제에서 언급한 방정식을 만족하는 
		$\left(x,y\right)$가 유일하게 존재하고, 이 때 
		$x$와 
		$y$가 각각 
		$-999$ 이상 
		$999$ 이하의 정수인 경우만 입력으로 주어짐이 보장된다.

		출력
		문제의 답인 
		x 와 y를 공백으로 구분해 출력한다.

		예제 입력 1 
		1 3 -1 4 1 7
		예제 출력 1 
		2 -1
		
		예제 입력 2 
		2 5 8 3 -4 -11
		예제 출력 2 
		-1 2
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[6];
		int[] x = new int[2];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt( st.nextToken() );
		}
		//   1  		 3 			  -1  
		// arr[0] * x + arr[1] * y = arr[2]
		//   4 			 1 			   7
		// arr[3] * x + arr[4] * y = arr[5]
		
		// x -999 
		// y 
		for (int i = -999; i <= 999; i++) {
			for (int j = -999; j <= 999; j++) {
				if(arr[0]*i + arr[1]*j == arr[2]) {
					if(arr[3]*i + arr[4]*j == arr[5]) {
						x[0] = i;
						x[1] = j;
					}
				}
			}
		}
		System.out.print(x[0]+" "+x[1]);
	}
}
