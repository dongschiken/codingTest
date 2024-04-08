package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
}
//10
//3 2 1 -3 -1 4 -2 -5 5 6
//1 4 10 8 2 5 3 6 9 7 