package HQ4Class;

public class Note {
    private String title;
    private String[] pageArr; //내용이 적혀져 있음 [<내용>, <내용>, <내용>...]
    private int fullPageNum;
    private int writtenPageNum;

    public Note(String title, int fullPageNum) {
        this.title = title;
        this.pageArr = new String[fullPageNum];
        this.fullPageNum = fullPageNum;
    }

    public void write(int pageNum, String content) {
        if (this.pageArr[pageNum] == null) {
            this.writtenPageNum++;
        }
        this.pageArr[pageNum] = content;
    }

    public String read(int pageNum) {
        System.out.println("내용 : " + this.pageArr[pageNum]);
        return this.pageArr[pageNum];
    }

    public int writtenPageNum() {
        System.out.println("총 페이지 수: " + this.writtenPageNum);
        return this.writtenPageNum;
    }

    public void writtenContent() {
        for (int i = 0; i < this.fullPageNum; i++) {
            if (!(this.pageArr[i] == null)) {
                System.out.println(this.pageArr[i]);
            }
        }
    }
}
