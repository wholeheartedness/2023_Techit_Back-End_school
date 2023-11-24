/*
int[]을 두개 받아,
첫번째 배열의 마지막 원소 뒤에, 두번째 배열의 첫번째 원소가 오도록
두 배열을 연결한 배열을 반환하는 메서드를 작성하시오.
 */
public class HQ5Methods {
//    public static int[] link (int[] arryA, int[] arryB){
//        int[] result = new int[arryA.length+arryB.length];
//
//    }

    public static void main(String[] args) {
        int[] testArr1 = {1, 2, 3, 4, 5, 6};
        int[] testArr2 = {7, 8, 9, 10};
        int[] result = concatArray(testArr1, testArr2);
        for(int num : result) {
            System.out.println(num);
        }
    }

    public static int[] concatArray(int[] front, int[] back){
        int[] result = new int[front.length + back.length];
        // 1. 외부에 result 원소 순서용 변수 만들어서 for 두번
        int idx = 0;
        for (int i = 0 ; i < front.length ; i++) {
            result[idx] = front[i];
            idx++;
        }
        for (int i = 0 ; i < back.length ; i++) {
            result[idx] = back[i];
            idx++;
        }
        return result;

        // 2. for i를 두번 돌 되, 두번째 (back) 할때는 위치를 + front.length를 한다

        // 3. 둘 중 더 긴 원소의 갯수 만큼 반복하는 반복문에서
        // 더 짧은 배열을 넘어서는 건 if문으로 제외하고
        // 한번에 result[i]와 result[front.length + i] 할당
    }
}
