package NumberSum;

import java.util.Arrays;
import java.util.Scanner;

public class if_mun {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String string = sc.nextLine();

		String[] stringArray = string.split(" ");
		
		int[] d = new int[3];
		for (int i = 0; i < stringArray.length; i++) {
			d[i]= Integer.valueOf(stringArray[i]); 
		}
		Arrays.sort(d);
		int sanggum = 0;

		if (d[0] == d[1] && d[1] == d[2] && d[0] == d[2]) {
			sanggum = 10000 + d[1] * 1000;
			System.out.println(sanggum);
		} else if (d[0] == d[1] || d[1] == d[2]) {
			sanggum = 1000 + d[1] * 100;
			System.out.println(sanggum);
		} else {
			sanggum = d[2] * 100;
			System.out.println(sanggum);
		}

	}
}
