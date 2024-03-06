package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_9012_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 데이터 수

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            System.out.println(solve(str));
        }
    }

    public static String solve(String str) {
        int count = 0; // 여는 괄호의 개수

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                count++;
            } else if (ch == ')') { // 짝 만날 때마다 --
                count--;

                if (count < 0) { // 여는 괄호 수 - 닫는 괄호 수가 음수일 경우 --> 닫는 괄호가 더 많을 경우 NO
                    return "NO";
                }
            }
        }

        if (count == 0)
            return "YES";
        else
            return "NO";
    }
}