package HQ4Class;

public class Main {
    public static void main(String[] args) {
    Note testNote = new Note("first", 10);
    testNote.write(3,"3page");
    testNote.write(5,"5page");
    testNote.write(7,"7page");
    testNote.write(7,"new 7page");
    testNote.write(9,"9page");
    testNote.writtenPageNum();
    testNote.writtenContent();
    }

}
