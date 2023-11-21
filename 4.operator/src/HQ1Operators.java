import java.util.Scanner;

public class HQ1Operators {

    /*
    H1
    어떤 야구단의 승, 무승부, 패가 입력된다.
    이 야구단의 승률 (승 / (승 + 패))를, 소숫점 세번째 자리 까지, 아래와 같이 출력하여라.
    86승 2무 56패 승률: 0.606
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int win = sc.nextInt();
        int tie = sc.nextInt();
        int lose = sc.nextInt();

        double odds = (double) win / (win + lose);

        System.out.print(String.format("%d승 %d무 %d패 ", win, tie, lose));
        System.out.println(String.format("승률: %.3f", odds));
    }
}
