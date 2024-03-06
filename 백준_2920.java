package 백준문제_브론즈;

import java.util.Scanner;

public class 백준_2920 {

	public static void main(String[] args) {
		
		/*
		시간 제한 1 초	
		메모리 제한 128 MB	
		제출 97934	
		정답 54372	 
		맞힌 사람 47227
		정답 비율 56.769%
						
		문제
		다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.

		1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.

		연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.

		입력
		첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.

		출력
		첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.

		예제 입력 1 
		1 2 3 4 5 6 7 8
		예제 출력 1 
		ascending
		예제 입력 2 
		8 7 6 5 4 3 2 1
		예제 출력 2 
		descending
		예제 입력 3 
		8 1 7 2 6 3 5 4
		예제 출력 3 
		mixed
		*/
		
		Scanner sc = new Scanner(System.in);
		String A = "";
		// 숫자로 받아서 공백을 제거하는 방법
		// for문 돌려서 8개 숫자로 받으면 된다.
		// 공백은 들어오면 안되니까 숫자로 받기
		int[] m = new int[8];
		for (int i = 0; i <m.length; i++) {
			m[i] = sc.nextInt();
		}
		// 배열m의 숫자값을 다시 String값으로 만들기 위해 ""를 더해준다.
		for (int i = 0; i < m.length; i++) {
			A += m[i]+"";
		}
		// switch문 사용해서 정수형으로 변환된 A를 매칭시켜서 출력
		switch (Integer.parseInt(A)) {
		case 12345678:
			System.out.println("ascending");
			break;
		case 87654321:
			System.out.println("descending");
			break;
		default:
			System.out.println("mixed");
			break;
		}

		
	}
	
}
