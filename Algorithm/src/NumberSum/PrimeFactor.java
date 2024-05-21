package NumberSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PrimeFactor {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());

        // 소인수 분해 결과를 저장할 리스트
        List<Integer> primeFactors = getPrimeFactors(number);

        // 소인수들을 출력
        for (int factor : primeFactors) {
            System.out.println(factor);
        }
    }

    public static List<Integer> getPrimeFactors(int number) {
        List<Integer> factors = new ArrayList<>();

        // 2부터 sqrt(number)까지의 모든 수에 대해 반복
        for (int i = 2; i <= Math.sqrt(number); i ++) {
            // 숫자를 i로 나눌 수 있는 만큼 나누기
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        if (number != 1) {
        	 factors.add(number);
		}

        return factors;
    }
}
