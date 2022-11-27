package b_2;

import java.util.Scanner;

public class java2675 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        for(int i=0; i<count; i++){
            int a = in.nextInt();
            String text = in.next();
            char[] list = new char[text.length()];
            for(int j=0; j<text.length();j++){
                list[j] = text.charAt(j);
                System.out.print(String.valueOf(list[j]).repeat(a));
            }
            System.out.println();
        }
    }
}
