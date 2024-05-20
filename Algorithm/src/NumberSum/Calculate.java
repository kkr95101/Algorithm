package NumberSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String number = br.readLine();
		for (int i = 0; i < Integer.valueOf(number); i++) {
			String input = br.readLine();
			int amount = Integer.parseInt(input);

			int quarters = amount / 25;
			amount %= 25;

			int dimes = amount / 10;
			amount %= 10;

			int nickels = amount / 5;
			amount %= 5;

			int pennies = amount;

			System.out.println(quarters+" "+dimes+" "+nickels+" "+pennies);
		}
	}
}
