package 백준문제_브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_모비스 {
	public static void main(String[] args) throws IOException {

		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        String check = "NO";
		        String mobis = br.readLine();
		        String[] mobis_arr = {"M", "O", "B", "I", "S"};

		        for(int i = 0; i < mobis_arr.length; i++){
		            if(mobis.contains(mobis_arr[i])){
		                check = "YES";
		            }else{
		                check = "NO";
		                break;
		            }
		        }
		        System.out.print(check);
		    }
	}

