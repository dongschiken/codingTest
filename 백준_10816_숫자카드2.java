package 백준문제_브론즈;

import java.util.*;
import java.io.*;
class 백준_10816_숫자카드2{
    public static void main(String[] args) throws NumberFormatException, IOException{
    	
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] counting = new int[20000001];
        int num_count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num_count; i++ ){
        	counting[ Integer.parseInt(st.nextToken()) + 10000000]++;
        }
        
        
        int tow_num_count = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tow_num_count; i++){
           sb.append(counting[Integer.parseInt(st2.nextToken()) + 10000000] + " ");
        }
        System.out.println(sb);
    }
}