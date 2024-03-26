package 백준문제_브론즈;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class 프로그래머스_둘만의암호 {

	public static void main(String[] args) {
		System.out.println((char)('{' -  26) );
		String s = "ybcde";
		String skip = "az";
		int index = 1;
		//bcdef
		String result = solution(s, skip, index);
		System.out.println(result);
	}
	 public static String solution(String s, String skip, int index) {
	        String answer = "";
	        int sLength = s.length();
	        char[] s_char = new char[sLength];
	        ArrayList<Character> ch_list = new ArrayList<Character>(skip.length());
	        for (int i = 0; i < s_char.length; i++) {
				s_char[i] = s.charAt(i);
			}
	        for (int i = 0; i < skip.length(); i++) {
				ch_list.add(skip.charAt(i));
			}
	        // s의 길이만큼 for문
	        // index만큼 for 문을 ++돌리다가 skip문자가 나오면 skip
	        // z가 나오면 --26
	        for (int i = 0; i < sLength; i++) {
				for (int j = 0; j < index; j++) {
					s_char[i] = (char)(s_char[i]+1);
					if(ch_list.contains(s_char[i]) ) {
						j--;
					}
					if( s_char[i] == '{') {
						s_char[i] = (char) (s_char[i]-26);
						
					}				
				}
			}
	        
	       for (int i = 0; i < s_char.length; i++) {
			answer += ""+s_char[i];
		}
	        return answer;
	    }

}
