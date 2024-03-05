package 백준_브론즈문제;

import java.util.Scanner;

public class 프로그래머스_0단계_문자열합치기 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String s = sc.next();
		int i = sc.nextInt();
		System.out.println(solution(n, s, i));
	}
	public static String solution(String my_string, String overwrite_string, int s) {
		String answer = "";
		int index = overwrite_string.length();
		answer = my_string.substring(0, s) + overwrite_string + my_string.substring(index+s);
		return answer;
	}
}