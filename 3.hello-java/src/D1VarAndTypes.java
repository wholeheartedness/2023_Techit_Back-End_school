import java.util.Arrays;
import java.util.Scanner;


public class D1VarAndTypes {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(a);
        // 라는 이름의 상자에 문자열 데이터를 넣어준다.
        String b = "Hello Variables!";
        // b에 들어있는게 뭔지 확인한다.
        System.out.println(b);
        System.out.println(a);
        // a의 값을 변경하고 싶다면 다시 =을 사용
        // 이때는 자료형 생략
//
//        a = 50;
//        System.out.println(a);
//        String a =
//        a = "이거 될까요?";
//        System.out.println(a);

        int latte = 6000;
        int topinut = 7000;
        int lemontea = 6500;
        int malcha = 6500;


        System.out.println(latte * 5);
        System.out.println(topinut * 3 + lemontea * 2);
        System.out.println(malcha * 1 + latte * 3);

        //✨문자형 자료형
        //작은 따옴표를 씀 ''
        char charactor = 'a';
        char digit = '1';
        String line = "Hello Java";

        //✨정수형 자료형
        int integer = 10;
        long longInteger = 100000000000L;
        short smallInteger = 10000;
        byte reallySmallinteger = 127;

        //✨실수형 자료형
        float floatPoint = 2.718F;
        //거의 double만 쓴다. (유효수가 커서 정교함)
        double doublePoint = 3.13159265359;
        //진짜 긴 소수는?
        double longPi = 3.14159265358979323846;
        System.out.println(longPi); //3.141592653589793

        //✨논리형 자료형
        boolean success = false;
        boolean willSuccess = true;
        success = true;
        System.out.println(success); //true

        // Scanner로 입력받기
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        String scannedLine = scanner.nextLine();
        System.out.println(scannedLine);

        // scanner.next<자료형>();
        int scannedInt = scanner.nextInt();
        long scannedLong = scanner.nextLong();
        System.out.println(scannedInt);
        System.out.println(scannedLong);

        float scannedFloat = scanner.nextFloat();
        double scannedDouble = scanner.nextDouble();
        System.out.println(scannedFloat);
        System.out.println(scannedDouble);

        boolean scannedBool = scanner.nextBoolean();
        System.out.println(scannedBool);

        // "Say Someting"을 문자열로 표현하고 싶다면?
        String sentence = "\"Say Something\" 이렇게 작성하면 됩니다.";
        System.out.println(sentence);

        System.out.println("개행문자\n아랫줄에 표현됩니다.");
        System.out.println("name\t 이구월");
        System.out.println("Age\t 3년 정도");
        System.out.println("character\t 귀여움");
        System.out.println("캐리지리턴\r이겁니다");
        System.out.println("백스페이스\b한글자를 지웁니다");


        //140101
        String sentence2 = "사용자 키 : 158";
        //231120
        sentence2 = "사용자 키 : 164";

        int tall = 168;
        String status = "평균 이상";
        String messageTemplate = "사용자 키: %d (%s)";
        System.out.println(String.format(messageTemplate, tall, status));

        //배열
        int[] birth = {66, 70, 93, 95};

        System.out.println(Arrays.toString(birth));

        System.out.println(birth[0]);
        System.out.println(birth[1]);
        System.out.println(birth[2]);
        System.out.println(birth[3]);

        int peopleCount = 10;
        String[] names = new String[peopleCount];
        birth = new int[peopleCount];

        //어떤식으로든 생일을 입력 받고,
        birth[0] = 65;
        birth[1] = 73;
        birth[2] = 99;

        Scanner scanner2 = new Scanner(System.in);
        birth = new int [3];
        birth[0] = scanner2.nextInt();
        birth[1] = scanner2.nextInt();
        birth[2] = scanner2.nextInt();

        System.out.println(Arrays.toString(birth));
    }
}

