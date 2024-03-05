package 백준_브론즈문제;

import java.util.Iterator;
import java.util.Scanner;

public class 백준_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		double[] n = new double[m];
		double x = n.length;
		// 3 2 1
		for (int i = 0; i < x; i++) {
			n[i] = sc.nextDouble();
		}
		
		double max = n[0];
		for(int j = 1; j<x; j++){
			if(max < n[j]) max = n[j];
		}
		double sum = 0;
		for (int i = 0; i < n.length; i++) {
		sum+=((double)n[i]/max)*100;
		}
		double x1 = (double)sum/(double)x;
		System.out.println(x1);
		
	}

}

