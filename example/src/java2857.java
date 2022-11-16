import java.util.Scanner;

public class java2857 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name[] = new String[5];
        int sum = 0;
        for(int i=0; i<5; i++){
            name[i] = in.nextLine();
        }

        for(int j=0; j<name.length; j++){
            if(name[j].contains("FBI")){
                System.out.print(j+1+" ");
                sum++;
            }
        }
        if(sum==0)
            System.out.println("HE GOT AWAY!");
    }
}
