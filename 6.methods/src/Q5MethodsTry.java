/*
int[]를 인자로 받아,
순서가 반대가 되어있는 배열을 반환하는 메서드를 작성하시오.
 */
public class Q5MethodsTry {

    public static int[] reverse (int ...numberArr){
        int[] result = new int[numberArr.length];
        for (int i = 0; i < numberArr.length; i++) {
            result[i] = numberArr[numberArr.length -1 -i];
        } return result;
    }

    public static void main(String[] args) {
        int[] numberArr = {1, 2, 3, 4, 5, 6, 7};
        int[] result = reverse(numberArr);
        for ( int numbers : result){
            System.out.println(numbers);
        }
    }
}
