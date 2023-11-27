package D5instance2;

import D5instance2.Car;

public class Truck extends Car {
    //자동차에는 없지만 트럭에는 있는 속성
    //짐을 실을 수 있는 한도
    private final int maxLoad;
    //현재 실린 짐
    private int load;

    public Truck(int maxLoad) {
        super(100);
        this.maxLoad = maxLoad;
        this.load = 0;
    }

    @Override
    public void drive(int kilos) {
        System.out.println("drive truck");
        setFuel(getFuel() - 1);
        this.fuel -= load / (maxLoad / 10);
        super.drive(kilos);
    }


    public boolean 짐추가(int loadPlus) {
        if (this.load + loadPlus <= this.maxLoad) {
            this.load += loadPlus;
            return true;
        } else {
            System.out.println("짐이 너무 많아요");
        } return false;

        /*
        if (this.load + load > this.maxLoad) {
            return false;
        }
        this.load += load;
        return true;
         */
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public int getLoad() {
        return load;
    }
}
