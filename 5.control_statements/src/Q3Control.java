import java.util.Scanner;

public class Q3Control {
    /*
     * 한 정수를 입력받는다. 이 정수는 잔고이다.
이후 반복해서 인출할 돈을 정수로 계속 입력받는다.
인출한 결과를 "성공: 잔고"의 형태로 출력하고,
잔고가 부족할 경우 "잔고가 부족합니다". 라고 출력 뒤 프로그램을 종료하여라.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int 잔고 = sc.nextInt();
//        int 인출 = 0;
//
//        if (잔고 > 인출) {
//            for (int i = 0; 인출 < 잔고; i++) {
//                인출 = sc.nextInt();
//                잔고 -= 인출;
//                System.out.println("성공! 잔고: " + 잔고);
//                continue;
//            }
//        } else {
//            System.out.println("잔고가 부족합니다");
//        }
        int bank = sc.nextInt();
        while (true) {
            //얼만큼 인출할지를
            int withdraw = sc.nextInt();
            //인출할 금액이 잔고보다 많을 경우
            if (withdraw > bank) {
                System.out.println("잔고가 부족합니다");
                break;
            }
            bank -= withdraw;
            System.out.println(String.format("성공: %d", bank));
        }
    }
}
