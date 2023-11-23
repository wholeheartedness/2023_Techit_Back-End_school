import java.util.Scanner;
/*
한 정수를 입력받는다.
이후 이 정수를 거듭제곱하며 1의 자리를 확인하면서,
몇번 거듭제곱 했을 때 다시 원래의 숫자의 1의 자리랑 일치하는지 출력하여라.
한번만 거듭제곱해도 본래 숫자가 되면 결과는 1이다.
 */
public class HQ5Control {

    public static void main(String[] args) {
//        //✨답지
//        // 거듭제곱을 거듭거듭제곱으로 알았구만....
//        // 다시 풀어보자..
//        Scanner sc = new Scanner(System.in);
//        long n = sc.nextInt();
//        long n1 = n % 10;
//        long m1 = 0;
//        System.out.println("1의자리 :" + n1);
//
//        if (n1 == 2 || n1 == 3 || n1 == 4 || n1 ==8){
//            System.out.println("일치할 수 없습니다");
//        } else {
//            for (int i = 0 ; i < 10; i++) {
//                    n *= n;
//                    m1 = n%10;
//                    System.out.println("거듭제곱 =" + n);
//                    System.out.println("거듭제곱 1의자리 =" + m1);
//
//                    if ( m1 == n1 ) {
//                        System.out.println((i+1)+"번째 거듭제곱에 일치합니다");
//                    break;
//                    }
//            }
//        }

        //✅풀이
        Scanner scanner = new Scanner(System.in);
        // 1의 자리만 확인해도 괜찮다.
        // base가 원래 1의 자리 (거듭제곱 할때도 사용)
        int base = scanner.nextInt() % 10;
        // 현재 얼마인지를 저장하기 위한 변수 (시작은 입력값)
        int now = base;
        // 몇 번 반복했는지 세기 위한 변수
        int i = 0;
        // 결과가 나올 때 까지 반복한다
        while(true){
            now *= base;
            // 1의 자리만 남긴다.
            now %= 10;
            // 횟수를 증가시킨다.
            i++;
            // 종료조건 확인
            if (now == base) {
                break;
            }
        }
        System.out.println(i);
    }
}