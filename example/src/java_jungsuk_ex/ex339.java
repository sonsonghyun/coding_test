package java_jungsuk_ex;
import java.util.*;

public class ex339 {
    public static void main(String[] args) {
        int iVal = 100; //정수형
        String strVal = String.valueOf(iVal); //문자열

        double dVal = 200.0; //정수형
        String strVal2 = dVal +""; //문자열

        double sum = Integer.parseInt(strVal)+Double.parseDouble(strVal2);
        double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);

        System.out.println(String.join("",strVal,"+",strVal2,"=")+sum);
        System.out.println(strVal+"+"+strVal2+"="+sum2);

    }
}
