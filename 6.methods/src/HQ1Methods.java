import java.util.Scanner;

/*
미세먼지 수치를 입력받고,
0 ~ 30 이면 "좋음"
31 ~ 80 이면 "보통"
80 ~ 150 이면 "나쁨"
151 ~ 이면 "매우 나쁨"
이라는 문자열을 반환하는 메서드를 작성하시오.
 */
public class HQ1Methods {

    public static String result(int dust){
        if (dust >= 0 && dust <= 30){
            return "좋음";
        } else if (dust >= 31 && dust <= 80){
            return "보통";
        } else if (dust >= 81 && dust <= 150){
            return "나쁨";
        } else if (dust >= 151){
            return "매우나쁨";
        } return "숫자를 다시 입력하세요";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dust = sc.nextInt();
        String result = result(dust);
        System.out.println(result);
    }
}
