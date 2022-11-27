package java_jungsuk_ex;

public class ex343 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        System.out.println((sb==sb2));
        System.out.println(sb.equals(sb2));

        String s = sb.toString();
        String s2 = sb2.toString();

        System.out.println(s.equals(s2)); // StringBuffer의 인스턴스를 비교하려면 toString() 사용
    }
}
