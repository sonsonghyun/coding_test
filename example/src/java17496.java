import java.util.Scanner;

public class java17496 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        int d= in.nextInt();
        int rest = (a-1)/b;
        int result = rest*c*d;
        System.out.println(result);
    }
}
