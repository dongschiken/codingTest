package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class 백준_9506 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		약수들의 합 다국어
		시간 제한 2 초	
		메모리 제한 128 MB	
		제출 37637	
		정답 19197	
		맞힌 사람 17188	
		정답 비율 51.835%

		문제
		어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.

		예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.

		n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.

		입력
		입력은 테스트 케이스마다 한 줄 간격으로 n이 주어진다. (2 < n < 100,000)

		입력의 마지막엔 -1이 주어진다.

		출력
		테스트케이스 마다 한줄에 하나씩 출력해야 한다.

		n이 완전수라면, n을 n이 아닌 약수들의 합으로 나타내어 출력한다(예제 출력 참고).

		이때, 약수들은 오름차순으로 나열해야 한다.

		n이 완전수가 아니라면 n is NOT perfect. 를 출력한다.

		예제 입력 1 
		6
		12
		28
		-1
		예제 출력 1 
		6 = 1 + 2 + 3
		12 is NOT perfect.
		28 = 1 + 2 + 4 + 7 + 14
		 */
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n;
			ArrayList<String> nList = new ArrayList();
			
			// br로 읽어온 값을 숫자로 바꿔주고 -1이 나오면 while문 종료
			while ( (n = Integer.parseInt(br.readLine())) != -1 ) {
	            // 1부터 n만큼 반복하면서 n을 i로 나눴을때 0 이면 nList에 String값으로 하나씩 추가
				for (int i = 1; i < n; i++) {
					if(n%i == 0) {
						nList.add(String.valueOf(i));
					}
				}
	            // nList의 값을 "+"와 join해줄 가변배열 생성
				String[][] nArr = new String[n][];
	            // 완전수인지 체크할 x(nList에 있는거 전부 더하는 용도)
				int x = 0;
	            // nArr[]의 행값을 1개씩 더해줄 count정수
				int count = 0;
	            // String배열의 열값을 nList의 크기만큼 잡아준다.
				nArr[count] = new String[nList.size()];
	            // 0부터 nList의 크기만큼 반복하면서 x에 nList의 값을 정수로 바꿔 더해줌
				for (int i = 0; i < nList.size(); i++) {
					x += Integer.parseInt(nList.get(i));
	                // nArr의 count방 0~nList의 크기만큼 반복하면서 nList에 들어있던 값을 넣어줌
					nArr[count][i] = nList.get(i);
				}
				String nStr = null;
				if(x != n) {
	                // 만약 nList를 전부 더한x의 값이 n과 다르면 완전수 x
					System.out.printf("%d is NOT perfect.\n", n);
				}else {
	                // nList를 전부 더한x가 n과 같을 때
	                // nStr에 +를 join해서 nArr[count]의 값을 전부 넣고 출력
					nStr = String.join( " + ", nArr[count]);
					System.out.printf("%d = %s \n", n , nStr );
				}
	            // 위에 과정 한번하고 nList초기화하고 count를 +1해준다.
				nList.clear();
				count++;
			}
		


	}

}
