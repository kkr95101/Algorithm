package NumberSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		StringBuilder sb = new StringBuilder();

		System.out.println("č	c=\r\n"
				+ "ć	c-\r\n"
				+ "dž	dz=\r\n"
				+ "đ	d-\r\n"
				+ "lj	lj\r\n"
				+ "nj	nj\r\n"
				+ "š	s=\r\n"
				+ "ž	z=");
		
		sb.append(st.nextToken());
		
		
	}
}
