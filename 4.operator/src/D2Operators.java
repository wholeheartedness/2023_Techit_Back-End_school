import java.util.Scanner;
public class D2Operators {
    public static void main(String[] args) {
        int plus = 10 + 20;             // 30
        int minus = 20 - 10;            // 10
        int multiply = 20 * 10;         // 200
        int divide = 20 / 10;           // 2 // 💡정수/정수 = 실수가 나올 수도 있으나 정수로 나옴
        int modulo = 15 % 10;           // 5
        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(modulo);

        // 사칙연산의 우선순위
        int result = 10 + 5 * 3;
        System.out.println(result);      // 25
        // 괄호가 최우선
        result = (10 + 5) * 3;
        System.out.println(result);     // 45
        // %의 우선순위는?
        result = (10 + 5 % 3) / 3 + 2 * 3;
        System.out.println(result);     // 10

        // dive 에러 처리해보기 (실수 출력)
        // ❌1. 데이터를 받는 애를 int가 아니라 double로 해보자
        double doubleDivide = 21 / 10; // 2.0
        System.out.println(doubleDivide);
        // ⭕2. 나누기 전에 실수의 연산이라고 정의
        // 피연산자 중 하나라도 Double이면 결과도 double
        doubleDivide = 21.0 / 10;
        System.out.println(doubleDivide); // 2.1

        // 피연산자 둘 다 정수 변수면?
        // 형변환(Type Casting)
        int intResult = (int) 21.1;
        System.out.println(intResult);
        // 선 변환을 통한 나누기 연산
        int intInputF = 21;
        int intInputS = 10;
        double inputResult = intInputF / intInputS; // ❌2.0
        System.out.println(inputResult);
        inputResult = (double) intInputF / intInputS; // ⭕2.1
        System.out.println(inputResult);

        long largeInt = 4294967296L;
        System.out.println((int) largeInt); // 0
        System.out.println(largeInt);       // 4294967296

        // char 형 변환
        int asciiA = 65;
        System.out.println((char) asciiA); // A
        System.out.println((char) (asciiA + 10)); // K

        // String 덧셈 (String Concatenation)
        System.out.println("여기에 10을 입력하시오: " + 10);
        System.out.println(10 + " + " + 10 + " = " + 20 );
        String formula = 10 + " + " + 10 + " = " + 20;

        // 증감 연산자
        int count = 0;
        //변수 ++
        count++;
        System.out.println("현재 횟수 :" + count); // 1
        count++;
        System.out.println("현재 횟수 :" + count); // 2
        count--;
        System.out.println("현재 횟수 :" + count); // 1
        //변수 --
        ++count;
        System.out.println("현재 횟수 :" + count); // 2

        count = 10;
        System.out.println(++count); // 11 (출력 전에 1 증가, 값 11)
        System.out.println(count++); // 11 (출력 후에 1 증가, 값 12)
        System.out.println(--count); // 11 (출력 전에 1 감소, 값 11)
        System.out.println(count--); // 11 (출력 후에 1 감소, 값 10)
        System.out.println(count); // 10

        //복합 할당 연산자
        int addTo = 1;
        addTo += 10;                //addTo = addTo + 10
        System.out.println(addTo);  // 11
        addTo *= addTo;             //addTo = addTo * addTo
        System.out.println(addTo);  // 121
        addTo /= 12;                //addTo = addTo / 12
        System.out.println(addTo);  //10
        addTo %= 10;                //addTo = addTo % 10
        System.out.println(addTo);  //0
        addTo -= 20;                //addTo = addTo  20
        System.out.println(addTo);  //-20
        addTo *= -1;                //addTo = addTo * -1
        System.out.println(addTo);  //2-

        //비교 연산자
        int small1 = 10;
        int small2 = 20;
        int big = 91;
        double bigD = 91.0;
        System.out.println(small1 == small2); // true
        System.out.println(big == small2); // false
        System.out.println(big == bigD); // true 형이 다르더라도 실제 값이 얼마냐에 따라 동작함
        System.out.println(small1 > small2); // false

        // 체온은 37 이하 이면서 나이는 20 이상 : 입장 가능
        int temp = 36;
        int age = 21;
        // 체온은 37 이하
        boolean notSick = temp <= 37;
        // 나이는 20 이상
        boolean isOfAge = age >= 20;
        // 입장 가능한가?
        boolean canIn = notSick && isOfAge;
        System.out.println(canIn); // true

        // 아니다.
        int number = 10;
        boolean isNegative = number < 10;
        boolean isNotNegative = !isNegative; // !=
        System.out.println(isNegative);
        System.out.println(isNotNegative);

        // 비트 연산자
        // 11 = 0000 1011
        //  5 = 0000 0101
        // 비트연산 AND (&)
        System.out.println(11 & 5); // 1 = 0000 0001
        // 비트연산 OR (|)
        System.out.println(11 | 5); // 15 = 0000 1111
        // 비트연산 XOR (^)
        System.out.println(11 ^ 5); // 14 = 0000 1110
        // 비트연산 NOT (~)
        System.out.println(~11); // -12 = 1111 0100
        System.out.println(~5); // -6 = 1111 1010
        // 비트연산 SHIFT (<<, >>, >>>)
        // 12 = 0000 1100
        System.out.println(12 << 2); // 48 = 0011 0000 (*2*2)
        System.out.println(12 >> 1); // 6 = 0000 0110 (/2)
        System.out.println(-12 >> 1); // -6 = 1111 1001 (*2)
        System.out.println(-12 >>> 1); // 2147483642 = 0111 1001

        //삼항 연산자
        int temperature = 37;
        String msg = temperature < 38 ? "OK" : "Sick" ; //OK
        System.out.println(msg);
        //미세먼지 수치
        Scanner sc = new Scanner(System.in);
        int dust = sc.nextInt();
        // 80이하면 "좋음", 아니면 "나쁨"
        String message = dust <= 80 ? "좋음" : "나쁨";
        System.out.println(String.format("미세먼지 수치: %d, (%s)", dust, message));

    }

}
