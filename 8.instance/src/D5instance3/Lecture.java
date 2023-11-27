package D5instance3;

public class Lecture extends Person {
    private String subject;
    public Lecture(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }
    public void sayHello() {
        System.out.println(String.format( " Hello, I'm %s, and teaching %s.", getName(), this.subject));
    }
}
