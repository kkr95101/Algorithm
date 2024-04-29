package NumberSum; 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class convertFromDecimal {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String number1 = input[0];
        long number = Long.valueOf(number1);
        int base = Integer.parseInt(input[1]);
        String result = convertFromDecimal(number, base);
        System.out.println(result);
    }

    // B진법 수를 10진법으로 변환하는 메서드
    private static String convertFromDecimal(long number, int base) {
        StringBuilder result = new StringBuilder();

        while (number > 0) {
            long remainder = number % base; // 나머지를 구함
            char digit;

            if (remainder < 10) {
                digit = (char) ('0' + remainder); // 나머지가 10 미만이면 그대로 문자로 변환
            } else {
                digit = (char) ('A' + (remainder - 10)); // 나머지가 10 이상이면 A 이상의 문자로 변환
            }

            result.insert(0, digit); // 문자열의 앞쪽에 나머지를 추가
            number = number/base; // 몫을 구함
        }

        return result.toString();
    }
}


