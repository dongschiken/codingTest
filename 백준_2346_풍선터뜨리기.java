package 백준문제_브론즈;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class 백준_2346_풍선터뜨리기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 위치값만큼 popfirst 혹은 poplast 메서드 사용해서 몇번 반복할지?
		// + , - 를따로 만들어서 다르게 반복
		// index값은 어떻게 설정할지?? 마지막으로 pop한 숫자를 배열에서 찾아서 
		// StringBuilder로 append 메서드 사용해서 그 index값을 담아놓는다.
		Deque<Integer> deque = new LinkedList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> del_list = new ArrayList<Integer>();
		int[] index_arr = new int[5];
		int deque_num = 0;
		index_arr[0] = 3;
		index_arr[1] = 2;
		index_arr[2] = 1;
		index_arr[3] = -3;
		index_arr[4] = -1;
		
		// -3일때를 가정
//		5
//		3 2 1 -3 -1
		deque.push(3);
		deque.push(2);
		deque.push(1);
		deque.push(-3);
		deque.push(-1);
		for (int i = 0; i < index_arr.length; i++) {
			
		}
		
		// -일때의 로직과, push해주는 로직, while문 로직, index출력하는 2중 for문 만들기
		deque_num = deque.pollLast();
		while (!deque.isEmpty()) {
			if( deque_num > 0) {
				for (int i = 0; i < deque_num-1; i++) {
					list.add(deque.pollLast());
				}
				del_list.add(deque.pollLast());
				
				for (int i = deque_num-2; i >= 0; i--) {
					deque.offerFirst(list.get(i));			
				}
				deque_num = del_list.get(del_list.size()-1);
			}else {
				Math.abs(deque_num);
				for (int i = 0; i < deque_num-1; i++) {
					list.add(deque.pollFirst());
				}
				del_list.add(deque.pollFirst());
				deque_num = del_list.get(del_list.size()-1);
				for (int i = deque_num-2; i >= 0; i--) {
					deque.offerLast(list.get(i));
				}
			}
			list.removeAll(list);
			System.out.println(list);
			System.out.println(deque);
			System.out.println(del_list);
		}
		
//		for (int i = 0; i < 2; i++) {
//		list.add(deque.pollLast());
//		}
//		 del_list.add(deque.pollLast());
//		for (int i = 1; i >= 0; i--) {
//			deque.offerFirst(list.get(i));
//		}
//		list.removeAll(list);
//		System.out.println(list);
//		System.out.println(deque);
//		System.out.println(del_list);
//		for (int i = 0; i < index_arr.length; i++) {
//			if( index_arr[i] == del_list.get(0)) {
//				System.out.println(i+1);
//			}
//		}
	}

}
