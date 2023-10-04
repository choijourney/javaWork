package chap_01;

public class _Quiz_hamburger {
    public static void main(String[] args) {
        // 버거 이름을 담기위한 name 변수 정의
        // 재료 정보를 표시하는 cook() 메소드 정의
        // 공통부분은 상속 및 메소드 오버라이딩으로
        // 행버거 - 양상추 패티 피클
        // 치즈버거 - + 치즈
        // 새우버거 - + 새우
        // 클래스는 한 파일에 만들기

        Hamburger[] hamburgers = {new Hamburger(),new Cheeseburger(),new Shirimpburger()};
//        hamburgers[0] = new Hamburger();
//        hamburgers[1] = new Cheeseburger();
//        hamburgers[2] = new Shirimpburger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("---------");
        for (Hamburger hamburger : hamburgers) {
            hamburger.cook();
            System.out.println("----------");
        }
        System.out.println("메뉴 준비가 완료됐습니다.");
    }
}

class Hamburger {
   public String name;

    public Hamburger() {
        this("햄버거");
    }

    public Hamburger(String name) {
        this.name = name;
    }

    public void cook(){
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는");
        System.out.println(">양상추");
        System.out.println("+패티");
        System.out.println("+피클");
    }

}

class Cheeseburger extends Hamburger{
    public Cheeseburger(){
        super("치즈버거");
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("+치즈");
    }
}

class Shirimpburger extends Hamburger{
public Shirimpburger(){
    super("쉬림프버거");
}

    @Override
    public void cook() {
        super.cook();
        System.out.println("+새우");
    }
}