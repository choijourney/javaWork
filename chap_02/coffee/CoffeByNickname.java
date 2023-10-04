package chap_02.coffee;

public class CoffeByNickname {
    public String nickname;

    public CoffeByNickname(String nickname) {
        this.nickname = nickname;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + nickname);
    }
}
