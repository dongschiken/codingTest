package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 연습장 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer("");
		st.nextToken();
		st.hasMoreTokens();
		
		StringBuilder sb = new StringBuilder();
		
		while (sc.hasNext()) {
			sb.append(sc.nextLine()+"\n");
		}
		
		sc.close();
		System.out.println(sb);	
	}
}
