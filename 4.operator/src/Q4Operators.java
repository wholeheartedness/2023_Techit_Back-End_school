import java.util.Scanner;

public class Q4Operators {
    /*
    두 정수 A와 B가 입력될 때,
    A의 세제곱이 B의 제곱보다 크면 true, 아니면 false를
    boolean 변수를 선언하지 않고 출력하여라.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a*a*a > b*b);
    }
}
