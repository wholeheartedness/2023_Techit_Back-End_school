package D8File;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BufferFileMain {
    public static void main(String[] args) {
        List<String> readLines = new ArrayList<>();
        List<Person> people = new ArrayList<>(); // 2번 예제(Person)에 사용
        // ✨try-with-resource
        // 📌BufferedReader는 파일을 읽기 위해서가 아니라
        // 📌전체적인 입출력 과정에 버퍼링 기능을 더해주기 위해서 사용합니다.
        // 💡FileReade가 밥알을 하나씩 담는 과정이라면 BufferedReader는 밥숟가락으로 밥뭉탱이를 담는 과정입니다
        try (FileReader fileReader = new FileReader("people.csv"); // 👈어떤 파일을 열건지
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                //👇 데이터를 모으고 정리하는 부분
                readLines.add(line);
                String[] seperated = line.split(","); // 👈쉼표를 기준으로 나눈다(name, email, age, m/f)
                Person person = new Person(
                        seperated[0],
                        seperated[1],
                        Integer.parseInt(seperated[2]),
                        seperated[3]
                );
                people.add(person);
            }
        } catch (IOException e) {
            System.out.println("ErrorOpening File : " + e.getMessage());
            /*
            file : hello에 입력된 내용입니다.
             */
        }

        for (Person person : people) {
            System.out.println("name :" + person.getName());
            System.out.println("age :" + person.getAge());
            System.out.println("email :" + person.getEmail());
            System.out.println("gender :" + person.getGender());
        }

        // 📌파일입출력은 장기기억장치에 입출력을 하는 것이기 때문에,
        // 📌입출력 횟수를 줄여야 속도가 빨라진다.
        try (FileWriter fileWriter = new FileWriter("output.txt");  //👈어떤 파일에 작성할건지
             BufferedWriter writer = new BufferedWriter(fileWriter)){
            for (Person person : people) {
                String peopleLine = String.format( "%s, %s, %s, %s",
                        person.getName(),
                        person.getEmail(),
                        person.getAge(),
                        person.getGender()
                );
                writer.write(peopleLine);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error Writing File: " + e.getMessage());
        }
    }
}
