package b_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java2355 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        long A = Math.min(N, M);
        long B = Math.max(N, M);
        long sum = (A + B) * ((B - A + 1) / 2);

        if((B - A + 1) % 2 != 0) {
            sum += (A + B) / 2;
        }
        System.out.println(sum);
    }
}
