package 백준_브론즈문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class 백준_11866 {

	public static void main(String[] args) throws IOException, NumberFormatException {
		/*
		요세푸스 문제 0 성공
		시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
		2 초	512 MB	74349	42100	35276	56.459%
		문제
		요세푸스 문제는 다음과 같다.

		1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다. 이제 순서대로 K번째 사람을 제거한다. 
		한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 
		원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.

		N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.

		입력
		첫째 줄에 N과 K가 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ K ≤ N ≤ 1,000)

		출력
		예제와 같이 요세푸스 순열을 출력한다.

		예제 입력 1 
		7 3
		예제 출력 1 
		<3, 6, 2, 7, 5, 1, 4>
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> yose = new LinkedList();
		ArrayList<Integer> list = new ArrayList();
        // 7 , 3
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
        br.close();

		for (int i = 0; i < n; i++) {
			yose.offer(i+1);
		}
		while (!yose.isEmpty()) {

			// k - 1 개만큼 반복하면서 숫자 다시 넣기
			for (int i = 0; i < k-1; i++) {
				yose.add(yose.poll());
			}
            // k번째 숫자 삭제하면서 list에 삽입
			list.add(yose.poll());
			if(list.size() == n)yose.clear();
		}
        // 출력부분
		System.out.print("<");
		for (int i = 0; i < list.size(); i++) {
			if(list.size() == i+1 ) {
				System.out.printf("%d",list.get(i));
				break;
			}
			System.out.printf("%d, ",list.get(i));
		}
		System.out.print(">");
		
	} // main
} // class
