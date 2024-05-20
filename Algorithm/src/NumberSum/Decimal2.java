package NumberSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Decimal2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());

		List<Integer> decimal = new ArrayList<>();

		StringTokenizer st1 = new StringTokenizer(br.readLine());

		int total = 0;

		while (st1.hasMoreTokens()) {
			int number = Integer.parseInt(st1.nextToken());
			for (int i = A; i <= number; i++) {
				if (isPrime(i)) {
					decimal.add(i);
					total += i;
				}
			}
		}
		if (decimal.isEmpty()) {
			System.out.println("-1");
		} else {
			System.out.println(total);
			System.out.println(decimal.get(0));
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
	/*
	 * n이 1 이하이면 소수가 아닙니다. n이 2이면 소수입니다. n이 짝수이면 소수가 아닙니다. 3부터 n의 제곱근까지의 홀수로 n을 나누어
	 * 나누어떨어지면 소수가 아닙니다.
	 * 
	 * 어떤 수 n이 소수가 아닌 경우, 그 약수는 반드시 sqrt(n) 이하의 수 중에 존재합니다. 예를 들어, 36의 약수는 1, 2, 3,
	 * 4, 6, 9, 12, 18, 36입니다. 이 중에서 6은 sqrt(36)인 6보다 작거나 같습니다. 따라서, 제곱근까지 검사하면
	 * 충분합니다.
	 */
}