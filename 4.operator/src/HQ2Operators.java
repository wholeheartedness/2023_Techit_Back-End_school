import java.util.Scanner;

public class HQ2Operators {
    /*
    어떤 수 A와 B가 입력된다..
    A를 B로 나눈 몫과 나머지를, "A = 몫 * B + 나머지"의 형태로 출력하여라.
    예) A = 10, B = 3가 입력될때,
    A = 3 * B + 1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int quotient = a / b;
        int remainder = a % b;

        System.out.println(String.format("%d = %d * %d + %d", a, b, quotient, remainder));

        //풀이
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(String.format("A = %d * B * %d", a / b , a % b));
    }
}
