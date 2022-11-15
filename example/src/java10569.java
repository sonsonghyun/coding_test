import java.util.*;

public class java10569 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        for(int i=0; i<count; i++){
            int v = in.nextInt();
            int e = in.nextInt();
            System.out.println(e-v+2);
        }
    }
}
