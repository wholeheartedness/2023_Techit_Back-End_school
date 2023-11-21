import java.util.Scanner;

public class Q1Operator {
    public static void main(String[] args) {
        //나의 풀이
        Scanner scanner = new Scanner(System.in);
        int score1 = scanner.nextInt();
        int score2 = scanner.nextInt();
        int score3 = scanner.nextInt();
        double average = (double) (score1 + score2 + score3) / 3;
        System.out.println(average);

        //강사님 풀이
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[3];
        scores[0] = sc.nextInt();
        scores[1] = sc.nextInt();
        scores[2] = sc.nextInt();
        // ✨나눗셈 직전에 피연산자 둘 중 하나는 실수여야 한다.
        //❌ 계산이 이루어진 후에 형변환을 함
        System.out.println((double) ((scores[0] + scores[1] + scores[2]) / 3));
        //⭕ 계산이 이루어지기 전에 분자 혹은 분모 중 하나를 형변환을 함
        System.out.println((double) (scores[0] + scores[1] + scores[2]) / 3);
    }
}
