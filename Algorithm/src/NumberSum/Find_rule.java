package NumberSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Find_rule {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.valueOf(br.readLine()); //대각선총합+대각선의 수 범위안에서 나옴
		
		int cross_count = 1; //대각선 수
		int prep_cross_count = 0; //대각선총합
		
		while(true) {
			
			if(number <= cross_count+prep_cross_count) {
				
				if(cross_count%2==1) {
					//홀수
					System.out.println((cross_count-(number-prep_cross_count-1))+"/"+(number-prep_cross_count));
					break;
				}else {
					//짝수
					System.out.println((number-prep_cross_count)+"/"+(cross_count-(number-prep_cross_count-1)));
					break;
				}
			}else {
				// number가 대각선 수와 대각선총수의 합보다 클때
				prep_cross_count += cross_count;
				cross_count++;
			}
		}
	}
}
