package HQ3Class;

import java.time.LocalDateTime;

public class Post {
    private String title;
    private String content;
    private String timeWrite; //LocalDateTime.now()
    private String timeModifi; //LocalDateTime.now()
    private String pw;

    public Post(String title, String content, String pw) {
        this.title = title;
        this.content = content;
        this.pw = pw;
        this.timeWrite = String.valueOf(LocalDateTime.now());
        this.timeModifi = String.valueOf(LocalDateTime.now());
        if(!(this.timeWrite == timeModifi)){
            System.out.println("runtime Err");
        }
    }

    public void printPost(){
        System.out.println(String.format(
                "제목: %s\n본문: %s\n작성일: %s\n수정일: %s",
                this.title, this.content, this.timeWrite, this.timeModifi));
    }

    public boolean editTitle(String newTitle, String pw) {
        if (!(pw == this.pw)) {
            System.out.println("*비번오류*");
            return false;
        } else {
            this.title = newTitle;
            this.timeModifi = String.valueOf(LocalDateTime.now());
            System.out.println("*제목바뀜* :" + newTitle);
        } return true;
    }

    public boolean editContent(String newContent, String pw) {
        if (!(pw == this.pw)) {
            System.out.println("**비번오류**");
            return false;
        } else {
            this.content = newContent;
            this.timeModifi = String.valueOf(LocalDateTime.now());
            System.out.println("**본문바뀜** :" + newContent);

        } return true;
    }

}
