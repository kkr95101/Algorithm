package NumberSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		String a =(String)st.nextElement();

		for (int i = 0; i < a.length(); i++) {
			a= a.replace("c=", "0");
			a= a.replace("c-", "1");
			a= a.replace("dz=","2");
			a= a.replace("d-", "3");
			a= a.replace("lj", "4");
			a= a.replace("nj", "5");
			a= a.replace("s=", "6");
			a= a.replace("z=", "7");
		}
		System.out.println(a.length());
	
		
	}
}
