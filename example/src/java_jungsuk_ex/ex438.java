package java_jungsuk_ex;
import java.util.*;

public class ex438 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId","1234");
        map.put("asdf","1111");
        map.put("asdf","1234");

        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("id와 pw를 입력하세요 : ");
            System.out.print("id: ");
            String id = s.nextLine().trim();

            System.out.println("password : ");
            String password = s.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)){
                System.out.println("입력하신 아이디는 존재하지 않음 다시 입력하세요");
                continue;
            }
            if(!(map.get(id).equals(password))){
                System.out.println("비밀번호 불일치 재입력해주세요");
            }else {
                System.out.println("id와 비밀번호가 일치합니다");
                break;
            }
        }
    }
}
