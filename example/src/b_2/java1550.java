package b_2;

import java.util.Scanner;

// 2,8,16 진수변환 그냥 parseInt() 쓰면 됨
public class java1550 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a=in.next();
        System.out.println(Integer.parseInt(a,16));
    }
}
