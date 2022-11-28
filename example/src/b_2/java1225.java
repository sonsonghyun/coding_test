package b_2;

import java.util.*;
public class java1225 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.next();
        String b = in.next();
        long[] list1 = new long[a.length()];
        long[] list2 = new long[b.length()];
        for(int i=0; i<a.length(); i++){
            list1[i] = (long)a.charAt(i)-48;
        }
        for(int j=0; j<b.length(); j++){
            list2[j] = (long)b.charAt(j)-48;
        }
        long sum = 0;
        for(int k=0; k<list1.length; k++){
            for(int m=0; m<list2.length; m++){
                sum+=(a.charAt(k)-48)*(b.charAt(m)-48);
            }
        }
        System.out.println(sum);
    }
}
