package NumberSum;

import java.util.Scanner;

public class helloWorld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A= sc.nextInt();
		int B= sc.nextInt();
		
		int beak = B/100;
		int sip = (B-beak*100)/10;
		int il = (B-beak*100-sip*10)/1;
		
		
		System.out.println(A*beak);
		System.out.println(sip);
		System.out.println(il);
		System.out.println(A*B);
		
	}
}
