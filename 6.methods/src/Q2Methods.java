import java.util.Scanner;

/*
String 배열을 인자로 받아 배열의 각 값을
한줄씩 출력하는 메서드 "printAll"를 작성하시오.
 */
public class Q2Methods {
    public static void printAll(String[] strArr){
        for (String str : strArr){
            System.out.println(str);
        }
    }

    public static void main(String[] args){
        String[] names = {"alex", "brad", "chad"};
        String[] fruits = {"apple", "banana", "kiwi"};
        printAll(names);
        printAll(fruits);
    }
}
