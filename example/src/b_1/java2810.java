import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int count = 1;
        for(int i=0; i<num; i++) {
            if(str.charAt(i) == 'S') count++;
            else if(str.charAt(i) == 'L') {
                count += 1;
                i++;
            }
        }
        if(num > count) {
            System.out.println(count);
        }
        else {
            System.out.println(num);
        }
        bw.flush();
        bw.close();
    }
}