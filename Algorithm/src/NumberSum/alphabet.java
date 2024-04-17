package NumberSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class alphabet {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		String a = st.nextToken().toUpperCase();

		StringBuilder sb = new StringBuilder();

		int bestScore = 0;

		Map<Character, Integer> alphabet = new HashMap<>();

		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			alphabet.put(c, alphabet.getOrDefault(c, 0) + 1); // 해당 알파벳의 등장 횟수를 증가시킴
		}
		
		for (int count : alphabet.values()) {
			if (count > bestScore) {
				bestScore = count;
			}
		}

		int maxCount = 0;
		// 등장 횟수가 최대 등장 횟수와 같은 알파벳의 개수를 세기
		for (int count : alphabet.values()) {
			if (count == bestScore) {
				maxCount++;
			}
		}
		
		 if (maxCount > 1) {
	            System.out.println("?");
	        } else {
	            // 그렇지 않으면 최대 등장 횟수를 가진 알파벳 출력
	            for (Map.Entry<Character, Integer> entry : alphabet.entrySet()) {
	                if (entry.getValue() == bestScore) {
	                    System.out.println(entry.getKey());
	                    break; // 하나만 출력하고 종료
	                }
	            }
	        }
	}
}
