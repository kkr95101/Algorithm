package NumberSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double totalGrade = 0.0;
		int subject = 20;
		double grade = 0;
		for (int i = 0; i < 20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String subjectName = st.nextToken();
			double credit = Double.valueOf(st.nextToken());
			String grade1 = st.nextToken();
			double realGrade = 0.0;

			if (grade1.equals("A+")) {
				realGrade = 4.5;
			} else if (grade1.equals("A0")) {
				realGrade = 4.0;
			} else if (grade1.equals("B+")) {
				realGrade = 3.5;
			} else if (grade1.equals("B0")) {
				realGrade = 3.0;
			} else if (grade1.equals("C+")) {
				realGrade = 2.5;
			} else if (grade1.equals("C0")) {
				realGrade = 2.0;
			} else if (grade1.equals("D+")) {
				realGrade = 1.5;
			} else if (grade1.equals("D0")) {
				realGrade = 1.0;
			} else if (grade1.equals("F")) {
				realGrade = 0.0;
			} else {
				subject--;
				credit = 0.0;
				realGrade = 0.0;
			}

			grade += credit;
			totalGrade += credit * realGrade;

		}
		System.out.println((totalGrade / subject) / (grade / subject));
	}
}
