package 백준_브론즈문제;

import java.io.*;
import java.util.*;
class 백준_5622{
    public static void main(String[] args) throws IOException {
      int n = 0;
      
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> strList = new ArrayList();
		Collections.addAll(strList, "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQR7", "TUV8", "WXY9");
		String s = br.readLine();
		String[] str = new String[s.length()];
		for (int i = 0; i < s.length(); i++) {
			str[i] = s.charAt(i)+"";
		}
		for (int i = 0; i < strList.size(); i++) {
			for (int j = 0; j < str.length; j++) {
				if((strList.get(i).contains(str[j]))) {
					n += Integer.parseInt(strList.get(i).substring(3));
					str[j] = str[j].replace(str[j], "20");
				}else if( str[j].equals("S")) {
					n += 7;
					str[j] = str[j].replace(str[j], "20");
				}else if( str[j].equals("Z")) {
					n += 9;
					str[j] = str[j].replace(str[j], "20");
				}else if( str[j].equals("operator0")) {
					n += 0;
					str[j] = str[j].replace(str[j], "20");
				}
			}
		}		
		n +=str.length;
		System.out.println(n);
    }
}