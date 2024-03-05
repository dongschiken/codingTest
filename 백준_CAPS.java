package 백준_브론즈문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 백준_CAPS {

	public static void main(String[] args) throws IOException {
		
	//		Scanner sc = new Scanner(System.in);
	//		String str = sc.nextLine();
	//		System.out.println(str.toUpperCase());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 4; j++) {
				sum +=Integer.parseInt(st.nextToken());
			}
			sb.append(sum);
			sum = 0;
			switch (sb.substring(i)) {
			case "4":
				System.out.println("E");
				break;
			case "3":
				System.out.println("A");
				break;
			case "2":
				System.out.println("B");
				break;
			case "1":
				System.out.println("C");
				break;
			default:
				System.out.println("D");
				break;
			}
		}		
	}
}
