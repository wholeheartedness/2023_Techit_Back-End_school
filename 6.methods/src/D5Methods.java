public class D5Methods {
    //main 메서드
    public static void main(String[] args) {
        System.out.println("메인 메서드에서 실행할 코드입니다.");
        System.out.println(addTwoInt(10,20));
        int A = 1;
        int B = 2;
        int C = addAndTwice(A, B);
        System.out.println(C);
        System.out.println(threeIntAndDivide(A, B, C));
        int[] nums = {2, 3, 4, 1, 6};
        System.out.println("-----test---------");
        System.out.println(findOneReturn(nums)); // 한번만 찾고 return 종료
        System.out.println("------------------");
        System.out.println(findOneBreak(nums));  // 한번 찾고 뒤에 return을 만날때 까지 다른 동작도 가능

        System.out.println("재귀함수");
        System.out.println(factorial(7));

        int intA = 2, intB = 3;
        long longA = 2, longB = 3;
        System.out.println(add(intA, intB));
        //System.out.println(add(longA, longB));

        System.out.println(varargAvg(1,2,3,4,5));
        System.out.println(varargAvg(10,11,12));
        int[] argList = { 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("avg of 1~8 :" + varargAvg(argList));
    }

    // 두개의 정수를 더하는 메서드
    public static int addTwoInt(int a, int b) {
        return a + b;
    }

    // 두개의 정수를 더하고 그 결과를 반환하는 메서드
    public static int addAndTwice(int a, int b){
        int c = (a + b) * 2;
        return c; //돌려주고 싶은 것(output)
    }

    // 세개의 정수를 받아서, 3으로 나눈 몫을 반환하는 메서드
    public static int threeIntAndDivide(int a, int b, int c){
        int divide = (a + b + c) / 3;
        return divide;
    }

    // 정수 배열을 받아서, 1이 어디있는지 반환하거나, 없으면 -1을 반환하는 메서드
    public static int findOneReturn(int[] numbers) {
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            // 찾았다!
            if (numbers[i] == 1) {
                index = i;
                return index;           // return을 만나 바로 종료
            }
        }
        System.out.println("for 종료");
        return index;
    }

    public static int findOneBreak(int[] numbers) {
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                index = i;
                break;                  // break 종료 후 아래 프린트까지 반환 가능
            }
        }
        System.out.println("for 종료");
        return index;
    }

    // 재귀함수
    // n! = n * (n - 1)!
    // n == 1 || n == 0 -> n! = 1
    public static int factorial(int n) {
        // 0이거나 1이면 1을 반환한다.
        if (n == 1 || n == 0) {
            return 1;
        }
        // 아니면 n * f(n-1)을 반환한다.
        else {
            return n * factorial(n - 1); //나를 호출해서 재귀한다
        }
    }

    // 메소드 오버로딩
    public static int add(int a, int b){
        return a + b;
    }

    public static long add(long a, long b){
        return a + b;
    }

    // Varargs - 가변인자
    // public ststic int varargAvg(int[] ints)
    public static int varargAvg(int... ints){
        int sum = 0;
        for (int i = 0 ; i < ints.length ; i++){
            sum += ints[i];
        }
        return sum / ints.length;
    }
}
