package D5instance2;

public class InterfaceMain {
    public static void main(String[] args) {
        Car car = new Car();
        Ship ship = new Ship();
        makeNoise(car);
        makeNoise(ship);
    }
    public static void makeNoise(Beeper beeper){
        beeper.beep();
    }
}
