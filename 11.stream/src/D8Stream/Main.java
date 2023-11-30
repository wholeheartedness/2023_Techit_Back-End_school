package D8Stream;

public class Main {
    public static void main(String[] args) {
        //////////////////////interface :
        // 여기에 새로운 값을 할당하고 싶다면?
        // ✨1. 전통적인 방법 : 구현체 작성 후 생성 후 전달
        NoArgRetFunction function = new NoArgRetFunctionImpl();
        runFunction(function);

        // ✨2. 새로운 방법 : 새로운 인터페이스와 구현부를 직접 넣음
        // [익명 내부 클래스]로 일시적인 클래스 객체 전달
        // 굳이 재사용할 필요가 없을 때를 고려하여 나온 방식
        NoArgRetFunction anClass = new NoArgRetFunction() {
            @Override
            public void noArgNoReturn() {

            }
        };
        runFunction(anClass);

        // ✨3. 새로운 방법 2. 람다 표현식
        // 함수형 인터페이스는 어차피 구현할 메서드가 하나
        // 그러면 나머지 다 생략하고 그 메서드만 표시하자.
        // 📜<왼쪽: 매개변수> -> <오른쪽: 함수코드>
        NoArgRetFunction lambda = () -> System.out.println("람다 표현식");
        // 오른쪽은 함수임! 그리고 동시에 하나의 데이터이기때문에 세미콜론을 붙인다
        // NoArgRetFunction lambda = (() -> System.out.println("람다 표현식"));
        runFunction(lambda);

        //📌람다 내부에선 final 변수만 사용 가능
        //함수가 실행될 때 해당 볁수에 접근할 수 있다는 걸 만든다면 만들수야 있지만
        //함수의 기능이 예측 불가해지기 때문에 변경 가능한 변수를 허용하지 않는다.
        final int a = 10;
        int b = 20;

        NoArgRetFunction multilineLambda = () -> {
            System.out.println("Multiline");
            System.out.println("Lambda");
        };

        //////////////////interface : StrArgIntRetFunction//////////////////////////////////
        //함수형 인터페이스 일때
        //public int run(String str) 을 아래와 같이 표현할 수 있습니다.
        StrArgIntRetFunction lambdaParams = str -> str.length();
        lambdaParams = str -> {
            System.out.println("multiline");
            return str.length();
        };

        // ✨메서드 직접 참조
        // 함수형 인터페이스의 형태와 동일한 메서드는
        // ::을 통해 직접 전달할 수 있다.
    }

//    public static int runFunction(StrArgIntRetFunction function) {
//        return function.run("Hello, world!");
//    }
    public static void runFunction(NoArgRetFunction function) {
        function.noArgNoReturn();
    }
}
