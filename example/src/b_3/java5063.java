package b_3;

import java.util.*;

public class java5063 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for(int i=0; i<a; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            int rest = y-z;
            if(rest>x)
                System.out.println("advertise");
            else if (rest<x)
                System.out.println("do not advertise");
            else if(rest==x)
                System.out.println("does not matter");
        }
    }
}
