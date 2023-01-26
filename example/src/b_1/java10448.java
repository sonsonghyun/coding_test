import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class java10448 {
    static int[] triNum = new int[45];

    public static void triangular_number(){
        for(int i=1; i<45; i++){
            triNum[i] = i*(i+1)/2;
        }
    }

    public static boolean eureka(int N){
        for(int a=1; a<45; a++){
            for(int b=1; b<45; b++){
                for(int c=1; c<45; c++){
                    if(triNum[a]+triNum[b]+triNum[c]==N) return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        triangular_number();

        for(int t=0; t<T; t++){
            int N = Integer.parseInt(br.readLine());

            if(eureka(N)) bw.write("1");
            else bw.write("0");

            bw.write("\n");
        }
        bw.flush();
    }
}