import java.util.Scanner;

/*
피보나치 수열은
F(0) = 0
F(1) = 1
F(2) = 1
F(n) = F(n-1) + F(n-2)
인 수의 나열이다

음이 아닌 정수 n을 인자로 받아 n번째 피보나치 수를 반환하는 메서드를 구현하시오.
 */
public class Q3Methods {
    public static int 피보나치(int n){
        //very short
        if ( n < 2) return n;
        else return 피보나치(n-1) + 피보나치(n-2);

        //short
//        if (n < 2){
//            return n;
//        } else {
//            return 피보나치(n-1) + 피보나치(n-2);
//        }

        //middle
//        if ( n == 0 || n == 1){
//            return n;
//        } else if (n == 2){
//            return 1;
//        } else {
//            return 피보나치(n-1) + 피보나치 (n-2);
//        }

        //long
//        if (n == 0){
//            return 0;
//        } else if ( n == 1 || n == 2) {
//            return 1;
//        } else {
//            return 피보나치(n-1) + 피보나치(n-2);
//        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         System.out.println(피보나치(n));
    }
}
