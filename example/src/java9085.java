import java.util.*;

public class java9085 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        for(int i=0; i<count; i++){
            int sum = 0;
            int a = in.nextInt();
            for(int j=0; j<a; j++){
                int single = in.nextInt();
                sum+= single;
            }
            System.out.println(sum);
        }
    }
}
