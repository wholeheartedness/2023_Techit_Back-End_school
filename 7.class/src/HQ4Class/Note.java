package HQ4Class;

public class Note {
    private String title;
    private String[] pageArr;
    private int writtenPageNum;

    public Note(String title, int fullPageNum){
        this.pageArr = new String[fullPageNum];
    }

    public void write(int pageNum, String content){
        this.pageArr[pageNum] = content;
        this.writtenPageNum++;
    }

    public void read (int pageNum) {
        System.out.println("내용 : " + this.pageArr[pageNum]);
    }

    public int writtenPageNum (){
        System.out.println("총 페이지 수: " + this.writtenPageNum);
        return this.writtenPageNum;
    }
}
