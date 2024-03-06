package 백준문제_브론즈;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class 프로그래머스_달리기경주 {

	public static void main(String[] args) throws IOException {

		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings= {"kai", "kai", "mine", "mine"};
		
		System.out.println(Arrays.toString(solution(players, callings)));
	}





	public static String[] solution(String[] players, String[] callings) {

		//ArrayList<String> list = new ArrayList(callings.length);
		//HashMap<Integer, String> playersList = new HashMap();
		HashMap<String, Integer> playersList = new HashMap();
		String[] answer = new String[players.length];
		for(int i = 0; i<players.length; i++){
			playersList.put(players[i], i);
		}
		for(int i = 0; i<callings.length; i++){
			//calling이 된 선수의 현재 등수를 가져온다.
			int nowRank = playersList.get(callings[i]);
			
			//calling된 선수의 앞에 있는 선수를 불러와서 frontPlayer에 대입
			String frontPlayer = players[nowRank-1];
			
			// players배열의 calling된 선수의 원래 자리에 앞선 선수를 넣고
			players[nowRank] = frontPlayer;
			// players배열의 calling된 선수를 앞선 선수의 자리에 넣는다.
			players[nowRank-1] = callings[i];
			
			// 선수 리스트 Map에 앞선선수의 value값에 현재 등수를 넣고
			// 선수 리스트 Map에 calling된 선수의 value값에 현재 등수-1을 넣어주면된다.
			playersList.put(frontPlayer, nowRank);
			playersList.put(callings[i], nowRank-1);
		}
		for (int i = 0; i < answer.length; i++) {
			answer[i] = players[i];
		}
			
		
		return answer;

	}
}
