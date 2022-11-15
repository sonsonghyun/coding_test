import java.util.*;

public class java9295 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        for(int i=0; i<count; i++){
            int a= in.nextInt();
            int b= in.nextInt();
            int sum = a+b;
            System.out.println("Case "+(i+1)+": "+sum);
        }
    }
}
