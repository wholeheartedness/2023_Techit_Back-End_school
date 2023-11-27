package HQ2Class;

public class BankAccount {
    private String account;
    private String pw;
    private int money;
    public static int allAcount = 0;
    public static int allMoney = 0;

    // 생성자
    public BankAccount(String account, String pw, int money){
        this.account = account;
        this.pw = pw;
        this.money = money;
        allAcount++;
        allMoney += this.money;
    }

    //입금
    public int deposit(int depositMoney) {
        // 내 잔고에 입금액 더하기
        this.money += depositMoney;
        System.out.println(depositMoney + "원 입금완료");
        // 은행 잔고에 입금액 더하기
        allMoney += depositMoney;
        // 내 잔고 반환
        return this.money;
    }

    //출금
    public boolean withdraw(int withdrawMoney, String trypw) {
        if (!(trypw == this.pw)) {
            System.out.println("pw 오류");
            return false;
        } else {
            if (this.money < withdrawMoney) {
                System.out.println("잔고 부족");
                return false;
            } else {
                this.money -= withdrawMoney;
                allMoney -= withdrawMoney;
            } System.out.println("withraw status: 인출 완료되었습니다.");
        } return true;

        //if (!this.password.equals(trypw) || this.withdrawMoney){
        //      return false;
        // } else {
        //      this.money -= withdrawMoney;
        //      allMoney -= withdrawMoney;
        //      return true;
        // }
    }

    //총 생성된 계좌 개수, 전체 잔고 총합
    public void allAccounInfo(){
        System.out.println(String.format("전체계좌 수: %d / 전체잔고합 : %d", allAcount, allMoney));
    }

    //개인 계좌 번호, 비번, 잔고
    public void accountInfo(){
        System.out.println(String.format("비번:%s/잔고:%d", this.pw, this.money));
    }

    public String getAccount() {
        return account;
    }

    public int getMoney() {
        return money;
    }
}

