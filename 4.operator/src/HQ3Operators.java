import java.util.Scanner;

public class HQ3Operators {
    /*
    ASCII 코드로 'A'는 65이다.
    1 ~ 26 사이의 숫자 n이 입력될 때, n번째 알파벳을 대문자로 출력하여라.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char ascii = (char) (num + 64);
        System.out.println(String.format("%d은(는) ASCII로 \"%s\"다",num, ascii));

        //풀이
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((char) (64 + n));
    }
}
