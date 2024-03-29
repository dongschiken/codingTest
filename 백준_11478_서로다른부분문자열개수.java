package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class 백준_11478_서로다른부분문자열개수 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String temp_str = br.readLine();
		char[] alpa = new char[temp_str.length()];
		HashSet<String> duplCheck_set = new HashSet<String>();
		for (int i = 0; i < temp_str.length(); i++) {
			alpa[i] = temp_str.charAt(i) ;
			duplCheck_set.add(temp_str.substring(i,i+1));
		}
		for (int i = 0; i < args.length; i++) {
			duplCheck_set.add(""+alpa[i]);
			
		}

	}

}
