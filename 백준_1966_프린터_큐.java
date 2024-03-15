package 백준문제_브론즈;

import java.util.LinkedList;
import java.util.Queue;

public class 백준_1966_프린터_큐 {

	public static void main(String[] args) {
		// 제일 처음 들어온 요소 1이 삭제가 가장 먼저된다.
		Queue queue = new LinkedList();
//		queue.offer(new Integer(1));
//		queue.offer(new Integer(2));
//		queue.offer(new Integer(3));
//		queue.poll();
//		queue.offer(new Integer(1));
//		System.out.println(queue);
		int n = 1;
		int count = 0;
		//2번째 index값을 가져와서 그값과 contains
		for (int i = 0; i < n; i++) {
			String x = (String)queue.poll();
			if(x.contains(String.valueOf(0))) {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
