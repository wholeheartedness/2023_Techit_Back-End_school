package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        //JS의 JSON
        //연락처를 검색하는 기준?
        //이름 - 전화번호
        //Key - Value

        /////////////////////////////////////////☎️전화번호부////////////////////////////////////////
        Map<String, String> contactBook = new HashMap<>();
        //Map에 연락처 저장
        contactBook.put("구준표", "010-1111-1111");
        contactBook.put("윤지후", "010-2222-2222");
        contactBook.put("송이정", "010-3333-3333");
        System.out.println(contactBook.put("송우빈", "010-4444-4444")); //null
        System.out.println(contactBook.put("송우빈", "010-5555-5555")); //010-4444-4444
        contactBook.put("구준표", "010-1111-2222");
        System.out.println(contactBook.get("구준표")); //010-1111-2222

        //Map에서 연락처 찾아오기
        System.out.println(contactBook.get("구준표")); //010-1111-1111
        System.out.println(contactBook.get("금잔디")); //null

        // keySet(), entrySet()
        // Map을 순회하고 싶으면 둘 중 하나 선택할 수 있다.
        // KeySet() - key로만 구성된 set
        for (String key : contactBook.keySet()) {
            System.out.println(key); //key만 출력
            System.out.println(contactBook.get(key)); //value만 출력
        }

        // entrySet() - Key - Value 쌍으로 구성된 Set
        for (Map.Entry<String, String> entry : contactBook.entrySet()) {
            System.out.println(entry); //key와 value 출력
            System.out.println(entry.getKey()); //key만 출력
            System.out.println(entry.getValue()); //value만 출력
        }


        /////////////////////////////////////////🧑‍🎓전공생 수////////////////////////////////////////
        Map<String, Integer> class4Score = new HashMap<>();
        class4Score.put("Korean", 10);
        class4Score.put("Math", 20);
        class4Score.put("English", 15);
        class4Score.put("Science", 30);
        System.out.println(class4Score); //{English=15, Science=30, Korean=10, Math=20}

        //만약 데이터를 넣어야 되는 상황에, 새로운 전공이 생기면?
        //1. class4Score.get("score") == null
        String newSubject = "Social";

        if (class4Score.get(newSubject) == null) {
            class4Score.put(newSubject, 40);
        } else {
            int before = class4Score.get(newSubject);
            class4Score.put(newSubject, before + 40);
        }

        // 2.putIfAbsent
        Integer before2 = class4Score.putIfAbsent(newSubject, 40);
        if (before2 != null) {
            class4Score.put(newSubject, before2 + 40);
        }
        System.out.println(class4Score); //{Social=80, English=15, Science=30, Korean=10, Math=20}

        //Value로써 Collection(Set,List)를 쓰고 싶다면?
        Map<String, List<String>> class4Student = new HashMap<>();
        class4Student.put("Korean", new ArrayList<>());
        List<String> KoreanStudents = class4Student.get("Korean");
        KoreanStudents.add("구준표");
        KoreanStudents.add("금잔디");
        KoreanStudents.add("윤지후");
        KoreanStudents.add("구준표");
        System.out.println(class4Student); //{Korean=[구준표, 금잔디, 윤지후, 구준표]}





    }
}
