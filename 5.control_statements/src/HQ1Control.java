import java.util.Scanner;

public class HQ1Control {
    /*
     * 한 정수를 입력받아,
     * 해당 정수가 음수인지 양수인지 아니면 0인지 출력하는 코드를 작성하여라.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if ( num > 0 ) {
            System.out.println("양수입니다");
        } else if ( num < 0) {
            System.out.println("음수입니다");
        } else {
            System.out.println("0입니다");
        }
    }

}
