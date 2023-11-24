package HQ1Class;

public class Person {
    private String name;
    private int age;

    public Person (String name) {
        this.name = name;
        this.age = 0;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int age(){
        return age += 1;
    }

    public void personInfo() {
        System.out.println(String.format("이름: %s, 나이: %d", this.name, this.age));
    }

    public void sayHello(){
        if (this.age >= 5 ){
            System.out.println(String.format("Hello, I'm %s", this.name));
        } else {
            System.out.println("응애응애");
        }
    }


}
