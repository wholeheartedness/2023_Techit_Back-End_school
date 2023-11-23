import java.util.Scanner;
/*
3명의 사람들에 대한 정보가
개행문자로 구분된 이름(문자열)이 세번
개행문자로 구분된 체온(정수)이 세번
입력된다.
이 중 체온이 38도가 넘는 사람들의 이름을 출력하도록 한다.
 */
public class HQ4Control {
    public static void main(String[] args) {
//        //✨답지
//        Scanner sc = new Scanner(System.in);
//        int n = 3;
//        String[] name = new String[n];
//        for ( int i = 0 ; i < n ; i++) {
//            name[i] = sc.nextLine();
//        }
//        int[] temp = new int[n];
//        for ( int i = 0 ; i < n ; i++) {
//            temp[i] = sc.nextInt();
//            sc.nextLine();
//        }
//        for (int i = 0 ; i < n ; i++) {
//            if (temp[i] >= 38){
//                System.out.println("아파요 : " + name[i]);
//            }
//        }
        //✅풀이
        Scanner scanner = new Scanner(System.in);
        // 이름을 담아둘 배열
        String[] names = new String[3];
        // 체온을 담아 둘 배열
        int[] temps = new int[3];

        // 먼저 3번의 이름을 입력받는다.
        for (int i = 0; i < 3 ; i++) {
            names[i] = scanner.nextLine();
        }
        // 그 다음 3번의 체온을 입력받는다.
        for ( int i = 0 ; i < 3 ; i++) {
            temps[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3 ; i++) {
            // 38도가 넘으면
            if (temps[i] > 38) {
                // 같은 위치의 이름을 출력
                System.out.println(names[i]);
            }
        }


    }
}
