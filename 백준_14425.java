package 백준_브론즈문제;

import java.io.*;
import java.util.*;

public class 백준_14425 {

	public static void main(String[] args){
		
		
		
		Scanner sc = new Scanner(System.in);
		// 어차피 문자열 검사할 list1에는 중복값을 입력 안할꺼니까 HashSet사용해서 빠르게 검사한다.(이진검색)
		HashSet<String> list1 = new HashSet();
		// 어레이 리스트로 선언
		ArrayList<String> list2 = new ArrayList();
		int n = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			list1.add(sc.next());
		}
		for (int i = 0; i < b; i++) {
			// 리스트 2에 값을 넣고
			list2.add(sc.next());
			// 만약에 list1번에 list2번의 i번째 값이 포함되어 있으면 count한다.
			// HashSet을 사용했으니까 검색작업이 엄청 빨라진다.
			if(list1.contains(list2.get(i)))count++;
		}
		System.out.println(count);

		
		
				
	}

}
