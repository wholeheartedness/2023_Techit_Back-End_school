import java.util.Scanner;

public class HQ2Control {
    /*
    축구리그에서는 승점을, 승리시 3점 무승부시 1점, 패배시 0점을 획득한다.
    남은 경기와 현재 승점과 목표 승점이 주어졌을 때,
    남은 경기에서 목표 승점을 넘을 수 있으면 필요한 최소 승수를
    없으면 최고 승점을 출력하여라.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int 남은경기 = sc.nextInt();
        int 현재승점 = sc.nextInt();
        int 목표승점 = sc.nextInt();
        int 필요승수 = 0;

//        if (남은경기 > 0) {
            if ( 목표승점 <= (현재승점+남은경기*3) ){
                필요승수 = (목표승점-현재승점)/3;
                if (필요승수 >= 1) {
                    System.out.println("필요승수 :" + 필요승수);
                } else if (필요승수 == 0) {
                    System.out.println("필요승수 :" + (필요승수+1));
                } else {
                    System.out.println("필요승수를 달성했습니다");
                }
            } else {
                System.out.println("최고승점 :" + (현재승점+(남은경기*3)));
            }

//        }else {
//            if ( )
//            System.out.println("남은경기가 없습니다.");
//        }
    }
}
