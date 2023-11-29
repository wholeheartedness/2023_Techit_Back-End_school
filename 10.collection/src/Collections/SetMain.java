package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> dayRutinSet = new HashSet<>();
        dayRutinSet.add("기상");
        dayRutinSet.add("수업듣기");
        dayRutinSet.add("알고리즘풀기");
        dayRutinSet.add("학습회고");
        dayRutinSet.add("아르바이트");
        dayRutinSet.add("아르바이트");
        System.out.println(dayRutinSet); //[학습회고, 기상, 아르바이트, 알고리즘풀기, 수업듣기]

        List<String> weekendRutinList = new ArrayList<>();
        weekendRutinList.add("기상");
        weekendRutinList.add("부산가기");
        weekendRutinList.add("데이트하기");
        weekendRutinList.add("술먹기");
        weekendRutinList.add("유튜브보기");
        System.out.println(weekendRutinList); //[기상, 부산가기, 데이트하기, 술먹기, 유튜브보기]

        // 다른 Collection의 원소를 전부 추가 시도
        // 내가 없는 원소들을 선별해 추가한다.
        // 하나라도 추가하는데 성공하면 true 반환

        System.out.println(dayRutinSet.addAll(weekendRutinList)); //true
        System.out.println(dayRutinSet); // [학습회고, 기상, 아르바이트, 알고리즘풀기, 술먹기, 데이트하기, 유튜브보기, 수업듣기, 부산가기]


        List<String> favoriteRutin = new ArrayList<>();
        favoriteRutin.add("샌드위치 먹기");
        favoriteRutin.add("책읽기");
        favoriteRutin.add("영화보기");
        favoriteRutin.add("술먹기");
        favoriteRutin.add("유튜브보기");

        //아이템 제거하기
        System.out.println(dayRutinSet.removeAll(favoriteRutin));
        System.out.println(dayRutinSet); //[학습회고, 기상, 아르바이트, 알고리즘풀기, 데이트하기, 수업듣기, 부산가기]

        //집합 비우기
        dayRutinSet.clear();
        System.out.println(dayRutinSet); //[]


        /////////////////////////🕊️비둘기/////////////////////////////////
        List<Pigeon> listHoles = new ArrayList<>();
        Set<Pigeon> setHoles = new HashSet<>();

        //20마리의 비둘기 만들기
        for (int i = 0; i < 20; i++) {
            Pigeon pigeon = new Pigeon(i % 10); //0,1,2,....,9,0,1,2,...,9 : 총 20마리
            listHoles.add(pigeon);
            setHoles.add(pigeon);
        }

        // 각 객체로써 나이를 가지므로 둘다 20마리가 생성됨
        System.out.println("리스트의 비둘기 마리 :" + listHoles.size()); // 20
        System.out.println("집합의 비둘기 마리 :" + setHoles.size()); // 20

        ///////////////////////////////////////////////////////////////////////////


    }
}
