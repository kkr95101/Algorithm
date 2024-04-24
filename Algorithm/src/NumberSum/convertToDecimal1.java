package NumberSum; 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class convertToDecimal1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String number = input[0];
        int base = Integer.parseInt(input[1]);
        long result = convertToDecimal(number, base);
        System.out.println(result);
    }

    // B진법 수를 10진법으로 변환하는 메서드
    private static long convertToDecimal(String number, int base) {
        long result = 0;
        int power = 0;

        for (int i = number.length() - 1; i >= 0; i--) {
            char digit = number.charAt(i);
            int value;
            				//어쩃든 아스키코드에서 뺴기를 해서 만드는거다
            if (Character.isDigit(digit)) { //Character.isDigit(digit) 숫자인지 문자인지 반환하는 메서드 숫자면 true
                value = digit - '0'; // 숫자인 경우 '0'(48)을 빼면 숫자가나옴
            } else {
                value = digit - 'A' + 10; // 알파벳인 경우 'A'(65)를 뺴면서 +10을 하면 10~35사이 숫자로 나옴
            }

            result += value * Math.pow(base, power); //Math.pow는 밑,지수로 계산하는거다 base^power 느낌
            power++;
        }

        return result;
    }
}


