import java.util.*;

public class java9325 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();//테스트 케이스 개수

        for(int i=0; i<count; i++){
            int a = in.nextInt(); // 자동차 가격
            int b = in.nextInt(); // 옵션 개수
            int sum = 0;
            for(int j=0; j<b; j++){
                int x = in.nextInt();
                int y = in.nextInt();
                sum+=(x*y);
            }
            System.out.println(sum+a);
        }
    }
}