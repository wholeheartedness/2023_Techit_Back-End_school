package D5instance3;

/*
 * 사람을 만들고 (이름) (인사를 할거지만, 누가 하는지에 따라 다르게 하고 싶다)
 * 학생을 만들고 (이름, 전공) (인사)
 * 강사를 만들고 (이름, 주제) (인사)
 */

public abstract class Person implements Comparable{
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    // Comparable에서 구현을 요구하는 메서드
    // 두개의 객체의 대소를 비교하기 위함
    // Java에서 제공하는 정렬 기능을 활용할 때 사용됨
    // Arrays.sort 등 Java의 몇몇 기능에 활용
    public int compareTo(Object o) {
        return age - ((Person) o).age;
    }

    // 추상 메서드
    public abstract void sayHello(); // 내 자식이라면 이정도는 할 수 있어야 해!


    public String getName() {
        return this.name;
    }


}
