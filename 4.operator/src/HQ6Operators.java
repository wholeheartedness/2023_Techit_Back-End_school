import java.util.Scanner;

public class HQ6Operators {
    /*
    바쁜 일정으로 컨디션이 안좋아져서,
    체온이 38도 이상이거나 36도 이하일때는 병원에 가기로 했다.
    체온을 입력받아서 병원에 가야할지를 true 또는 false로 출력하여라.
    체온은 실수(double)로 주어진다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        boolean isGoHospital = temp >= 38 || temp <= 36;
        System.out.println(String.format("체온: %.2f, 병원 갈지말지: %s", temp, isGoHospital));
    }
}
