package HQ1Class;

public class Main {
    public static void main(String[] args) {
        Person me = new Person("이서주");
        me.sayHello();
        for (int i = 0; i < 29 ; i++) {
            me.age();
        }
        me.sayHello();
        me.personInfo();
    }
}

