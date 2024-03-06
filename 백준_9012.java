package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 백준_9012 {

	public static void main(String[] args) throws IOException, NumberFormatException {
		
		Stack<String> stack = new Stack();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = new String();
		int count = 0;
		String s[] = new String[2];		
		int n = Integer.parseInt(br.readLine());
		String[] strArr = new String[n];
		OUT :
		while (n > count) {
			
			str = br.readLine();
			// stack에 문자열 1번째 값을 넣고 그게 ")"면 무조건 NO가 나오도록
			stack.push(str.substring(0,1));
			if(str.substring(0,1).equals(")")) {
				strArr[count] = "NO";
				count++;
				stack.clear();
				continue OUT;
			} 
			int i = 0;
			// 한줄 입력받은 문자열 길이만큼 반복
			while(i < str.length()-1) {
				stack.push(str.substring(i+1, i+2));
				// 스택 pop해서 문자열에 담았을때 스택이 비어있을때 ")"라면 무조건 NO 아니라면 다시 스택에 s[0]을 담고
				s[0] = stack.pop();
				if(stack.isEmpty()) {
					if(s[0].equals(")")) {
						strArr[count] = "NO";
						count++;
						continue OUT;
					}
					stack.push(s[0]);
				// 스택이 안비어있으면 또 pop해서 s[1]에 담고 두 s[0]과 비교해서 같으면 다시 순서대로 넣기
				}else {
					s[1] = stack.pop();
					if(s[0].equals(s[1])) {
						stack.push(s[1]);
						stack.push(s[0]);
					}
				}
				i++;
			} //while
			// 만약에 stack이 비어있으면 YES, 아니면 NO
			if(stack.isEmpty()) {
				strArr[count] = "YES";
			}else {
				strArr[count] = "NO";
			}
			stack.clear();
			count++;
		} // while OUT
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}	
	}

}


