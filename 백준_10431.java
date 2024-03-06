package 백준문제_브론즈;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class 백준_10431 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] search = { 0, 900, 901, 902, 903, 904, 905, 906, 907, 908, 909, 910, 911, 912, 913, 914, 915, 916, 917, 918, 919};
		int[] student = new int[20];
		int sum = 0;
		int start = 900;
		int count = 1;
		for (int i = 0; i < n; i++) {
			count = sc.nextInt();
			for (int y = 0; y < student.length; y++) {
				// 처음에 0~n까지 넣으면서 한줄 입력받고 2 919 918 917 916 915 914 913 912 911 910 909 908 907 906 905 904 903 902 901 900
				student[y] = sc.nextInt();
				start = 900;
				out:
				for (int j = 0; j < student.length; j++) {
					for (int x = 0; x < student.length; x++) {
						if(student[x] == start) {
							sum += x-1;
							if(Arrays.equals(student, search)) {
								System.out.printf("%d %d", count, sum); break out;
							}
						}
						start++;
						// 정렬이 되어있는 상태라면??
					}
				}
			}
			System.out.printf("%d %d", count, sum);
		
			
		}
	}
}


