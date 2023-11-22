import java.util.Scanner;

public class Q1Control {
    /*
     * n개의 정수를 n번 한줄 띄워 입력받는다.
     * 입력받은 정수의 총합과 평균을 구하라.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int integer = sc.nextInt();
//        int number = sc.nextInt();
//        int sum = 0;
//        for ( int i = 0 ; i < number ; i ++ ) {
//            sum += integer;
//        }
//        System.out.println("총합 :" + sum);
//        System.out.println("평균 :" + sum/number);

        //풀이
        int n = sc.nextInt();
        int sum = 0;
        // 몇개의 정수가 입력될 지 n 에 저장되어 있다.
        // 즉 n번 반복해서 입력을 받으면 된다.
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
        System.out.println((double) sum / n);

    }
}
