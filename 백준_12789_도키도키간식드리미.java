package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class 백준_12789_도키도키간식드리미 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int std_cnt = Integer.parseInt(br.readLine());
		// 오른쪽 사람들 받을 큐 변수
		Queue<Integer> std_queue = new LinkedList<Integer>();
		// 아래쪽에 사람들 받을 스택 변수
		Stack<Integer> std_stack = new Stack();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < std_cnt; i++) {
			std_queue.offer(Integer.parseInt(st.nextToken()));
		}
		
		int count = 1;
		// 큐에서 한개 빼와서 count와 같으면 
		while (true) {
		
			if(!std_queue.isEmpty()) {
				int q_std = std_queue.poll();
				
				if( q_std == count) {
					count++;
				}else {
					std_stack.push(q_std);
				}
			} 
			// 여기서 스택에 들어가는 사람들의 순서가 맞다면 계속 꺼내와야한다.
			// 즉 stack에서 빼내온 사람과 count의 숫자가 일치하면 계속 꺼낸다.
			if(!std_stack.isEmpty()) {
				int std = 0;
				while (!std_stack.isEmpty()) {
					std = std_stack.pop();
					if( std == count ) {
						count++;
					}else {
						std_stack.push(std);
						break;
					}
				}
				
			}
			if(std_queue.isEmpty()) {
				if(std_stack.isEmpty()) {
					System.out.println("Nice");
					break;
				}
				int s_std = std_stack.pop();
				if(s_std != count) {
					System.out.println("Sad");
					break;
				}else {
					std_stack.push(s_std);
				}
			}
		}
		/*처음 코드의 반례 (스택에서 만약에 3, 2의 순서로 들어갔을때 2가 빠져나온 이후 3이 빠져나오지 못해서 sad가 출력되었                                               
		 * 6
			3 2 1 4 5 6
			Sad

		 */
		
	}

}
