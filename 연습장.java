package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
<<<<<<< HEAD
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class 연습장 {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException, NumberFormatException {
		
		
		int s_count = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack();
		//
		while (s_count > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int command_num = Integer.parseInt(st.nextToken());

			switch (command_num) {
			case 1: // push연산
				command_num = Integer.parseInt(st.nextToken());
				stack.push(command_num);
				break;
			case 2: // pop연산
				if( stack.isEmpty() ) {
					bw.write(-1+"\n");;
				}else {
					int pop = stack.pop();
					bw.write(pop+"\n");
				}
				break;
			case 3: // size연산
				size(stack);
				break;
			case 4: // empty연산
				empty(stack);
				break;
			default: // peek연산
				peek(stack);
				break;
			}
			
			
			s_count--;
		}
        bw.flush();
		bw.close();
		br.close();
			
	}

	private static void peek(Stack<Integer> stack) throws IOException {
		if(stack.isEmpty()) {
			bw.write(-1+"\n");
		}else {
			bw.write(stack.peek()+"\n");
		}
	}

	private static void empty(Stack<Integer> stack) throws IOException {
		if(stack.isEmpty()) {
			bw.write(1+"\n");
		}else {
			bw.write(0+"\n");
		}
		
	}

	private static void size(Stack<Integer> stack) throws IOException {
		bw.write(stack.size()+"\n");
	}



=======
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 연습장 {
    public static void main(String[] args) throws IOException  {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String str = br.readLine();
    	for (int i = 0; i < str.length(); i += 10) {
    		if((int)Math.floor(i+10) >= str.length()) {
    			System.out.println(str.substring(i)); 
    		}else {
    			System.out.println(str.substring(i, i+10)); 
    		}
		}
    	
    	
    }
>>>>>>> 9604b69c19a760bf13d43cf96f01d04e7e02dc54
}
//10
//3 2 1 -3 -1 4 -2 -5 5 6
//1 4 10 8 2 5 3 6 9 7 