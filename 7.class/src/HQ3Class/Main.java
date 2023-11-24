package HQ3Class;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Post first = new Post ("hi1", "hi1content", "0001");
        first.printPost();
        first.editTitle("hi2", "0001");
        first.printPost();
        first.editContent("hi3", "0001");
        first.printPost();
    }
}
