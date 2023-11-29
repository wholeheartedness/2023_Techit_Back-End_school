package Q3Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
어떤 가게의 메뉴 <메뉴명> <가격>형태로 계속 입력된다.
"order"가 입력되었을 때,
사용자의 단일 주문을 받고 금액을 출력하시오.
예시 입출력
입력1:
Americano 1500
Cappuccino 2000
Latte 2500
Mocha 3000
order
Latte

출력1:
2500
 */
public class Main {
    public static void main(String[] args) {
        //1. 메뉴와 가격을 입력 받는다 (" "로 메뉴와 가격을 구분)
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> menu = new HashMap<>();

        while (true) {
            String input = sc.nextLine();
            if ("order".equals(input)) break;
            String[] inputline = input.split(" ");
            menu.put(inputline[0], Integer.parseInt(inputline[1]));
        }

        // 주문받을 준비
        String order = sc.nextLine();
        System.out.println(menu.get(order));


    }
}
