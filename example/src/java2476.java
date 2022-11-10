import java.util.*;


public class java2476 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int max = 0;

        for (int i = 0; i < count; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int money = 0;
            if (a == b && b == c) {
                money = 10000 + (a * 1000);
            } else if (a != b && b != c && a != c) {
                money = Math.max(a, Math.max(b, c)) * 100;
            } else {
                if (a == b)
                    money = 1000 + (a * 100);
                else if (b == c)
                    money = 1000 + (b * 100);
                else
                    money = 1000 + (c * 100);
            }
            if (money > max)
                max = money;
        }
        System.out.println(max);
    }
}