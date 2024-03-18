package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 연습장 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		for(int i = 2; i <= 100; i++){
			int j;
			for(j = 2; j < 100; j++){
		    	if( i % j == 0 ) break;
		    
		    }
		    if(i == j){
		    	System.out.println(i);
		    }

		}

	}
}
