package D7Generics;
// <T>를 해주면 T를 타입처럼 쓸 수 있다.

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30};
        ArrayWrapper<Integer> integerArrayWrapper= new ArrayWrapper<>(intArray);
        System.out.println(integerArrayWrapper.length()); //3
        System.out.println(integerArrayWrapper.contains(20)); //true
        System.out.println(integerArrayWrapper.contains(30)); //ture
        System.out.println(integerArrayWrapper.contains(50)); //false




        Double[] doubleArray = {1.0, 2.0, 3.0};
        ArrayWrapper<Double> doubleArrayWrapper = new ArrayWrapper<>(doubleArray);
        System.out.println(doubleArrayWrapper.length()); //3
        System.out.println(doubleArrayWrapper.contains(1.0)); //true
        System.out.println(doubleArrayWrapper.contains(2.0)); //true
        System.out.println(doubleArrayWrapper.contains(5.0)); //false

        System.out.println(contains(doubleArray, 2.0)); //true
        System.out.println(contains(intArray, 25)); //false
    }

    public static <T> boolean contains(T[] source, T target) {
        for (T item : source) {
            if (item == null) continue;
            if (item.equals(target)) return true;
        } return false;
    }
}
