package optional;

import java.util.Optional;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //에러가 될 수도, 안될수도 있음
        //System.out.println(nullOrString().length());
        String result = nullOrString();
        if (result == null) System.out.println("got: null");
        else System.out.println(result);

        // 아래와 같이 쓸 수 있다.
        Optional<String> optionalString = Optional.ofNullable(nullOrString());
        // isPresent : null이 아닐때 return true
        // isEmpty : null일 때 return true
        if (optionalString.isPresent()) {
            System.out.println(optionalString.get());
        } else {
            System.out.println("got: null");
        }

        // 아래와 같이 줄일 수 있다.
        String resultOrElse = Optional.ofNullable(nullOrString()).orElse("got: null!!");
        System.out.println(resultOrElse);

        // 메서드에서 직접 온 Optional을 다루자.
        String resultFromOptional = nullOrOpt().orElse("got: null from orElse method");
        System.out.println(resultFromOptional);

    }

    public static Optional<String> nullOrOpt() {
        Random random = new Random();
        if (random.nextInt() % 2 == 0) {
            //Optional.of로 Optional을 만든다
            return Optional.of("concrete String");
        } else {
            return Optional.empty();
        }
    }



    public static String nullOrString() {
        Random random = new Random();
        if (random.nextInt() % 2 == 0)
            return "not null string";
        else return null; // 결과가 null이 될 수 있는 함수의 예시
    }
}