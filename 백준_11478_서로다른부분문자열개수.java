package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
<<<<<<< HEAD
=======
import java.util.ArrayList;
>>>>>>> 9604b69c19a760bf13d43cf96f01d04e7e02dc54
import java.util.HashSet;

public class 백준_11478_서로다른부분문자열개수 {

	public static void main(String[] args) throws IOException {
<<<<<<< HEAD
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<String> hs = new HashSet<String>();
		int count = 0;
		String S = br.readLine();
		int str_length =  S.length();
		

			for (int i = 0; i < str_length; i++) {
				for (int j = i; j < str_length; j+= 1) {
					 hs.add(S.substring(j-i, j+1));
				}
			}
			System.out.println(hs.size());
=======
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
>>>>>>> 9604b69c19a760bf13d43cf96f01d04e7e02dc54

	}

}
