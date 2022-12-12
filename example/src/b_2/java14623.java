package b_2;

import java.math.BigInteger;
import java.util.*;

public class java14623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger a = sc.nextBigInteger(2);
        BigInteger b = sc.nextBigInteger(2);

        BigInteger multiply = a.multiply(b);

        sc.close();

        String answer = multiply.toString(2);
        System.out.println(answer);
    }
}
