package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class prefixSum_구간합 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bufferedReader =
				new BufferedReader(new InputStreamReader(System.in));
		//한줄에 길게 옆으로 데이터가 들어오기때문에 int형으로 받기 힘들다 그래서
		//StringToknizer를 사용해서 하기도함
		StringTokenizer stringTokenizer=
				new StringTokenizer(bufferedReader.readLine());
		int suNo = Integer.parseInt(stringTokenizer.nextToken()); //parseInt는 반환값이 int고 valueof는 Integer객체이다.
		int quizNo = Integer.parseInt(stringTokenizer.nextToken());
		
		long[] S = new long[suNo + 1]; //배열은 0번째 인덱스를 무시하고 질의를 바로바로받아서 쓰고자 +1을 했다.
		
		stringTokenizer = 
				new StringTokenizer(bufferedReader.readLine());
		for (int i = 1; i <=suNo; i++) {
			S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
			
		}
		for(int q=0; q<quizNo; q++) {
			stringTokenizer = 
					new StringTokenizer(bufferedReader.readLine());
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(S[j]-S[i-1]);
		}
		
		
	}

}
