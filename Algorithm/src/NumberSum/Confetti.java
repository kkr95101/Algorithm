package NumberSum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Confetti {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x= 0;
		int y= 0;
		int totalArea =0;
		boolean[][] a = new boolean[100][100];
		
		int count = Integer.valueOf(br.readLine());
		
		for (int i = 0; i < count; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			x = Integer.valueOf(st.nextToken());
			y = Integer.valueOf(st.nextToken());
			for (int j = x; j < x+10; j++) {
				for (int k = y; k < y+10; k++) {
					if(!a[j][k]) {
						a[j][k] = true;
						totalArea++;
					}
				}
			}
		}
		System.out.println(totalArea);
		
	}
}