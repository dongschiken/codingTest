package 백준문제_브론즈;

import java.util.ArrayList;
import java.util.Scanner;

public class 백준_2941 {

	public static void main(String[] args) {
		/*
		시간 제한 1 초
		메모리 제한 128 MB	
		제출 170265	
		정답 75784	
		맞힌 사람 63789	
		정답 비율 44.495%
							
		문제
		예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.

		크로아티아 알파벳	변경
		č	c=
		ć	c-
		dž	dz=
		đ	d-
		lj	lj
		nj	nj
		š	s=
		ž	z=
		예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

		dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.

		입력
		첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.

		단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.

		출력
		입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

		예제 입력 1 
		ljes=njak
		예제 출력 1 
		6
		
		예제 입력 2 
		ddz=z=
		예제 출력 2 
		3
		
		예제 입력 3 
		nljj
		예제 출력 3 
		3
		
		예제 입력 4 
		c=c=
		예제 출력 4 
		2
		
		예제 입력 5 
		dz=ak
		예제 출력 5 
		3
		*/
	
		ArrayList<String> alpa = new ArrayList<String>();
		alpa.add("c=");
		alpa.add("c-");
		alpa.add("dz=");
		alpa.add("d-");
		alpa.add("lj");
		alpa.add("nj");
		alpa.add("s=");
		alpa.add("z=");
		// alpa에 크로아티아 문자열 한개씩 추가해주고
	
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		// 여기서 s가 alpa에 있으면 그부분 삭제할거다.
		for (int i = 0; i < alpa.size(); i++) {
			if(s.contains(alpa.get(i))){
				// 만약 alpa에 s가 들어있으면 그 문자열을 x로 교체
				s = s.replace(alpa.get(i), "X");
				}
			}
		System.out.println(s.length());

	} // main

} // class
 