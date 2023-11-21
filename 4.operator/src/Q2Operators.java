import java.util.Scanner;

public class Q2Operators {
    public static void main(String[] args) {
        /*
         * 현재 시각은 오전 7시.
         * n 시간 후 12시까지 표기된 시계에서
         * 시침이 어떤 숫자 위에 있는지 구하시오.
         * (단 12시는 0으로 표기한다)
         * 0 <= n <= 127
         */
        Scanner sc = new Scanner(System.in);
        int plusTime = sc.nextInt();
        int nowTime = 7;
        int sumTime = (plusTime + nowTime) % 12;
        if (sumTime == 0) {
            sumTime = 12;
        }
        System.out.println(sumTime);

        //강사님 풀이
        Scanner scanner = new Scanner((System.in));
        int current = 7;
        int n = scanner.nextInt();

    }
}