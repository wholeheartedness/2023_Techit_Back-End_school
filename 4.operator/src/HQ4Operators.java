import java.util.Scanner;

public class HQ4Operators {
    /*
    두 정수 A와 B가 입력될 때,
    A가 B로 나누어 떨어지는지를 true 또는 false로 출력하여라.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean result = a % b == 0;
        System.out.println(result);

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(A % B == 0);

    }
}
