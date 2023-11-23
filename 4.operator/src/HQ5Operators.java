import java.util.Scanner;

public class HQ5Operators {
    /*
    Scanner 이외의 변수를 한개만 선언하여
    정수 A를 입력받아,
    A^2, A^4, A^8의 1의 자리를 순서대로 한줄씩 출력하시오.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(String.format("a의 2제곱은 %d이고, 1의자리는 %d이다",a*a, a*a % 10));
        System.out.println(String.format("a의 4제곱은 %d이고, 1의자리는 %d이다",a*a*a*a, a*a*a*a % 10));
        System.out.println(String.format("a의 8제곱은 %d이고, 1의자리는 %d이다",a*a*a*a*a*a*a*a, a*a*a*a*a*a*a*a % 10));

        //풀이
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        base *= base; // base = base * base
        base %= 10;   // base = (base * base) % 10
        System.out.println(base);
        base *= base;   // base = (base * base % 10) * (base * base % 10)
        //System.out.println(base);
        base %= 10;     // base =
        System.out.println(base);
        base *= base;
        base %= 10;
        System.out.println(base);


    }
}
