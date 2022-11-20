package b_3;

import java.util.Scanner;

public class java10178 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        for(int i=0; i<count; i++){
            int a= in.nextInt();
            int b = in.nextInt();
            int mok = a/b;
            int rest = a%b;
            System.out.println("You get "+mok+" piece(s) and your dad gets "+rest+" piece(s).");
        }
    }
}
