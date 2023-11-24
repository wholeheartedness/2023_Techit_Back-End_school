import java.util.Scanner;

/*
int[]을 인자로 받아,

배열의 값들 중 최댓값의 위치를 반환하는 "maxWhere"
배열의 값들 중 최솟값의 위치를 반환하는 "minWhere"
배열의 값들 중 최댓값과 최솟값의 차이를 반환하는 "maxDiff"

메서드를 각각 작성하시오.
 */
public class HQ4Methods {
    public static void main(String[] args) {
        int[] testArr = {10, 11, 12, 13, 14, 15, 16};
        System.out.println(maxWhere(testArr));
        System.out.println(minWhere(testArr));
        System.out.println(maxDiff(testArr));
    }

    public static int maxWhere(int[] numbers) {
        //numbers.length > 0 검증이 있으면 더 좋음
        // 초기 비교 대상
        int max = numbers[0];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            //더 큰애 발견
            if (numbers[i] > max) {
                // 정보 갱신
                max = numbers[i];
                index = i;
            }
        }
        return index;
    }

    public static int minWhere(int[] numbers) {
        //numbers.length > 0 검증이 있으면 더 좋음
        // 초기 비교 대상
        int min = numbers[0];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            //더 큰애 발견
            if (numbers[i] < min) {
                // 정보 갱신
                min = numbers[i];
                index = i;
            }
        }
        return index;
    }

    public static int maxDiff(int[] numbers) {
        int maxIdx = maxWhere(numbers);  // for 한번
        int minIdx = minWhere(numbers);  // for 한번
        return numbers[maxIdx] - numbers[minIdx];
        //return numbers[maxWhere(numbers)] - numbers[minWhere(numbers)];
    }
}

