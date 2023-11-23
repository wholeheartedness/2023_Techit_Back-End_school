import java.util.Scanner;
/*
1월 1일의 요일과
2월 29일의 유무가 정수, 불린으로 주어진다.

이때 1월 1일의 요일은,
0 - 월요일, 1 - 화요일, 2 - 수요일, 3 - 목요일, 4 - 금요일, 5 - 토요일, 6 - 일요일

으로 입력된다.

각 달의 1일이 무슨 요일인지 1월부터 12월까지 순서대로 출력하는 코드를 작성하시오.
 */
public class HQ6Control {

    public static void main(String[] args) {
//        //✨답지
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        int lastDay = day;
//        String[] lastDayHangeul = new String[12];
//        boolean twentynine = sc.nextBoolean(); // false:없다, true:있다
//
//        int[] month = new int[] {0, 3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3}; // false //전달의 마지막일 - 28일(전월공통)
//        int[] month2 = new int[] {0, 3, 1, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3}; // true
//
//        if (!twentynine) {
//            for (int i = 0; i < 12; i++) {
//                lastDay += month[i];
//                if (lastDay > 6) {
//                    lastDay -= 7;
//                }
//                switch (lastDay){
//                    case 0:
//                        lastDayHangeul[i] = "월요일";
//                        break;
//                    case 1:
//                        lastDayHangeul[i] = "화요일";
//                        break;
//                    case 2:
//                        lastDayHangeul[i] = "수요일";
//                        break;
//                    case 3:
//                        lastDayHangeul[i] = "목요일";
//                        break;
//                    case 4:
//                        lastDayHangeul[i] = "금요일";
//                        break;
//                    case 5:
//                        lastDayHangeul[i] = "토요일";
//                        break;
//                    case 6:
//                        lastDayHangeul[i] = "일요일";
//                        break;
//                }
//                System.out.println((i + 1) + "월 시작 요일은 : " + lastDayHangeul[i]);
//            }
//        } else {
//            for (int i = 0; i < 12; i++) {
//                lastDay += month2[i];
//                if (lastDay > 6) {
//                    lastDay -= 7;
//                }switch (lastDay){
//                    case 0:
//                        lastDayHangeul[i] = "월요일";
//                        break;
//                    case 1:
//                        lastDayHangeul[i] = "화요일";
//                        break;
//                    case 2:
//                        lastDayHangeul[i] = "수요일";
//                        break;
//                    case 3:
//                        lastDayHangeul[i] = "목요일";
//                        break;
//                    case 4:
//                        lastDayHangeul[i] = "금요일";
//                        break;
//                    case 5:
//                        lastDayHangeul[i] = "토요일";
//                        break;
//                    case 6:
//                        lastDayHangeul[i] = "일요일";
//                        break;
//                }
//                System.out.println((i + 1) + "월 시작 요일은 : " + lastDayHangeul[i]);
//            }
//        }

        //✅답지
        // 1월 1일이 무슨 요일인지
        // 2월이 28일인지 29일인지
        // 1~7 사이에는 (for)
        // 홀수달이 31일 짝수달이 30일, 2월은 별도 (if else)
        // 요일을 구하는 자체는 % 7
        // 8~12 사이에는 (for)
        // 홀수달이 30일 짝수달이 31일

        // 요일을 출력하는 것은 숫자와 같은 곳에 해당하는 요일이 저장된 문자열 배열을 활용하는 것을 추천
    }
}
