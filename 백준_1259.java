package 백준_브론즈문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_1259 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int x = 1;
		String yesOrNo = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while ( (x = Integer.parseInt(br.readLine())) != 0) {
			// x를 StringBuilder로 변환
			StringBuilder sb = new StringBuilder(String.valueOf(x));
			// 만약 입력된 값이 홀수라면 가운데 숫자 자르기
			int y =  (int)(Math.ceil(sb.length()/2));
			if( sb.length() % 2 != 0) {
				sb.delete(y,y+1);
			}
			String str = String.valueOf(sb);
			String strRevers = String.valueOf(sb.reverse());
			if (str.equals(strRevers)) {
				yesOrNo = "yes";
			}else {
				yesOrNo = "no";
			}
			System.out.println(yesOrNo);
		}
		
	}

}


