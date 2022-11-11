import java.util.*;

public class java1267 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        int total = 0;
        int x=0;
        int y=0;

        for(int i=0; i<count; i++){
            int a = in.nextInt();
            x+=((a/30)+1)*10;
            y+=((a/60)+1)*15;
        }

        if(x==y)
            System.out.println("Y M "+x);
        else if(x>y)
            System.out.println("M "+y);
        else if(x<y)
            System.out.println("Y "+x);
    }
}
