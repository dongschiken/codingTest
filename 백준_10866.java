package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class 백준_10866 {

	public static void main(String[] args)  throws IOException, NumberFormatException{
		/*
		덱
		시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
		0.5 초 (추가 시간 없음)	256 MB	82016	45326	38267	56.019%
		문제
		정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

		명령은 총 여덟 가지이다.

		push_front X: 정수 X를 덱의 앞에 넣는다.
		push_back X: 정수 X를 덱의 뒤에 넣는다.
		pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		size: 덱에 들어있는 정수의 개수를 출력한다.
		empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
		front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		입력
		첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

		출력
		출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.

		예제 입력 1 
		15
		push_back 1
		push_front 2
		front
		back
		size
		empty
		pop_front
		pop_back
		pop_front
		size
		empty
		pop_back
		push_front 3
		empty
		front
		
		예제 출력 1 
		2
		1
		2
		0
		2
		1
		-1
		0
		1
		-1
		0
		3
		*/
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		ArrayDeque deque = new ArrayDeque(); 
		while (n > count) {

			if( (str = br.readLine()).contains("push") ) {
				push(str, deque);
			}else if(str.contains("pop")) {
				pop(str, deque);
			}else if(str.contains("front")) {
				front(str, deque);
			}else if(str.contains("back")) {
				back(str, deque);
			}else if(str.contains("size")) {
				size(str, deque);
			}else if(str.contains("empty")) {
				empty(str, deque);
			}
			count++;
		}	
	}
	
	private static ArrayDeque pop(String str, ArrayDeque deque) {
		if(deque.isEmpty()) {
			System.out.println(-1);
		}else {
			if(str.contains("front")) {
				System.out.println(deque.pollFirst());
			}else {
				System.out.println(deque.pollLast());
			}
		}
		return deque;
	}

	private static void empty(String str, ArrayDeque deque) {
		if(deque.isEmpty()) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

	private static void size(String str, ArrayDeque deque) {
		System.out.println(deque.size());
	}

	private static void back(String str, ArrayDeque deque) {
		if(deque.isEmpty()) {
			System.out.println(-1);
		}else {
		System.out.println(deque.peekLast());
		}
	}

	private static void front(String str, ArrayDeque deque) {
		if(deque.isEmpty()) {
			System.out.println(-1);
		}else {
			System.out.println(deque.peekFirst());
		}

	}

	private static ArrayDeque push(String str, ArrayDeque deque){		
		if(str.contains("front")) {
			deque.offerFirst(Integer.parseInt(str.substring(11)));
		}else {
			deque.offerLast(Integer.parseInt(str.substring(10)));
		}
		return deque;
	}

}
