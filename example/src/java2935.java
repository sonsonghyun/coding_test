import java.util.Scanner;
import java.math.BigInteger;

public class java2935 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        BigInteger a = new BigInteger(in.nextLine());
        char c = in.nextLine().charAt(0);
        BigInteger b = new BigInteger(in.nextLine());

        if(c == '*')
            System.out.println(a.multiply(b));
        else if(c == '+')
            System.out.println(a.add(b));
    }
}
