import java.util.Scanner;

public class Q3Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intInput = new int[5];
        intInput[0] = sc.nextInt();
        intInput[1] = sc.nextInt();
        intInput[2] = sc.nextInt();
        intInput[3] = sc.nextInt();
        intInput[4] = sc.nextInt();
        int result = 0;

        System.out.println(intInput[0] += intInput[1]);
        System.out.println(intInput[1] -= intInput[2]);
        System.out.println(intInput[2] *= intInput[3]);
        System.out.println(intInput[3] %= intInput[4]);


        //강사님 풀이
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        num += scanner.nextInt();
        num -= scanner.nextInt();
        num *= scanner.nextInt();
        num %= scanner.nextInt();
        System.out.println(num);
    }

}
