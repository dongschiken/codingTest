package 백준문제_브론즈;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class 백준_4949_균형잡힌세상 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		String line = new String();
		String str = new String();
		Deque<String> deque = new LinkedList();
		ArrayList<String> list = null;
		while (true) {
			line = sc.nextLine();
			if(line.equals("."))break;
			list = new ArrayList<String>();
			int count = 0;
			for (int i = 0; i < line.length(); i++) {
				switch (line.substring(i,i+1)) {
				case "(": 
					list.add(line.substring(i, i+1));
					count++;
					break;
				case "[":
					list.add(line.substring(i, i+1));
					count++;
					break;
				case ")":
					list.add(line.substring(i, i+1));
					count++;
					break;
				case "]":
					list.add(line.substring(i, i+1));
					count++;
					break;
				}
			}
			if(!list.contains(")") && !list.contains("(") && !list.contains("]") && !list.contains("[")) {
				System.out.println("yes");
				deque.clear();
				continue;
			}
			deque.push(list.get(0));
			if(list.get(0).contains(")") || list.get(0).contains("]")) {
				System.out.println("no");
				deque.clear();
				continue;
			}
			for (int i = 1; i < list.size(); i++) {				
				if(list.get(i).equals(")")) {
					if(deque.isEmpty()) {
					deque.push(list.get(i));
					continue;
					}else {
					str = deque.pop();
					}
					if(str.equals("(")) continue;
					else {
						deque.push(list.get(i));
						deque.push(str);
						
					}			
				}else if(list.get(i).equals("]")) {
					if(deque.isEmpty()) {
						deque.push(list.get(i));
						continue;
						}else {
						str = deque.pop();
						}
					if(str.equals("[")) continue;
					else {		
						deque.push(list.get(i));
						deque.push(str);
												
					}	
				}
				else {
					deque.push(list.get(i));
				}
			}
			System.out.println(deque);
			if(deque.isEmpty())System.out.println("yes");
			else System.out.println("no");
			deque.clear();
		}
//[]][][][][][9][90]9[0]9[][][90]9[0][90]9[0()()()()[]()[](((([]]][()

		
	}
}
