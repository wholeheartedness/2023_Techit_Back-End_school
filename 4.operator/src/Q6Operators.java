import java.util.Scanner;

public class Q6Operators {
    /*
    세개의 양의 정수 A, B, C를 입력받아서,
    A가 B와 C의 공배수인지를 true 또는 false로 출력하여라.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean result = (b%a==0) && (c%a==0);

        System.out.println(result);

        //강사님 풀이
        Scanner scanner = new Scanner(System.in);
        int aq = scanner.nextInt();
        int bq = scanner.nextInt();
        int cq = scanner.nextInt();
        boolean isCommonMultiple =  aq % bq == 0 && aq % cq == 0;
        System.out.println(isCommonMultiple);

    }
}
