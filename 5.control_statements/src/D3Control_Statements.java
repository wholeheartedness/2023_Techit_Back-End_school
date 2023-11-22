import java.util.Scanner;

public class D3Control_Statements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        //✨조건문
//        // 나이를 입력받고, 나이가 20 미만일때 입장불가 출력
//        //int age = scanner.nextInt();
//        int age = 20;
//        if (age < 20) {
//            System.out.println("입장불가");
//            System.out.println(String.format("%d년 뒤에 오세요", 20 - age));
//        }
//
//        int multiple = scanner.nextInt();
//        // multiple이 2의 배수면, 2의 배수 출력
//        if (multiple % 2 == 0) {
//            System.out.println("2의 배수");
//        }
//        // multiple이 5의 배수면, 5의 배수 출력
//        if (multiple % 5 == 0){
//            System.out.println("5의 배수");
//        }
//        // multiple이 10의 배수면, 10의 배수 출력
//        if (multiple % 10 == 0){
//            System.out.println("10의 배수");
//        }
//
//        // 몇년인지 받는다.
//        int year = scanner.nextInt();
//        int year = 2023
//        if (year % 4 ==0) {
//            if (year % 100 != 0) {
//                System.out.println("평년이다");
//            }
//            if (year % 400 != 0) {
//                System.out.println("윤년이다");
//            }
//        }
//
//        // if-else
//        // 2의 배수면 짝수 아니면 홀수
//        int number = 5;
//        if (number % 2 == 0) {
//            System.out.println("짝수");
//        } else {
//            System.out.println("홀수");
//        }
//
//        // 어떤 학생의 시험점수가 입력 되었을 때,
//        // 80점을 넘으면 "Good Job"
//        // 못넘으면 "Too Bad"
//        int score = scanner.nextInt();
//        if (score > 80) {
//            System.out.println("Good Job");
//        } else {
//            System.out.println("Too Bad");
//        }
//
//        /* Ascii 코드 'A' = 65
//        1~26 사이의 숫자 n이 입력될 때, n번째 알파벳을 대문자로 출력하라.
//        이때, 범위 밖의 입력이 들어오면 "잘못된 입력입니다"를 출력하라.
//         */
//        int n = scanner.nextInt();
//        if (n > 0 && n < 27) {
//            System.out.println((char) (64 + n));
//        } else {
//            System.out.println("잘못된 입력입니다");
//        }
//
//    // 0 ~ 30: 좋음
//    // 31 ~ 80: 보통
//    // 80 ~ 150: 나쁨
//    // 151 ~ : 매우 나쁨
//        int dust = 155;
//        if (dust <= 30) {
//            System.out.println("좋음");
//        } else if (30 < dust && dust <= 80) {
//            System.out.println("보통");
//        } else if (80 < dust && dust <= 150) {
//            System.out.println("나쁨");
//        } else {
//            System.out.println("매우 나쁨");
//        }
//
//        /*
//        어떤 학생의 시험점수가 정수로 주어진다.
//    점수가 90점 이상이면 "수",
//    점수가 80점 이상 90점 미만이면 "우",
//    점수가 80점 미만이면 "미"
//    를 출력하여라.
//         */
//
//        int scores = scanner.nextInt();
//        if (scores >= 0 && scores < 101) {
//            if (scores >= 90) {
//                System.out.println("수");
//            } else if (scores >= 80 && scores < 90) {
//                System.out.println("우");
//            } else {
//                System.out.println("미");
//            }
//        } else {
//            System.out.println("잘못된 입력입니다");
//        }
//
//        //하나의 조건(if)만 맞으면 다른 조건은 확인도 안한다.
//        int zero = 0;
//        if (zero == 0) {
//            System.out.println("is zero");
//        }
//        else if (10 % zero == 0) {
//            System.out.println("is factor");
//        }
//        else {
//            System.out.println("not factor");
//        }
//
//
//        //switch-case
//        String input = scanner.next();
//        //확인하고 싶은 값
//        switch (input) {
//            case "w": // input == "w"
//                System.out.println("up");
//                break;
//            case "a": // input == "a"
//            System.out.println("left");
//                break;
//            case "s": // input == "s"
//            System.out.println("down");
//                break;
//            case "d": // input == "d"
//            System.out.println("right");
//                break;
//            // 기본동작, 필수가 아님
//            default:
//                System.out.println("invalid");
//                break;
//        }
//
//        //아래와 같이 작성도 가능함
//        switch (input) {
//            case "w" ->
//                    System.out.println("up");
//            case "a" ->
//                    System.out.println("left");
//            case "s" ->
//                    System.out.println("down");
//            case "d" ->
//                    System.out.println("right");
//        }
//
//        //✨반복문
//        // while
//        // 카페 포인트
//        int loan = 50000;
//        int months = 0;
//        while ( loan > 0 ) {
//            loan -= 5000;
//            months++;
//            System.out.println(String.format("남은 포인트 : %d", loan));
//        }
//        System.out.println(String.format("포인트 소진 완료! 총 걸린 개월 수 : %d", months));
//
        int[] numbers = {2, 3, 5, 6, 19, 23};
