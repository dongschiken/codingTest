package 백준_브론즈문제;

import java.util.Arrays;
import java.util.Scanner;

public class 백준_10809 {
	
	
	public static void main(String[] args) {
		/*
		알파벳 찾기 성공
		시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
		1 초	256 MB	212935	113814	93684	53.209%
		문제
		알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

		입력
		첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

		출력
		각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.

		만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

		예제 입력 1 
		baekjoon
		예제 출력 1 
		1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
		*/
		
		// ch[i] == ch[i+1] 
		// ch[i+1] == ch[i] == =i
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		String s = sc.next();
		char[] ch = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
		}
		// 만약에 arr[ch-97]의 값이 -1이 아니라면 (알파벳이 이미 나온 경우)continue하겠다.
		for (int i = 0; i < ch.length; i++) {
			if(arr[ch[i]-97] != -1)continue;
			arr[ch[i] - 97] = i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
	}
}
