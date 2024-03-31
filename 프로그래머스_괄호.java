package 백준문제_브론즈;

import java.util.Stack;

public class 프로그래머스_괄호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "";
		String s = "((())())(())()";
//		String s = "()()";
		System.out.println(solution(s));


	}
	public static boolean solution(String s) {

		
		boolean answer = true;
		Stack stack = new Stack();

		if(s.charAt(0) == ')'){
			return  answer = false;
		}
		stack.push(s.charAt(0));
		char c = ' ';
		int count = 1;
		while(count <= s.length()-1){
			if( stack.isEmpty()) {
				stack.push(s.charAt(count));
				count++;
				continue;
			}
			c = (char)stack.pop();
			if(c == '('){
				if( s.charAt(count) == ')') {
					count++;
					continue;
				}else {
					stack.push(c);
					stack.push(s.charAt(count));
				}
			}else {
				stack.push(c);
				stack.push(s.charAt(count));
			}
			count++;
		}
		if( stack.isEmpty()) {
			return answer = true;
		}else {
			return answer = false; 
		}
		       
	}
}
