package 백준문제_브론즈;

import java.util.Arrays;
import java.util.Scanner;

public class 백준_1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		시간 제한 2 초
		메모리 제한 128 MB	
		제출 270567	
		정답 107571\
		맞힌 사람	84981
		정답 비율 39.630%

		문제
		알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
		단, 대문자와 소문자를 구분하지 않는다.

		입력
		첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

		출력
		첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

		예제 입력 1 
		Mississipi
		예제 출력 1 
		?

		예제 입력 2 
		zZa
		예제 출력 2 
		Z

		예제 입력 3 
		z
		예제 출력 3 
		Z

		예제 입력 4 
		baaa
		예제 출력 4 
		A

		 */

		Scanner sc = new Scanner(System.in);
		String n = sc.next().toUpperCase();
		char[] ch = n.toCharArray();
		int[] nArr = new int[26];

		for (int i = 0; i < n.length(); i++) {
			nArr[ch[i]-65]++;
		}
		int max = -1;
		char ch1= '?';
		
		
		for (int i = 0; i < 26; i++) {
			if (nArr[i] > max) {
				max = nArr[i];
				ch1 = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
			}
			else if (nArr[i] == max) {
				ch1 = '?';
			}
		}
		System.out.println(ch1);
		
//		for (int i = 0; i < nArr.length-1; i++) {
//			int index = i;
//			for (int k = i+1; k < max.length; k++) {
//				if(nArr[index] < nArr[k]) {
//					if(max[index] == k) System.out.println("?"); return;
//				}else {
//					max[i] = k;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(max));
		


	}

	

}
