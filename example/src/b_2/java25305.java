package b_2;

import java.util.Arrays;
import java.util.Scanner;

public class java25305 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        int limit = in.nextInt();

        int[] list = new int[count];

        for(int i=0; i<count; i++){
            int a = in.nextInt();
            list[i] = a;
        }
        Arrays.sort(list);
        System.out.println(list[count-limit]);
    }
}
