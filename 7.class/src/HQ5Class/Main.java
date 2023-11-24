package HQ5Class;

public class Main {
    public static void main(String[] args) {
        Batter tester = new Batter();
        tester.hit(2);
        tester.out();
        tester.out();
        tester.out();
        tester.out();
        tester.out();
        tester.hit(1);
        tester.walk();
        tester.walk();
        tester.walk();
        tester.out();;
        tester.hit(1);
        tester.hit(1);
        tester.hit(1);
        tester.hit(1);
        tester.hit(1);

        tester.batAvg();
        tester.onBasePer();
        tester.slugPer();
        tester.OPS();


    }
}
