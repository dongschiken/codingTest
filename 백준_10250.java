package 백준문제_브론즈;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class 백준_10250 {

	public static void main(String[] args) throws IOException{
		/*
		ACM 호텔
		시간 제한 1 초	
		메모리 제한 256 MB	
		제출 185587	
		정답 63608	
		맞힌 사람 53482	
		정답 비율 33.193%	
							
ACM 호텔 매니저 지우는 손님이 도착하는 대로 빈 방을 배정하고 있다. 고객 설문조사에 따르면 손님들은 호텔 정문으로부터 걸어서 가장 짧은 거리에 있는 방을 선호한다고 한다. 
여러분은 지우를 도와 줄 프로그램을 작성하고자 한다. 즉 설문조사 결과 대로 호텔 정문으로부터 걷는 거리가 가장 짧도록 방을 배정하는 프로그램을 작성하고자 한다.

문제를 단순화하기 위해서 호텔은 직사각형 모양이라고 가정하자. 각 층에 W 개의 방이 있는 H 층 건물이라고 가정하자 (1 ≤ H, W ≤ 99). 
그리고 엘리베이터는 가장 왼쪽에 있다고 가정하자(그림 1 참고). 이런 형태의 호텔을 H × W 형태 호텔이라고 부른다. 호텔 정문은 일층 엘리베이터 바로 앞에 있는데, 
정문에서 엘리베이터까지의 거리는 무시한다. 또 모든 인접한 두 방 사이의 거리는 같은 거리(거리 1)라고 가정하고 호텔의 정면 쪽에만 방이 있다고 가정한다.
방 번호는 YXX 나 YYXX 형태인데 여기서 Y 나 YY 는 층 수를 나타내고 XX 는 엘리베이터에서부터 세었을 때의 번호를 나타낸다. 즉, 그림 1 에서 빗금으로 표시한 방은 305 호가 된다.

손님은 엘리베이터를 타고 이동하는 거리는 신경 쓰지 않는다. 다만 걷는 거리가 같을 때에는 아래층의 방을 더 선호한다. 예를 들면 102 호 방보다는 301 호 방을 더 선호하는데, \
102 호는 거리 2 만큼 걸어야 하지만 301 호는 거리 1 만큼만 걸으면 되기 때문이다. 같은 이유로 102 호보다 2101 호를 더 선호한다.

여러분이 작성할 프로그램은 초기에 모든 방이 비어있다고 가정하에 이 정책에 따라 N 번째로 도착한 손님에게 배정될 방 번호를 계산하는 프로그램이다. 
첫 번째 손님은 101 호, 두 번째 손님은 201 호 등과 같이 배정한다. 그림 1 의 경우를 예로 들면, H = 6이므로 10 번째 손님은 402 호에 배정해야 한다.

입력
프로그램은 표준 입력에서 입력 데이터를 받는다. 프로그램의 입력은 T 개의 테스트 데이터로 이루어져 있는데 T 는 입력의 맨 첫 줄에 주어진다. 
각 테스트 데이터는 한 행으로서 H, W, N, 세 정수를 포함하고 있으며 각각 호텔의 층 수, 각 층의 방 수, 몇 번째 손님인지를 나타낸다(1 ≤ H, W ≤ 99, 1 ≤ N ≤ H × W). 

출력
프로그램은 표준 출력에 출력한다. 각 테스트 데이터마다 정확히 한 행을 출력하는데, 내용은 N 번째 손님에게 배정되어야 하는 방 번호를 출력한다.

예제 입력 1 
2
6 12 10
30 50 72

예제 출력 1 
402
1203
*/
		
		// n은 건물의 높이, m은 건물의 객실 숫자, h에는 몇번째 예약손님인지, x는 몇번 반복했는지 x와 t의 숫자가 같으면 반복이 종료
		// t는 몇번반복 할지 입력받고, y는 마지막에 몇호실에 배정받을지를 대입해서 출력
		// while문을 통해 t에서 입력받은 숫자 만큼 반복, 2중 for문을 통해서 객실에 대해서 입력받고 만약에 n이 2이고 m이 3이라면 
		// arr[0][0] = 101 / arr[0][1] = 201 / arr[1][0] = 102 / arr[1][1] = 202 / arr[2][0] = 103 / arr[2][1] = 203
		// 객실은 이런식으로 저장이 되고 그 밑에는 h만큼 count가 증가하고 두 정수가 같을때는 break 그럼 몇번째 예약손님인지에 따라서 몇호실 배정받을지 입력된다.
		Scanner sc = new Scanner(System.in);
		
		int n = 0, m = 0, h = 0, x = 0;
		int t = 0;
		int y = 0;
		t = sc.nextInt();
		while ( x < t) {
			n = sc.nextInt();
			m = sc.nextInt();
			h = sc.nextInt();
			int[][] arr = new int[m][n];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = 100*(j+1)+(i+1);
				}
			}
			int count = 0;
			out:
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; count++, j++) {
						if(count == h)break out;
						y = arr[i][j];		
				}
			}
			System.out.println(y);
			x++;
		}

		

	}

}
