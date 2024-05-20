package NumberSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int Number = Integer.parseInt(st.nextToken());
		if (isPrime(Number)) {
			System.out.println(Number);
		}
		if(Number%2==0) {
			for (int i = 0; i < Number/2; i++) {
				System.out.println("2");
				Number = Number/2;
			}
		}
		if(Number%3==0) {
			for (int i = 0; i < Number/3; i++) {
				System.out.println("3");
				Number = Number/3;
			}
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		if (n % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}
}