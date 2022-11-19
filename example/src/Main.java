import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int x = in.nextInt();
        int y = in.nextInt();
        int sum = 0;

        for(int i=0; i<=100; i++){
            int num = (int)Math.pow(i,2);
            if(num >= x && num <= y) list.add(num);
            if(num>y) break;
        }
        if(list.size()==0)
            System.out.println(-1);
        else{
            for(int j=0; j<list.size(); j++){
                sum+=list.get(j);
            }
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }
}
