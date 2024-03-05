package 백준_브론즈문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 백준_15829 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long sum = 0;
		String str = br.readLine();
		BigInteger bi = new BigInteger("0");
		// 일단 31, i의 제곱을 계속 곱해주고
		// arr[i]값을 가져와야한다. 
		// sum에 31의 0승부터 i승까지 파싱한 숫자(arr[i])에 곱하기
		for (int i = 0; i < n; i++) {
			bi = bi.add(( BigInteger.valueOf( (int)(str.charAt(i) - 96))).multiply( BigInteger.valueOf(31).pow(i)) );
		}
		// 여기서 왜 1234567891로 나머지 계산을 해야하는지?? 이해못함
		bi = bi.remainder( BigInteger.valueOf(1234567891));
		System.out.println(bi);
	}
}
