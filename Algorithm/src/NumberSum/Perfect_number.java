package NumberSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import javax.naming.ldap.SortControl;

public class Perfect_number {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int A = Integer.valueOf(st.nextToken());
		if(A==-1) {
			break;
		}
		List<Integer> multiple = new ArrayList<>();

		int total = 0;
		for (int i = 1; i < A; i++) {
			if (A % i == 0) {
				multiple.add(i);
				total += i;
			}
		}
		if (A == total) {
			sb.append(A + " = " + multiple.get(0));
			for (int i = 1; i < multiple.size(); i++) {
				sb.append(" + " + multiple.get(i));
			}
		} else {

			sb.append(A + " is NOT perfect.");
		}
		System.out.println(sb);
		}
	}
}
