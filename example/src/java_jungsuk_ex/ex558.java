package java_jungsuk_ex;
import java.util.*;

public class ex558 {
    public static void main(String[] args) {
        MyFunction f1 = ()-> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() { // 객체의 생성과 선언을 동시에
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };
        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(()-> System.out.println("run()"));
    }

    static void execute(MyFunction f){
        f.run();
    }

    static MyFunction getMyFunction(){
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
    }
}

interface MyFunction{
    void run();
}
