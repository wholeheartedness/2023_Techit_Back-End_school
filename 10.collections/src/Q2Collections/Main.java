/*
엔터로 구분된 정수 입력이 임의의 횟수만큼 이뤄진다
q가 입력되면 모든 데이터가 입력된 것이라고 생각할 때,
여태까지 입력한 정수가 몇가지가 되는지 출력하시오.
Integer.parseInt(String str)
* 총합
* 정수 아닌 입력도 들어온다.
 */

package Q2Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> intSet = new HashSet<>();
        while (true) {
            String input = sc.nextLine();
            if ("q".equals(input)) break;
            intSet.add(Integer.parseInt(input));
        }
        // 정수 종류 출력하기
        int count = 0;
        for (Integer number : intSet) {
            count++;
        }
        System.out.println(count);
        System.out.println(intSet.size());
    }
}
