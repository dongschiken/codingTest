package 백준문제_브론즈;

import java.util.Scanner;

public class 백준_10870_피보나치 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if( n == 0) {
			System.out.println(0);
			return;
		}
		long fibo = 1 ;
		long fibo2 = 0;
		long temp = 0;
		for (int i = 1; i < n; i++) {
			temp = fibo;
			fibo = fibo + fibo2;
			fibo2 = temp;
			
		}
		System.out.println(fibo);
		
		
		
		
	}

}
