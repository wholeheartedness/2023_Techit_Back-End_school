package D8Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        String[] nameArray = {
                "구준표",
                "윤지후",
                "송이정",
                "송우빈",
                "Gold JanDi"
        };
        //////////////////////////////////타입별 Stream/////////////////////////////
        // 📜 Stream <T>는 데이터가 흘러감을 나타내는 객체
        // 🗒️ Arrays.stream : 배열 스트림
        Stream<String> nameArrStream = Arrays.stream(nameArray);

        // ✨원시타입의 스트림
        int[] intArray = {1, 23, 14, 53, 22, 15, 10, 6};
        IntStream intStream = Arrays.stream(intArray);

        // ✨문자열, 문자 스트림
        String email = "junpyo@gmail.com";
        IntStream charStream = email.chars();

        // ✨컬렉션 스트림 (Collection.stream())
        List<String> nameList = new ArrayList<>();
        nameList.add("구준표");
        nameList.add("윤지후");
        nameList.add("송이정");
        nameList.add("송우빈");
        nameList.add("Gold JanDi");
        Stream<String> nameListStream = nameList.stream();




        //////////////////////////////////////stream의 메서드/////////////////////////
        // nameListStream
        //📌 오른쪽 함수 내에서 함수문 작성 가능 (리턴이 있어야 함)
        //📌 메서드 하나가 끝나면 그 중간 연산 결과는 Stream으로 반환됨
        /*
        아래를 줄인 코드임
        Stream<String> nameStream1 = nameListStream.filter(name -> name.contains("a"));
        Stream<String> nameStream2 = nameList1.map(name -> name.toLowerCase());
        Stream<String> nameStream3 = nameList2.filter(System.out::println);
        */

        //🗒️.filter() : 전달받은 함수 (stream 내 데이터)에 필터링(참인 데이터만 선별) 하는 작업 (✅기준을 사용자가 전달해야 함)
        //🗒️.map() : 데이터를 받아 새로운 데이터를 반환하는 작업
        //🗒️.sorted(Comparator.reverseOrder()) : 데이터를 받아 전달받은 기준으로 정렬
        //🗒️.foreach() : 남은 데이터를 각각 전달받은 함수의 인자로 전달
        //🗒️.toList() : 데이터를 새로운 리스트로 만들어서 반환
        //🗒️.allMatch(), anyMatch, nonMatch : 전달받은 함수를 바탕으로, 1)전체가 참인지, 2) 하나라도 참인지 3) 전혀 참이 없는지를 boolean으로 반환합니다.
//            연습예제          .filter(name -> name.contains("구"))
//            연습예제          .map(name -> name.toUpperCase());
//            연습예제          .map(name ->{
//            연습예제            String nameLower = name.toLowerCase();
//            연습예제            String nameUpper = name.toUpperCase();
//            연습예제            return nameLower + nameUpper;
//            연습예제        })
//            연습예제        .map(name -> name.length())
//            연습예제        .sorted(Comparator.reverseOrder())
//            연습예제    .forEach(System.out::println) // 구준표\n윤지후\n소이정\n송우빈\nGOLD JANDI
//            연습예제    .toList();
//            연습예제    .allMatch(name -> name.length() > =4 )
//            연습예제    .anyMatch(name -> name.length() > 5 )
//            연습예제    .nonMatch(name -> name.length() < 3 )
        //📌여기서 Stream이 끝남 -> 다시 사용 불가

        // ❓이름들 중에서 길이는 4 이상이며 / 대문자 A가 들어가있는 / 모든 이름이 d가 포함이 안되어 있는지?
        // ❗
        nameListStream = nameList.stream();
        boolean result = nameListStream
                .filter(name -> name.length() >= 4)
                .filter(name -> name.contains("A"))
                .noneMatch(name -> name.contains("b"));
        System.out.println(result);

        // ❓모든 숫자들 중에서 홀수 이면서 / 10 이상인 숫자들이 / 3의 배수가 아닌지?
        // ❗
        boolean result2 = intStream
                .filter (num -> num % 2 == 1)
                .filter (num -> num >= 10)
                .allMatch(num -> !(num % 3 == 0));
        System.out.println(result2);

        // ❓모든 숫자들 중에서 홀수인 수에 / *2를 한 숫자가 / 전부 4의 배수인지?
        // ❗
        intStream = Arrays.stream(intArray);
        boolean result3 = intStream
                .filter(num -> num % 2 == 1)
                .map(num -> num * 2)
                .allMatch(num -> num % 4 == 0);
        System.out.println(result3);


        // ❓총합을 구하라
        // ❗
        intStream = Arrays.stream(intArray);
        int sum = intStream.sum();

        // ❓갯수를 구하라
        // ❗
        intStream = Arrays.stream(intArray);
        long count = intStream.count();

        // ❓평균, 최소, 최대를 구하라
        // ❗
        // 💡 값이 없으면 도출할 수 없기때문에 Optional 입니다. //Optional.orElse();
        intStream = Arrays.stream(intArray);
        double avg = intStream.average()
                .orElse(0.0);
    }

    // 💻문자열에 a가 포함되었는지 판단하는 메서드
    // ❓입력은 무엇이며 결과는 무엇일까?
    // ❗입력 : String input : name
    // ❗연산 : input.contains("구")
    // ❗결과 : "a"가 들어있으면 true, 없으면 false
    public boolean predicate(String input) {
        return input.contains("구");
    }

    // 💻문자열의 길이가 4 이상인지 판단하는 메서드
    public boolean predicate2(String input) {
        return input.length() >= 4;
    }

    // 💻input을 대문자로 만드는 메서드
    public String toUpper(String input) {
        return input.toUpperCase();
    }
}
