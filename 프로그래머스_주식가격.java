package 백준문제_브론즈;

import java.util.ArrayDeque;
import java.util.Arrays;

public class 프로그래머스_주식가격 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {1, 2, 3, 2, 3};
		
		System.out.println(Arrays.toString(solution(prices))); ;
	}
	
	public static int[] solution(int[] prices) {
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		int[] answer = new int[prices.length];
		for (int i = 0; i < prices.length; i++) {
			deque.offer(prices[i]);
		}
		OUT :
		for (int i = 0; i < prices.length; i++) {
			int count = 0;
			int now_price = deque.poll();
			for (int j = 0; j < deque.size(); j++) {
				count++;
				if( prices[j+i+1] >= now_price ) {
					answer[i] = count;			
					continue;
				}else if( prices[j+i+1] < now_price) {
					answer[i] = count;		
					continue OUT;
				}
			}
		}
		return answer;
	}

}
