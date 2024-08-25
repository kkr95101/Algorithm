package NumberSum;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

	static List<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int number = Integer.valueOf(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < number; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.valueOf(st.nextToken());
			if(num==1) {
				a(Integer.valueOf(st.nextToken()));
			}else if(num==2) {
				b();
			}else if(num==3) {
				c();
			}else if(num==4) {
				d();
			}else {
				e();
			}
			
		}
    }

	private static void e() {
		
		if(list.size()!=0) {
			System.out.println(list.get(list.size()-1));
		}else {
			System.out.println(-1);
		}
	}

	private static void d() {
		if(list.size()!=0) {
			System.out.println(0);
		}else {
			System.out.println(1);
		}
	}

	private static void c() {
		System.out.println(list.size());
		
	}

	private static void b() {
		if(list.size()!=0) {
			System.out.println(list.get(list.size()-1));
			list.remove(list.size()-1);
		}else {
			System.out.println(-1);
		}
		
	}

	private static void a(int i) {
		list.add(i);
	}
}
