package 백준_브론즈문제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class 백준_10814_나이순정렬_3일뒤풀기 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Member> memberList = new ArrayList();
		String name = new String();
		int age = 0;
		
		// Mmeber 클래스에 age, name, i(들어온 순서)를 생성자로 객체 생성 하면서 memberList에  add()
		for (int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			name = input[1];
			age = Integer.parseInt(input[0]);
			memberList.add( new Member(age, name, i));
		}
		// 정렬 작업(람다식으로)
		Collections.sort(memberList, (m1, m2) -> {
			if(m1.age == m2.age) {
				return m1.order - m2.order;
			}
			return m1.age - m2.age;
		});
		for (Member member : memberList) {
			bw.write(member.age +" "+ member.name+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	
	}

}
class Member {
	int age;
	String name;
	int order;
	
	
	public Member(int age, String name, int order) {
		this.age = age;
		this.name = name;
		this.order = order;
	}
	
}
