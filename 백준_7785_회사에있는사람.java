package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class 백준_7785_회사에있는사람 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		HashMap<String, String> en_member = new HashMap();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ent_count = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer("");
		ArrayList<String> out_put_list = new ArrayList();
		int list_count = 0;
		for (int i = 0; i < ent_count; i++) {
			st = new StringTokenizer(br.readLine());
			en_member.put(st.nextToken(), st.nextToken());
		}
		
		// Set클래스 사용해서 entrySet()메서드 구현
		// iterator를 통해 while문에서 key, value값 순차적으로 list에 add(value가 "enter"인것만)
		Set<Entry<String, String>> en_set = en_member.entrySet();
		Iterator<Entry<String, String>> s_iter = en_set.iterator();
		while (s_iter.hasNext()) {
			Entry entry = (Entry)s_iter.next();
			String member = (String)entry.getKey();
			String ent_check = (String)entry.getValue();
			if(ent_check.equals("enter")) {
				out_put_list.add(member);
			}
		}
		// reverseOrder()사용해서 사전의 역순으로 정렬
		Collections.sort(out_put_list, Comparator.reverseOrder());
		while (out_put_list.size() > list_count) {
			
			System.out.println(out_put_list.get(list_count));
			list_count++;
		}
		br.close();	
	}

}
