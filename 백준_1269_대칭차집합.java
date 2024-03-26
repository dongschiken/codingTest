package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class 백준_1269_대칭차집합 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		대칭 차집합
		 
		시간 제한	   2 초
		메모리 제한 256 MB	
		제출		   30638
		정답		   19552
		맞힌 사람	   16239
		정답 비율    64.430%
			 				
		문제
		자연수를 원소로 갖는 공집합이 아닌 두 집합 A와 B가 있다. 이때, 두 집합의 대칭 차집합의 원소의 개수를 출력하는 프로그램을 작성하시오.
		두 집합 A와 B가 있을 때, (A-B)와 (B-A)의 합집합을 A와 B의 대칭 차집합이라고 한다.

		예를 들어, A = { 1, 2, 4 } 이고, B = { 2, 3, 4, 5, 6 } 라고 할 때,  A-B = { 1 } 이고, B-A = { 3, 5, 6 } 이므로, 
		대칭 차집합의 원소의 개수는 1 + 3 = 4개이다.

		입력
		첫째 줄에 집합 A의 원소의 개수와 집합 B의 원소의 개수가 빈 칸을 사이에 두고 주어진다. 
		둘째 줄에는 집합 A의 모든 원소가, 셋째 줄에는 집합 B의 모든 원소가 빈 칸을 사이에 두고 각각 주어진다. 
		각 집합의 원소의 개수는 200,000을 넘지 않으며, 모든 원소의 값은 100,000,000을 넘지 않는다.

		출력
		첫째 줄에 대칭 차집합의 원소의 개수를 출력한다.

		예제 입력 1 
		3 5
		1 2 4
		2 3 4 5 6
		예제 출력 1 
		4
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count1 = Integer.parseInt(st.nextToken());
		int count2 = Integer.parseInt(st.nextToken());
		// A
		TreeMap<Integer, Integer> cha_treemap1 = new TreeMap<Integer, Integer>();
		TreeMap<Integer, Integer> cha_treemap2 = new TreeMap<Integer, Integer>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < count1; i++) {
			int x = Integer.parseInt(st.nextToken());
			cha_treemap1.put(x, 0);
			cha_treemap2.put(x, 0);
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < count2; i++) {
			int x = Integer.parseInt(st.nextToken());
			cha_treemap1.put(x, 1);
			if(!cha_treemap2.containsKey(x)) {
				cha_treemap2.put(x, 1);
			}
		}
		int count = 0;
		Set<Entry<Integer, Integer>>  cha_set = cha_treemap1.entrySet();
		Iterator<Entry<Integer, Integer>> ir = cha_set.iterator();
		while (ir.hasNext()) {
			Entry<java.lang.Integer, java.lang.Integer> entry =  ir.next();
			if( entry.getValue() == 0) {
				count++;
			}
		}
		
		Set<Entry<Integer, Integer>> cha2_set = cha_treemap2.entrySet();
		Iterator<Entry<Integer, Integer>> ir2 = cha2_set.iterator();
		while (ir2.hasNext()) {
			Entry<java.lang.Integer, java.lang.Integer> entry =  ir2.next();
			
			if( entry.getValue() == 1) {
				count++;
			}
		}
		System.out.println(count);
		}
	

}
