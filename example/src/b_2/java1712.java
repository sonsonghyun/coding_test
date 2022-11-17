package b_2;

import java.util.Scanner;

public class java1712 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(b>=c)
            System.out.println("-1");
        else
            System.out.println(a/(c-b)+1);
    }
}
