package D5;

import static java.lang.Integer.parseInt;

public class WrapperClass {
    public static void main(String[] args) {

        //1. 타입이지만 String 처럼 값을 할당 가능합니다.
        String string = "";
        int primInt = 10;
        Integer refInt = 10;

        // 2. 서로 상호 호환이 됩니다.
        refInt = primInt;
        primInt = refInt;

        // 3. 사칙연산도 그냥 참조 타입을 바탕으로 사용 가능합니다.
        refInt *= 10;
        System.out.println(refInt); //100
        refInt /= primInt;
        System.out.println(refInt); //10

        Long refLong = 100000000L;
        refLong *= 2;
        System.out.println(refLong); //200000000

        Character a = 'a';


        // 유용한 기능들
        // 문자열 -> 정수를 반환
        Integer parsedInt = parseInt("1000");
        System.out.println(parsedInt + 100); //1100

        // 문자열 -> 실수 변환
        Double parsedDouble = Double.parseDouble("1.0");
        System.out.println(parsedDouble); //1.0
        parsedDouble = Double.parseDouble("3.141592");
        System.out.println(parsedDouble); // 3.141592

        // 정수 최댓값 & 최솟값 상수
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE); //-2147483648

        // Long 최댓값 & 최솟값
        System.out.println(Long.MAX_VALUE); //9223372036854775807
        System.out.println(Long.MIN_VALUE); //-9223372036854775808

        // Double
        System.out.println(Double.MAX_VALUE); //1.7976931348623157E308
        System.out.println(Double.POSITIVE_INFINITY); //Infinity

        // String
        String sentence = " Hello, world! Have a Good Day";

        // 문자열 길이
        System.out.println(sentence.length()); // 30
        // 문자열 자르기
        System.out.println(sentence.substring(10)); // rld! Have a Good Day
        System.out.println(sentence.substring(7, 12)); // worl

        // 문자열 나누기
        String[] strArry = sentence.split(" ");
        for (String str : strArry) {
            System.out.println(str);
        }
        /*
            Hello,
            world!
            Have
            a
            Good
            Day
         */

        String email = "seojulee@naver.com";
        String[] emailSplit = email.split("@");
        for (String str : emailSplit) {
            System.out.println(str);
        }
        /*
            seojulee
            naver.com
         */

        // 특정 문자열 찾기
        String source = "https://wholeheartedness.tistory.com/@@123";
        System.out.println(source.indexOf("wholeheartedness")); //8 (문자열 8번째에 있습니다)

        // 문자열 한글자씩 확인하는 방법
        // 1. for i 반복
        for (int i = 0; i < source.length(); i++) {
            //문자열을 배열 취급해서 [i]번째 가져오기 (문자열 번호 확인이 필요할 때)
            System.out.println(source.charAt(i));
        }

        // 2. String toCharArray ();
        for (char letter : source.toCharArray()) {
            //문자열 내부에 저장된 문자 배열 반환하기 (전체 문자열 반환하기)
            System.out.println(letter);
        }

        // 각 글자가 영문인지 숫자인지 확인하기
        for (char letter : source.toCharArray()) {
            // 문자가 숫자를 나타내는 문자인지 확인
            if (Character.isDigit(letter)) {
                System.out.println(String.format("digit: %c", letter));
            }
            /*
            digit: 1
            digit: 2
            digit: 3
             */

            // 문자가 인간의 문자를 나타내는 문자인지 확인
            if (Character.isLetter(letter)) {
                System.out.println(String.format("letter : %c", letter));
            }
        }

    }
}

