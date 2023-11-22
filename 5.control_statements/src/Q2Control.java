import java.util.Scanner;

public class Q2Control {
    /*
        정수 n이 입력된 뒤, n개의 이름이 개행을 기준으로 입력이 된다고 가정할 때,
        n개의 이름을 입력된 순서의 반대로 출력하여라.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //3
        //Alex Rodz
        //Brad
        //Chad
        int n = sc.nextInt();
        // 정수 입력 이후 개행 소모 용도
        sc.nextLine();

        String[] names = new String[n];
        // n개의 이름 입력 받기
        for (int i = 0 ; i < n ; i++){
            names[i] = sc.nextLine();
        }
        //이 시점에서 모든 이름을 받은 상태이다.

        for (int i = 0 ; i < n ; i++){
            // 0 ~ n - 1까지 n개 이므로
            // 제일 뒤에 있는 애는 n - 1에 있다
            System.out.println(names[n - i - 1]);
        }

    }
}
