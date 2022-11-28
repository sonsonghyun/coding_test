package b_2;

import java.util.*;
public class java1225 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.next();
        String b = in.next();

        long sum = 0;
        for(int k=0; k<a.length(); k++){
            for(int m=0; m<b.length(); m++){
                sum+=(a.charAt(k)-48)*(b.charAt(m)-48);
            }
        }
        System.out.println(sum);
    }
}
