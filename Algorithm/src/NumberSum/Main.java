package NumberSum;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Set<String> unheard = new HashSet<>();
        Set<String> tempUnheard = new HashSet<>();
        Set<String> unseen = new HashSet<>();
        Set<String> tempUnseen = new HashSet<>();
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            unheard.add(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            unseen.add(st.nextToken());
        }
        tempUnheard = unheard;
        // 듣도 보도 못한 사람의 명단을 구함 (교집합)
        unheard.retainAll(unseen);
        
        int a = tempUnheard.size()-unheard.size();
        System.out.println(a);
        int b = unseen.size()-unheard.size();
        System.out.println(b);
        System.out.println(a+b);
       
    }
}
