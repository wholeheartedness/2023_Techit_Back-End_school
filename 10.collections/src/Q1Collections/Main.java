package Q1Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 내 풀이
        List<String> str = new ArrayList<>();
        while (str.indexOf("q") == -1) {
            str.add(sc.nextLine());
        }
        str.remove("q");
        System.out.println(str);


        //강사님 풀이
        List<String> inputList = new ArrayList<>();
        while (true) {
            String input = sc.nextLine();
            // `q`가 입력시 반복(입력) 종료
            if ("q".equals(input)) break;
            inputList.add(input);
        }
        // fori
        for (int i = 0; i < inputList.size(); i++) {
            System.out.println(inputList.get(i));
        }

        // foreach
        for (String input : inputList) {
            System.out.println(input);
        }
    }
}
