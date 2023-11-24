package D5;

public class Main {
    /*
//        //new : 새로운 객체를 만들어주는 키워드
//        Car seojuCar = new Car();
//        seojuCar.count += 1;
//        seojuCar.brand = "porsche";
//        seojuCar.name = "cayenne";
//        seojuCar.fuel = 100;
//        seojuCar.printInfo();
//        seojuCar.bbeep();
//        seojuCar.drive(50);
//        System.out.println(seojuCar.count);
//
//        Car yourCar = new Car();
//        yourCar.count +=1;
//        yourCar.brand = "Kia";
//        yourCar.brand = "K3";
//        yourCar.fuel = 70;
//        yourCar.bbeep();
//        yourCar.drive(150);
//        System.out.println(yourCar.count);
//
//
//        Person seoju = new Person();
//        seoju.name = "leeseoju";
//        seoju.age = 29;
//        seoju.tall = 164.11;
//        System.out.println(seoju.name);
//        seoju.hello();
//    }
     */
    public static void main(String[] args) {
//        int kilos = 10;
//        Car someCar = new Car("Cayyen","Porsche", 100);
//        someCar.drive(10);


        Car someCar = new Car("K5", "Kia", 72);
//        someCar.name = "K5";
//        someCar.brand = "Kia";
//        someCar.fuel = 72;
        System.out.println(someCar.getBrand());
        someCar.printInfo();
        someCar.setFuel(100);
        someCar.printInfo();

        Car sonata = new Car();
        sonata.printInfo();

        Person me = new Person("seoju");
        for (int i = 0; i < 40; i++) {
            me.age();
        }
        System.out.println(me.getAge());
        me.sayHello();


        // ????
//        someCar.name = "E-Class";
//        someCar.brand = "Mercedes-Benz";
//        someCar.printInfo();

    }
}
