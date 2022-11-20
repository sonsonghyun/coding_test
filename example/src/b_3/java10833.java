package b_3;

import java.util.Scanner;

public class java10833 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int sum = 0;

        for(int i=0; i<count; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int rest = b%a;
            sum += rest;
        }
        System.out.println(sum);
    }
}
