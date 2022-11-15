import java.util.*;

public class java3058 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        for(int i=0; i<count; i++){
            int sum = 0;
            int min = 100;
            for(int j=0; j<7; j++){
                int a = in.nextInt();

                if(a%2==0)
                {
                    sum+=a;
                    if(min>a)
                        min = a;
                }
            }
            System.out.println(sum+" "+min);
        }
    }
}