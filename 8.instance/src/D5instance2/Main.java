package D5instance2;

public class Main {
    public static void main(String[] args) {
        /*
        Car sonata = new Car();
        refuel (sonata);
        System.out.println(sonata.getFuel());
        sonata.drive(100);
        sonata.beep();

        Truck porter = new Truck(100);
        refuel(porter);
        System.out.println(porter.getFuel());
        porter.drive(100);
        porter.beep();
        porter.짐추가(50);
        porter.짐추가(30);
        System.out.println(String.format("max load : %d, current load: %d", porter.getMaxLoad(), porter.getLoad()));

        Car bongo = new Truck(100);
        ((Truck) bongo).짐추가(10);
        if (isTruck(sonata))
            ((Truck) sonata).짐추가(10);
        else System.out.println("is not Truck");

//        refuel(bongo);
//        bongo.drive(100);
    }

    public static boolean isTruck(Car car) {
        return car instanceof Truck;
    }

        */
        Car sonata = new Car(100);
        Truck porter = new Truck(100);
        Car bongo = new Truck(100);
        refuel(porter);
        refuel(bongo);
        porter.짐추가(30);
        if (bongo instanceof Truck)
            ((Truck) bongo).짐추가(50);

        sonata.drive(100);
        porter.drive(100);
        bongo.drive(100);

    }
    public static void refuel (Car car) {
        car.setFuel(100);
    }
}
