package 백준_브론즈문제;

import java.util.Scanner;

public class 백준_5073 {

	public static void main(String[] args) {
		/*
		시간 제한 1 초		
		메모리 제한	128 MB
		제출 29211
		정답 13868
		맞힌 사람 12754	
		정답 비율 48.494%
						
		문제
		삼각형의 세 변의 길이가 주어질 때 변의 길이에 따라 다음과 같이 정의한다.

		Equilateral :  세 변의 길이가 모두 같은 경우
		Isosceles : 두 변의 길이만 같은 경우
		Scalene : 세 변의 길이가 모두 다른 경우
		단 주어진 세 변의 길이가 삼각형의 조건을 만족하지 못하는 경우에는 "Invalid" 를 출력한다. 예를 들어 6, 3, 2가 이 경우에 해당한다. 가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 삼각형의 조건을 만족하지 못한다.

		세 변의 길이가 주어질 때 위 정의에 따른 결과를 출력하시오.

		입력
		각 줄에는 1,000을 넘지 않는 양의 정수 3개가 입력된다. 마지막 줄은 0 0 0이며 이 줄은 계산하지 않는다.

		출력
		각 입력에 맞는 결과 (Equilateral, Isosceles, Scalene, Invalid) 를 출력하시오.

		예제 입력 1 
		7 7 7
		6 5 4
		3 2 5
		6 2 6
		0 0 0
		예제 출력 1 
		Equilateral
		Scalene
		Invalid
		Isosceles
		
		*/

		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		String check = "";
		int n = arr.length;
		while(sc.hasNext()){
			for(int i = 0; i < n; i++){
				arr[i] = sc.nextInt();
			}
			int max = arr[0];
			int index = 0; 
			int[] index2 = {1, 2};
			for(int j = 1; j < n; j++){
				if(arr[j] > max){
					index = j; 
					max = arr[j];
					index2[j-1] = j-1;
				}                    
			}
			if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0)break;
			if(arr[0] == arr[1] && arr[1] == arr[2]){
				check = "Equilateral";
			}else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]){
				if(arr[index] > arr[index2[0]] + arr[index2[1]]) {
					check = "Invalid"; 
				}else {
					check = "Isosceles";
				}
			}else{
				if(arr[index] < arr[index2[0]] + arr[index2[1]]){
					check = "Scalene";
				}else {
					check = "Invalid";  
				}
			}
			System.out.println(String.valueOf(check));
		}
	}
}

	