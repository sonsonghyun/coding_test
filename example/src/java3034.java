import java.util.*;

public class java3034 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        double x = Math.sqrt(Math.pow(b, 2)+Math.pow(c, 2));
        for(int i=0; i<a; i++){
            int k = in.nextInt();

            if(k<=x)
                System.out.println("DA");
            else if(k>x)
                System.out.println("NE");
        }
    }
}