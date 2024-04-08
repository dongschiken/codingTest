package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class 백준_20920_람다스트림배우고다시풀기 {

	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int word_count = Integer.parseInt( st.nextToken() );
			int word_length_count = Integer.parseInt( st.nextToken() );
			
			LinkedHashMap< String, Integer> word_map = new LinkedHashMap<String, Integer>();
			String[] str_word = new String[word_count];
			
			for (int i = 0; i < str_word.length; i++) {
					str_word[i] = br.readLine();
				
				
			}
			Arrays.sort(str_word);
			for (int i = 0; i < str_word.length; i++) {
				str_word[i] = str_word[i].length() +str_word[i];
			}
			
			Arrays.sort(str_word, Comparator.reverseOrder());
			for (int i = 0; i < str_word.length; i++) {
				str_word[i] = str_word[i].substring(1);
			}
			System.out.println(Arrays.toString(str_word));
			ArrayList list = new ArrayList();
			int count = 0;
			for (int i = 1; i < str_word.length; i++) {
				if(str_word[i].equals(str_word[i-1])) {
					count++;
					System.out.println(count);
				}else {
					list.add(count + str_word[i-1]);
					count = 0;
				}
			}
			System.out.println(list);
			
			
	}

}
