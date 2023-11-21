import java.util.Scanner;

public class Q5Operators {
/*
기온이 20도 초과, 30도 미만일 때 나들이 가기가 좋다.
기온을 입력받아 오늘 나들이를 갈지 말지를 true 또는 false로 나타내시오.
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        boolean decide = 20 < temp && temp < 30;
        System.out.println(decide);

        // 강사님 풀이
        Scanner scanner = new Scanner(System.in);
        int temp1 = scanner.nextInt();
        boolean goOut = temp1 > 20 && temp1 < 30;
        System.out.println(goOut);
    }
}
