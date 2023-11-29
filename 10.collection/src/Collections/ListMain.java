package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListMain {
    public static void main(String[] args) {
        // List는 인터페이스다.

        // ArrayList : 배열을 관리해주는 Collection - List
        List<String> f4Names = new ArrayList<>();
        f4Names.add("구준표");
        f4Names.add("윤지후");
        f4Names.add("소이정");
        f4Names.add("송우빈");
        System.out.println(f4Names.get(0)); //구준표
        System.out.println(f4Names.get(1)); //윤지후
        System.out.println(f4Names.get(2)); //소이정
        System.out.println(f4Names.get(3)); //송우빈
        //중간에 넣기
        f4Names.add(2, "금잔디");
        System.out.println(f4Names); //[구준표, 윤지후, 금잔디, 소이정, 송우빈]
        f4Names.add("성덕선");
        System.out.println(f4Names); //[구준표, 윤지후, 금잔디, 소이정, 송우빈, 성덕선]
        System.out.println(f4Names.size()); //6


        //데이터 위치 찾기
        System.out.println("금잔디 ist at: " + f4Names.indexOf("금잔디")); //금잔디 ist at: 2
        System.out.println("성보라 ist at: " + f4Names.indexOf("성보라")); //성보라 ist at: -1

        //데이터 제거하기
        System.out.println(f4Names.remove(3)); //순서를 기준으로 (value) //소이정
        System.out.println(f4Names); //[구준표, 윤지후, 금잔디, 송우빈, 성덕선]
        System.out.println(f4Names.remove("성덕선")); //값을 기준으로 (boolean) //true
        System.out.println(f4Names.remove("성덕선")); //값을 기준으로 (boolean) //false
        System.out.println(f4Names); //[구준표, 윤지후, 금잔디, 송우빈]


        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        System.out.println(intList); //[10, 20, 30, 40]
        System.out.println(intList.remove(2)); //30
        System.out.println(intList.remove(Integer.valueOf(50))); //false

        List<Integer> intList2 = new LinkedList<>();

//////////////////////////////////////////////////////////////////////////////////

        ArrayList<Integer> intArrayList = new ArrayList<>();
        LinkedList<Integer> intLinkedList = new LinkedList<>();
        sum(intArrayList);
        sum(intLinkedList);


        /*
Scanner와 List
엔터로 구분된 입력이 임의의 횟수만큼 이뤄진다.
q가 입력되면 모든 데이터가 입력된 것이라고 생각할 때,
여태까지 입력했던 데이터를 순서데로 출력하시오
 */


    }


    // ✨✨중요
    // 매개변수로 전달할 때는 기능을 중요시하는 interface 기준으로 매개변수 선언
    public static int sum(List<Integer> intList) {
        return 0;
    }

    // ✨✨중요
    // 구현을 중시하는 방식으로 요구를 하면 기능적 측면의 차이가 없는 클래스는
    // 하나도 못쓴다.
    // public static int sum(ArrayList<Integer> intList) {
    //     return 0;
    // }

//////////////////////////////////////////////////////////////////////////



}
