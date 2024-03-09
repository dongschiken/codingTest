package 백준문제_브론즈;

import java.math.BigInteger;
import java.util.Scanner;

public class 백준_1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger big = new BigInteger("10");
		StringBuilder sb = null;
		while (n > 0) {
			sb = new StringBuilder();
			int x = sc.nextInt();
			int y = sc.nextInt();
			big = new BigInteger(x+"");
			big = big.pow(y);
			n--;
			sb.append(big);
			sb.reverse();
			System.out.println(sb.substring(0,1));
			big = big.valueOf(0);
		}
	}
}