//        int i = 0;
//        // 총합 및 평균 구하기
//        int sum = 0;
//        int avr = 0;
//        while ( i < 6 ) {
//            sum += numbers[i];
//            i++;
//        }
//        System.out.println("총합 :" + sum);
//        System.out.println("평균 :" + sum / i);
//
//        int[] numberss = {2, 3, 5, 6, 19, 23};
//        int ii = 0;
//
//// 총합 및 평균 구하기
//        int summ = 0;
//        while ( ii < numberss.length ) {
//            summ += numberss[ii];
//            ii++;
//        }
//        System.out.println("총합 :" + summ);
//        System.out.println("평균 :" + sum / numberss.length);
//
//
//        //for
//        //총합, 최대, 평균
//        int sum = 0;
//        int max = -100;
//        for (int i = 0 ; i < numbers.length ; i++) {
//            sum += numbers[i];
//            max = numbers[i];
//        }
//        System.out.println("총합 :" + sum);
//        System.out.println("최대값 :" + max);
//        System.out.println("평균 :" + sum / numbers.length);
//
//        int sum = 0;
//        int max = -100;
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//            if (numbers[i] > max) {
//                max = numbers[i];
//            }
//        }
//        System.out.println("총합 :" + sum);
//        System.out.println("최대값 :" + max);
//        System.out.println("평균 :" + (double) sum / numbers.length);
//
//        // 별그리기
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i + 1 ; j++) {
//                System.out.print('*');
//            }
//            System.out.println();
//        }
//
//        // foreach문
//        String[] myHome = {"me", "meow", "computer"};
//        for (String name : myHome) {
//            System.out.println(name);
//        }
//
//        // 같은 기능을 하는 for문은
//        for (int i = 0; i < myHome.length ; i++) {
//            String name = myHome[i];
//            System.out.println(name);
//        }
//
//        // 반복문 제어
//        int wallet = 20000;
//        int price = 5000;
//        while (true) {
//            wallet -= price;
//            if (wallet <= 0) {
//                System.out.println("돈 다 써서 더이상 구매할 수 없어");
//                //그만 먹자.
//                break;
//            }
//            System.out.println(String.format("지갑에 %d 남음", wallet));
//            //break : 가장 가까운 반복문을 멈추고 밖으로 나갈 수 있게 해 줌.
//
//        // numbers 내부에 19가 있는지 확인
//        // 있다면 그 위치를, 없다면 -1을 출력하도록
//        numbers = new int[]{1, 3, 4, 11, 19, 21, 23};
//        int target = -1;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == 19) {
//                target = i;
//                //발견 즉시 반복 종료
//                break;
//            }
//        }
//        System.out.println(target);

        // continue
        // 0~9 사이의 짝수만 출력하고 싶다.
        System.out.println("continue");
        for (int i = 0 ; i < 10 ; i++){
            if (i % 2 != 0) {
                continue;
                //나머지는 무시하고 다시 위로 감
            }
            System.out.println(i);
        }

        // 백신을 맞지 않은 사람만 세기
        boolean[] vaccinated = {true, true, false, false, true, true, false};
        int groupCount = 0;
        for (boolean vaccine : vaccinated) {
            if (vaccine) {
                continue;
            }
            groupCount++;
            //일정 인원 이상이면 입장 불가
            if (groupCount > 5) {
                System.out.println("입장이 불가합니다");
                break;
            }
        }

    }

}
