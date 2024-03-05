package 백준_브론즈문제;

import java.util.Scanner;

public class 백준_10101 {

	public static void main(String[] args) {
		/*
		삼각형 외우기 성공다국어
		시간 제한 1 초	
		메모리 제한 256 MB	
		제출 35531	
		정답 20373	
		맞힌 사람 18658	
		정답 비율 57.485%
							
		문제
		창영이는 삼각형의 종류를 잘 구분하지 못한다. 따라서 프로그램을 이용해 이를 외우려고 한다.

		삼각형의 세 각을 입력받은 다음, 

		세 각의 크기가 모두 60이면, Equilateral
		세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
		세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
		세 각의 합이 180이 아닌 경우에는 Error
		를 출력하는 프로그램을 작성하시오.

		입력
		총 3개의 줄에 걸쳐 삼각형의 각의 크기가 주어진다. 모든 정수는 0보다 크고, 180보다 작다.

		출력
		문제의 설명에 따라 Equilateral, Isosceles, Scalene, Error 중 하나를 출력한다.

		예제 입력 1 
		60
		70
		50
		예제 출력 1 
		Scalene
		*/
		
		
		Scanner sc = new Scanner(System.in);
		int[] n = new int[3];
		int sum = 0;
		String str = null;
		for (int i = 0; i < 3; i++) {
			n[i] = sc.nextInt();
			sum += n[i];
		}
		System.out.println(sum);
		switch (sum) {
		case 180: {
			if(n[0] == 60 && n[1] == 60 && n[2] == 60) {
				str = "Equilateral";
				break;
			}else if(n[0] == n[1] || n[1] == n[2] || n[2] == n[0]){
				str = "Isosceles";
				break;
			}else {
				str = "Scalene";
			}
		}
		break;
		default:
			str = "Error";
			break;
		}
		System.out.println(str);

	}	

}
