package 백준_브론즈문제;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

public class 백준_11650 {
		// 	 백준_11651
	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		좌표 정렬하기 1은 x와 y의 순서만 바뀌는 문제이므로 같은 문제라고 봐도 무방하다.
		좌표 정렬하기 2 성공
		시간 제한 1 초	
		메모리 제한 256 MB	
		제출 76176	 
		정답 49650	
		맞힌 사람 42353	
		정답 비율 66.855%
							
		문제
		2차원 평면 위의 점 N개가 주어진다. 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.

		입력
		첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. 
		(-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.

		출력
		첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.

		예제 입력 1 
		5
		0 4
		1 2
		1 -1
		2 2
		3 3
		예제 출력 1 
		1 -1
		1 2
		2 2
		3 3
		0 4
		*/
						BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
						int count = 0;
						int n =  Integer.parseInt(br.readLine());
						int[] arr = new int[n];
						int[][] arr2 = new int[n][2];
						while (count < n) {
							StringTokenizer st = new StringTokenizer(br.readLine());
							arr2[count][1] = Integer.parseInt( st.nextToken());
							arr2[count][0] = Integer.parseInt( st.nextToken());
							count++;
						}
						br.close();
						// 람다식을 통해 arr2의 값을 sort (이 식은 나도 이해를 못해서 람다식 정리해야 할듯)
						Arrays.sort(arr2, (e1, e2) -> {
							if(e1[0] == e2[0]) {
								return e1[1] - e2[1];
							} else {
								return e1[0] - e2[0];
							}
						});
						StringBuilder sb = new StringBuilder();
						for (int i = 0; i < arr2.length; i++) {
							sb.append(arr2[i][1]+ " " +arr2[i][0]+"\n");
						}
						System.out.println(sb);
	}
}
