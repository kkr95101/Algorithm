package NumberSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Minimum {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int rectangleX = Integer.parseInt(st.nextToken());
        int rectangleY = Integer.parseInt(st.nextToken());

        int resultX =0;
        int resultY =0;
        
        if(rectangleX-x >= x) {
        	resultX = x;
        }else {
        	resultX = rectangleX-x;
        }
        
        if(rectangleY-y >= y) {
        	resultY = y;
        }else {
        	resultY = rectangleY-y;
        }
        
        if(resultX>=resultY) {
        	System.out.println(Math.abs(resultY));
        }else {
        	System.out.println(Math.abs(resultX));
        }
    }
}
