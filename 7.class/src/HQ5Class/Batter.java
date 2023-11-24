package HQ5Class;

public class Batter {
    private int 타석수 = 0;
    private int 안타수 = 0;
    private int 볼넷수 = 0;
    private int 루타수 = 0;

    public void hit (int bases){
        if (bases >= 1 && bases <=4) {
            this.타석수 += 1;
            this.안타수 += 1;
            this.루타수 += bases;
        }
    }
    public void out (){
        this.타석수 += 1;
    }
    //볼넷
    public void walk (){
        this.타석수 += 1;
        this.볼넷수 += 1;
    }
    //타율 반환
    public double batAvg() {
        double 타율 = (double) this.안타수/(this.타석수 - this.볼넷수);
        System.out.println("타율 : " + 타율);
        return 타율;
    }
    //출루율 반환
    public double onBasePer() {
        double 출루율 = (double) (this.안타수 + this.볼넷수) / this.타석수;
        System.out.println("출루율 : " + 출루율);
        return 출루율;
    }
    //장타율 반환
    public double slugPer() {
        double 장타율 = (double) this.루타수 / (double) (this.타석수 - this.볼넷수);
        System.out.println("장타율 : " + 장타율);
        return 장타율;
    }
    //OPS 반환
    public double OPS() {
        double OPS = this.onBasePer() + this.slugPer();
        System.out.println("OPS = " + OPS);
        return OPS;
    }
}
