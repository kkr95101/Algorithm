package NumberSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Decimal {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        
        List<Integer> decimal = new ArrayList<>();
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        
        while (st1.hasMoreTokens()) {
            int number = Integer.parseInt(st1.nextToken());
            if (isPrime(number)) {
                decimal.add(number);
            }
        }
        System.out.println(decimal.size());
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
     *  n이 1 이하이면 소수가 아닙니다.
		n이 2이면 소수입니다.
		n이 짝수이면 소수가 아닙니다.
		3부터 n의 제곱근까지의 홀수로 n을 나누어 나누어떨어지면 소수가 아닙니다.
     */
}