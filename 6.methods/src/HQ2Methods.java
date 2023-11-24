import java.util.Scanner;

/*
현재 오전 7시이다.
정수 n을 인자로 받아서,
n 시간 후 12시까지 표기된 시계에서
시침이 어떤 숫자 위에 있는지를 반환하는 메서드를 작성하시오.
단, 입력이 0 <= n <= 127 를 벗어나면 -1을 반환하시오.
 */
public class HQ2Methods {
    public static int whatNum(int n) {
        if (n <= 0 || n >= 127) {
            return -1;
        } else {
            int now = 7;
            now += n;
            return now % 12 == 0 ? 12 : now % 12;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int plusTime = sc.nextInt();
        System.out.println(whatNum(plusTime));
    }
}
