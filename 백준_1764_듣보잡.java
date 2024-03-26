package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class 백준_1764_듣보잡 {

	public static void main(String[] args) throws IOException, NumberFormatException {
		
		/*
		듣보잡 성공
		시간 제한    2 초
		메모리 제한 256 MB	
		제출	       105145
		정답		   45194
		맞힌 사람	   35173
		정답 비율    41.226%
							
		문제
		김진영이 듣도 못한 사람의 명단과, 보도 못한 사람의 명단이 주어질 때, 듣도 보도 못한 사람의 명단을 구하는 프로그램을 작성하시오.

		입력
		첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다. 이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과,
		 N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다. 이름은 띄어쓰기 없이 알파벳 소문자로만 이루어지며,
		  그 길이는 20 이하이다. N, M은 500,000 이하의 자연수이다.

		듣도 못한 사람의 명단에는 중복되는 이름이 없으며, 보도 못한 사람의 명단도 마찬가지이다.

		출력
		듣보잡의 수와 그 명단을 사전순으로 출력한다.

		예제 입력 1 
		3 4
		ohhenrie
		charlie
		baesangwook
		obama
		baesangwook
		ohhenrie
		clinton
		예제 출력 1 
		2
		baesangwook
		ohhenrie
		*/
		// TreeMap을 사용하면 contains()를 사용했을때 엄청 빠른 속도로 검색작업이 이루어진다.
		// 그래서 key를 이용해서 같은값이 있을때 value값을 0으로 바꿔서 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s = new String();
		int l_size = Integer.parseInt(st.nextToken());
		int s_size = Integer.parseInt(st.nextToken());
		TreeMap<String, Integer> ls_map = new TreeMap<String, Integer>();
		for (int i = 0; i < l_size; i++) {
			ls_map.put(br.readLine(), 1 );
		}
		// 위의 for문은 최악의 경우 (log n)
		// s가  ls_map에 이미 있는 값일경우 value를 0으로 바꾼다. ( 듣과 보가 둘다 입력될 경우 0으로 바꾸는 로직 )
		for (int i = 0; i < s_size; i++) {
		s = br.readLine();
		if(ls_map.containsKey(s)) {
			ls_map.put(s, 0);
		};
		}
		// 위의 for문은 최악의 경우 (log n)
		Set<Entry<String,Integer>>  set = ls_map.entrySet();
		Iterator<Entry<String, Integer>> ir = set.iterator();
		StringBuilder sb = new StringBuilder();
		int count = 0;
		while (ir.hasNext()) {
			Entry<String, Integer> entry =  ir.next();
			String key = entry.getKey();
			int value = entry.getValue();
			if( value == 0) {
				count++;
				sb.append(key +"\n");
			}
		}
		System.out.println(count);
		System.out.println(sb);
		
	}
	

}


