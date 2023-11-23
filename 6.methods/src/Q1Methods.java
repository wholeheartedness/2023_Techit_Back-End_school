import java.util.Scanner;

/*
두 정수(int)를 인자로 받아,
두 정수 값의 차이의 절대값을 반환하는 메서드 "diff"를 작성하시오.

+

어떤 정수를 받아서 절대값을 반환하는 메서드 "abs"를 작성하시오.
 */

public class Q1Methods {

    //두 정수의 차의 절대값을 구하는 메서드
    public static int diff (int a, int b){
//        int c = a - b;
//        if (a-b >= 0) {
//            return c;
//        } else {
//            return -c;
//        }
        return abs(a-b); // 먼저 절대값을 반환하는 메서드를 만들고 재사용할 수 있음
    }

    //정수의 절대값을 구하는 메서드
    public static int abs(int a){
        if (a >= 0) {
            return a;
        } else {
            return -a;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(diff (a, b));
        System.out.println(abs (c));
    }


}
