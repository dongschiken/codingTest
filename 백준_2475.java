package 백준_브론즈문제;

import java.util.Scanner;

public class 백준_2475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] n = new int[5];
		int sum = 0;
		for (int i = 0; i <n.length; i++) {
			n[i] = sc.nextInt();
			sum += n[i]*n[i];
		}
		System.out.println(sum%10);
		
	}

}
