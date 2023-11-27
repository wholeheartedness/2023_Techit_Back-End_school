package D5instance3;

import java.util.Arrays;

public class PersonMain {
    public static void main(String[] args) {
        Person seoju = new Student("SeojuLee", 29, "electric");
       // seoju.sayHello();
        Person taeju = new Student("TaejuPark", 27, "Chemical");
        //taeju.sayHello();
        Person jeeho = new Lecture("JihoPark", 40, "Java Programing");
        //jeeho.sayHello();
        Person eric = new Student("Eric", 11, "Korean");
        Person jin = new Student("Jin", 15, "English");


//        Person[] people = {seoju, taeju, jeeho};
//        for (Person person : people) {
//            person.sayHello();
//        }

        Person[] people = new Person[] {seoju, taeju, eric, jin};
        Arrays.sort(people); // 배열을 정렬하는 메서드
        for (Person person : people){
            person.sayHello();
        }
        /*
        나이순 정렬이 됩니다.
        Hello, I'm Eric, and Studying Korean
         Hello, I'm Jin, and Studying English
         Hello, I'm TaejuPark, and Studying Chemical
         Hello, I'm SeojuLee, and Studying electric
         */
    }
}
