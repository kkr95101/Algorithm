package NumberSum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		Map<String, Integer> nameArray = new HashMap<>();
		for (int i = 0; i < N+M; i++) {
			String input= br.readLine();
			if(!(nameArray.get(input)==null)) {
				nameArray.put(input, 2);
			}else {
				nameArray.put(input, 1);
			}
		}
		StringBuilder sb = new StringBuilder(); 
		int a = 0;
		for (Map.Entry<String,Integer> entry : nameArray.entrySet()) {
			if(entry.getValue()==2) {
				a++;
				sb.append(entry.getKey()).append("/br");
			}
		}
		System.out.println(a);
		System.out.println(sb);
		
	}
}