package b_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class java2587 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i=0; i<5; i++){
            int a = in.nextInt();
            list.add(a);
            sum+=a;
        }
        Collections.sort(list);
        System.out.println(sum/5);
        System.out.println(list.get(2));
    }
}
