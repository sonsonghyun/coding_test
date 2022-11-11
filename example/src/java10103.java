import java.util.*;

public class java10103 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int chang = 100;
        int sang = 100;

        int count = in.nextInt();

        for(int i=0; i<count; i++){
            int chang_score = in.nextInt();
            int sang_score = in.nextInt();

            if(chang_score > sang_score)
                sang-=chang_score;
            else if(chang_score < sang_score)
                chang -= sang_score;
        }
        System.out.println(chang);
        System.out.println(sang);
    }
}
