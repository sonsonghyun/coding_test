package b_2;
import java.util.*;

public class java1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int F = sc.nextInt();
        N = (N/100) * 100;

        while(N%F != 0)
            N++;

        N %= 100;

        if(N < 10) System.out.println("0" + N);
        else System.out.println(N);
    }
}
