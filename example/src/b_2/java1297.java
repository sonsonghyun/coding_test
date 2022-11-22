package b_2;

import java.util.Scanner;

public class java1297 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        double x = (Math.pow(n,2))/(Math.pow(a,2)+(Math.pow(b,2)));
        double y = Math.sqrt(x);

        int j = (int)Math.floor(a*y);
        int k = (int)Math.floor(b*y);

        System.out.println(j+" "+k);
    }
}
