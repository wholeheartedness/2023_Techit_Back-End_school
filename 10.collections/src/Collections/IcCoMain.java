package Collections;

import java.util.*;


public class IcCoMain {
    public static void main(String[] args) {
        ///////////////////////////////✨Iterable////////////////////////////////
        // Iterable 또는 Collection 또는 List 또는 Set
        // 전부 순회 가능하다.
        List<String> dayRutinList = new ArrayList<>();
        dayRutinList.add("기상");
        dayRutinList.add("수업듣기");
        dayRutinList.add("알고리즘풀기");
        dayRutinList.add("학습회고");
        dayRutinList.add("아르바이트");
        for (String rutin : dayRutinList) {
            System.out.println(rutin);
            //dayRutinList.remove("아르바이트");
        }

        //Iterator
        Iterator<String> iter = dayRutinList.iterator();
        while (iter.hasNext()) { // 실제 데이터를 가지고 옵니다.
            String rutin = iter.next();
            //iter.remove를 쓰면
            //안전하게 순회 중 제거가 가능
            if("아르바이트".equals(rutin)){
                iter.remove();
            }
        }
            System.out.println(dayRutinList);

        ///////////////////////////////✨collection////////////////////////////////
        List<String> listCollection = new ArrayList<>();
        Set<String> setCollection = new HashSet<>();

        // List의 Collection 메서드들
        System.out.println(listCollection.size());
        System.out.println(listCollection.isEmpty());
        System.out.println(listCollection.contains(""));
        System.out.println(listCollection.containsAll(setCollection));

        // Set의 Collection 메서드들
        System.out.println(setCollection.size());
        System.out.println(setCollection.isEmpty());
        System.out.println(setCollection.contains(""));
        System.out.println(setCollection.containsAll(listCollection));

        // Collection의 문서를 보면,
        // Collection 인터페이스를 구현하는 클래스는
        // 1. 아무것도 없는 기본 생성자와
        // 2. 다른 Collection을 받아 그 모든 원소를 가지는 생성자를
        // 만듦이 마땅하다
        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("Java");
        listWithDuplicates.add("Java");
        listWithDuplicates.add("Java");
        listWithDuplicates.add("Java");
        listWithDuplicates.add("Java");
        Set<String> setNoDuplicates = new HashSet<>(listWithDuplicates);
        System.out.println(setNoDuplicates);


    }
}
