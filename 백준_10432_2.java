package 백준문제_브론즈;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 백준_10432_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		ArrayList list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int start = 900;
		int start2 = 900;
		int sum = 0;
		ArrayList check = new ArrayList();
		for (int i = 0; i < n; i++) {
			sum = 0;
			for (int j = 0; j < 21; j++) {
				// 인덱스 값 0~19번
				//919 918 917 916 915 914 913 912 911 910 909 908 907 906 905 904 903 902 901 900
				check.add(start2);
				start2++;
				list.add(sc.nextInt());
			}
			start2 = 0;
			// list 1번부터 19번까지 비교
			check.remove(20);
			list.remove(0);
			for (int j = 0; j <20; j++) {
				for (int x = 0; x < 20; x++) {
					if(list.get(x).equals(start)) {
						sum +=x;
						list.remove(x);
						list.add(start);
						if(list.equals(start2)) {
							System.out.println(sum);
						}
					}
				}
				start++;
			}
		}
	}
}



// 출력 생각 x
// list 에 내가 원하는 숫자가 들어있는지 contain해서 인덱스 값 가져와서 +
// 