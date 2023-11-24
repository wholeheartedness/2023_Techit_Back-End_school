import java.util.Scanner;

/*
사칙연산을 나타내는 문자(char) (+, -, *, /) 하나와
두개의 정수를 입력받아, 각 기호에 대응하는 연산의 결과를
반환하는 메서드를 작성하시오.
단, 정수 범위에서만 결과를 반환합니다.
 */
public class HQ3Methods {
    public static int calculator (String charC, int a, int b){
        switch (charC) {
            case "+" :
                return a + b;
            case "-" :
                return a - b;
            case "*" :
                return a * b;
            case "/" :
                return a / b;
        } return -444;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String charC = sc.nextLine();
        int first = sc.nextInt();
        int second = sc.nextInt();
        System.out.println(calculator(charC, first, second));
    }


}
