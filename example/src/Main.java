import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        for(int i=0; i<count; i++){
            int a = in.nextInt();
            String b = in.next();
            StringBuilder sen = new StringBuilder(b);
            sen.deleteCharAt(a-1);
            System.out.println(sen);
        }
    }
}






















