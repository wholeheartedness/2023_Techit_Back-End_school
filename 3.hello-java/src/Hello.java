import java.util.Scanner;



public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        System.out.println("만나서 반갑습니다!");
        System.out.println(1024);
        System.out.println(3.141592);
        /*
         * 가나다라
         * 가나다라
         * 가나다라
         * 가나다라
         * 가나다라
         */

        //사용자 입력도 받아봅시다.
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());

        scanner.nextLine();
        System.out.println(scanner.nextLine());
    }
}


