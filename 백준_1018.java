package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_1018 {

	public static void main(String[] args) throws IOException {
		/*
		시간 제한 2 초	
		메모리 제한 128 MB	
		제출 116954	
		정답 58057	
		맞힌 사람 46429	
		정답 비율 49.819%
							
		문제
		지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M×N 크기의 보드를 찾았다. 어떤 정사각형은 검은색으로 칠해져 있고, 
		나머지는 흰색으로 칠해져 있다. 지민이는 이 보드를 잘라서 8×8 크기의 체스판으로 만들려고 한다.

		체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다. 구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고, 
		변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다. 따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다. 하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.

		보드가 체스판처럼 칠해져 있다는 보장이 없어서, 지민이는 8×8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다. 
		당연히 8*8 크기는 아무데서나 골라도 된다. 지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.

		입력
		첫째 줄에 N과 M이 주어진다. N과 M은 8보다 크거나 같고, 50보다 작거나 같은 자연수이다. 
		둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다. B는 검은색이며, W는 흰색이다.

		출력
		첫째 줄에 지민이가 다시 칠해야 하는 정사각형 개수의 최솟값을 출력한다.

		예제 입력 1 
		8 8
		WBWBWBWB
		BWBWBWBW
		WBWBWBWB
		BWBBBWBW
		WBWBWBWB
		BWBWBWBW
		WBWBWBWB
		BWBWBWBW
		예제 출력 1 
		1
		
		예제 입력 2 
		10 13
		BBBBBBBBWBWBW
		BBBBBBBBBWBWB
		BBBBBBBBWBWBW
		BBBBBBBBBWBWB
		BBBBBBBBWBWBW
		BBBBBBBBBWBWB
		BBBBBBBBWBWBW
		BBBBBBBBBWBWB
		WWWWWWWWWWBWB
		WWWWWWWWWWBWB
		예제 출력 2 
		12
		
		예제 입력 3 
		8 8
		BWBWBWBW
		WBWBWBWB
		BWBWBWBW
		WBWBWBWB
		BWBWBWBW
		WBWBWBWB
		BWBWBWBW
		WBWBWBWB
		예제 출력 3 
		0
		
		예제 입력 4 
		9 23
		BBBBBBBBBBBBBBBBBBBBBBB
		BBBBBBBBBBBBBBBBBBBBBBB
		BBBBBBBBBBBBBBBBBBBBBBB
		BBBBBBBBBBBBBBBBBBBBBBB
		BBBBBBBBBBBBBBBBBBBBBBB
		BBBBBBBBBBBBBBBBBBBBBBB
		BBBBBBBBBBBBBBBBBBBBBBB
		BBBBBBBBBBBBBBBBBBBBBBB
		BBBBBBBBBBBBBBBBBBBBBBW
		예제 출력 4 
		31
		*/
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int n = Integer.parseInt(st.nextToken());
//		int m = Integer.parseInt(st.nextToken());
//		String[] str_line = new String[n];
//		// n만큼 돌면서 한라인씩 받아오기
//		for (int i = 0; i < n ; i++) {
//			str_line[i] = br.readLine(); // 10개가 들어있다.
//		}
//		int sol = Short.MAX_VALUE;
//		for (int i = 0; i <= n-8; i++) {
//			for (int j = 0; j <= m-8; j++) {
//				
//				int cursol = getSolution(i, j, str_line);
//				
//				if(sol > cursol)sol = cursol; 
//			}
//		}
//		System.out.println(sol);
//		br.close();
//
//	}
//
//	private static int getSolution(int startRow, int startCol, String[] str_line) {
//		// 1번이 화이트 보드 2번이 블랙보드인 순서대로 가는 W(화이트블럭)가 맨왼쪽 위에서 시작하는 체스판
//		String[] white_board = {"WBWBWBWB", "BWBWBWBW"};
//		// 1번이 블랙보드  2번이 화이트 보드인 순서대로 가는 B(블랙블럭)가 맨왼쪽 위에서 시작하는 체스판
//		String[] black_board = {"BWBWBWBW", "WBWBWBWB"};
//		int whiteBoard_count = 0;
//		int blackBoard_count = 0;
//		// 화이트보드로 시작하는 로직 
//		for (int i = 0; i < 8; i++) {
//			int row = startRow+i;
//			for (int j = 0; j < 8; j++) {
//				int col = startCol+j;
//				if(str_line[row].charAt(col) != white_board[row%2].charAt(j))whiteBoard_count++;
//			}
//		}
//		// 블랙보드로 시작하는 로직
//		for (int i = 0; i < 8; i++) {
//			int row = startRow+i;
//			for (int j = 0; j < 8; j++) {
//				int col = startCol+j;
//				if(str_line[row].charAt(col) != black_board[row%2].charAt(j))blackBoard_count++;
//			}
//		}
//		
//		return Math.min(whiteBoard_count, blackBoard_count);
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        // n = 전체 row, m = 전체 col
	        int n = Integer.parseInt(st.nextToken());
	        int m = Integer.parseInt(st.nextToken());
	        String[] board_line = new String[n]; 
	        for(int i = 0; i < n; i++){
	            board_line[i] = br.readLine();
	        }
	        int min_count = Short.MAX_VALUE;
	        // 체스판 8 x 8로 잘라내기
	        for(int i = 0; i <= n-8; i++){
	            for(int j = 0; j <= m-8; j++){
	                
	                int w_b_count = solution(i, j, board_line);
	                
	                if(min_count > w_b_count) min_count = w_b_count;       
	            }
	        }
	        System.out.print(min_count);
	    }
	    private static int solution(int startRow, int startCol, String[] board_line){
	        String[] white_board = {"WBWBWBWB", "BWBWBWBW"};
	        String[] black_board = {"BWBWBWBW", "WBWBWBWB"};
	        int white_board_count = 0;
	        int black_board_count = 0;
	        for(int i = 0; i < 8; i++){
	            int row = startRow+i;
	            for(int j = 0; j < 8; j++){
	                int col = startCol+j;
	                if(board_line[row].charAt(col) != white_board[row%2].charAt(j))white_board_count++;
	            }
	        }
	        for(int i = 0; i < 8; i++){
	            int row = startRow+i;
	            for(int j = 0; j < 8; j++){
	                int col = startCol+j;
	                if(board_line[row].charAt(col) != black_board[row%2].charAt(j))black_board_count++;
	            }
	        }
	        return Math.min(white_board_count, black_board_count);
	}
}
