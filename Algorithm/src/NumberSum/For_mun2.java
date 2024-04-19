package NumberSum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class For_mun2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Integer> d = new ArrayList<Integer>();
		int sum = 0;
		while(sc.hasNextLine()){
			String input = sc.nextLine().trim();
			if(input.isEmpty()) {
				break;
			}
			String[] c = input.split(" ");
			for (int i = 0; i < c.length; i++) {
				 d.add(Integer.valueOf(i));
			}
		}
		for (int i = 0; i < d.size(); i++) {
			sum += d.get(i);
		}
		System.out.println(sum);
		sc.close();
	}
}
