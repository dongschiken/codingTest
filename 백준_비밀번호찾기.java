package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class 백준_비밀번호찾기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int user_count = Integer.parseInt(st.nextToken());
		int found_user_pwd_count= Integer.parseInt(st.nextToken());
		
		
		LinkedHashMap<String, String> user_infoMap = new LinkedHashMap<String, String>();
		for (int i = 0; i < user_count; i++) {
			st = new StringTokenizer(br.readLine());
			user_infoMap.put(st.nextToken(), st.nextToken());
		}
		
		// Map에 해당하는 유저가 있을때 그 유저의 키에 해당하는 value를 가져와서 bw로 출력
		for (int i = 0; i < found_user_pwd_count; i++) {
			st = new StringTokenizer(br.readLine());
			bw.write(user_infoMap.get(st.nextToken())+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
		
	}

}
