package D8File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileMain {
    public static void main(String[] args) {
///////////////////////////////////////////////✨File Reader////////////////////////
        // ✨ try-with-resources
        // ✨ AutoClosable를 구현하면 사용 가능
        List<Character> readChars = new ArrayList<>();
        try (FileReader reader = new FileReader("Hello")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.println((char) character);
                readChars.add((char) character);
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 에러");
        }

///////////////////////////////////////////////✨File writer////////////////////////
        //💾[FileWriter][java.io] 파일을 생성하는 클래스
        try (FileWriter writer = new FileWriter("output.txt", true)) {
            for (Character character : readChars) {
                writer.write(character);
            }
        } catch (IOException ignored) {
            System.out.println("파일 쓰기 에러");
        }

        // 💾[FileReader][java.io.]  파일을 불러오는 클래스
            //🪄 절대경로, 상대경로 다 지원함.
            //🪄 프로젝트 기준 최상위 폴더에 만들면 intlliJ에서 바로 사용 가능
        //📌Finally에서 인식할 수 있도록 밖에 선언
        FileReader reader = null;
        try {
            reader = new FileReader("hello");
            int character;
///////////////////////////////////////////////✨StringBuilder////////////////////////
            //💾[StringBuilder][java.io.] 문자열을 만들어주는 클래스
            StringBuilder line = new StringBuilder();

            // -1 : file을 다 읽었다
            while ((character = reader.read()) != -1){
                System.out.print((char) character);
                line.append((char) character);
            }

            //📌출력부는 필요한대로
            System.out.println(line.toString());

            String newLine = line.toString();
            String[] lines = newLine.split("\n");
            for (String oneLine : lines) {
                System.out.println(oneLine);
            }
            reader.close(); //📌file을 읽어들었으면 reader를 close 해줘야 함
        } catch (IOException ignored) {
            System.out.println("error");
        } finally {
            // 여는 단계에서 문제 생기면 null임
            if (reader != null) {
                try {
                    // 닫는 과정에서도 문제가 생길 수 있다...
                    reader.close();
                } catch (IOException e){

                }
            }
        }
    }
}

