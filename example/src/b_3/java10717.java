package b_3;

import java.util.*;

public class java10717 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();

        int x_price = a*e;
        int y_price = 0;

        int rest = (e-c);
        if(rest<=0)
            y_price = b;
        else
            y_price = b+(rest*d);

        int total = Math.min(x_price,y_price);

        System.out.println(total);
    }
}
