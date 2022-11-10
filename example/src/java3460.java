import java.util.*;

public class java3460 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int count=sc.nextInt();
        for(int i=0;i<count;i++) {
            int a=sc.nextInt();
            String b=Integer.toBinaryString(a);
            for(int j=b.length()-1;j>=0;j--) {
                if(b.charAt(j)=='1') {
                    System.out.print(b.length()-j-1+" ");
                }
            }
            System.out.println();
        }
    }
}