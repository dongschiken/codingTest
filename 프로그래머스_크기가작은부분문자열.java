package 백준문제_브론즈;

import java.util.Arrays;

public class 프로그래머스_크기가작은부분문자열 {

	public static void main(String[] args) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		// 314 , 141, 415, 159, 592
		String t = "102030000025";	String p = "15000";
		int answer = 0;
		String[] check_arr = new String[ t.length()-(p.length()-1)];
		for (int i = 0; i < t.length()-(p.length()-1); i++) {
			check_arr[i] = "";
			for (int j = 0; j < p.length(); j++) {
				check_arr[i] += ""+t.charAt(i+j);
			}
		}
		
		for (int i = 0; i < check_arr.length; i++) {
			if(Long.parseLong(p) >= Long.parseLong(check_arr[i])) {
				answer++;
			}
		}
		System.out.println(answer);
	}

}
