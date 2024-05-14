package NumberSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a= Integer.valueOf(br.readLine());
		
		int bang = 0;
		
		if(a/6==0 && a%6==1) {
			bang=1;
		}else {
			for (int i = 0; i < a/6; i++) {
				
			}
		}
		
		
		
		System.out.println(bang);

	}
}
