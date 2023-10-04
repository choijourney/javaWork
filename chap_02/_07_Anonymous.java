package chap_02;

public class _07_Anonymous {
    public static void main(String[] args) {
        // 익명 클래스
        CoffeeOrder c1 = new CoffeeOrder();
        c1.order("아메리카노");

        CoffeeOrder c2 = new CoffeeOrder();
        c2.order("바닐라라떼");
        //주문하신 바닐라라떼 나왔습니다. 출력

        // 친한친구 방문
        CoffeeOrder specialCoffee = new CoffeeOrder() {
            //  객체를 만든후 중괄호에 order메서드를 오버라이딩한다 order만써도 자동완성뜸 탭누르면됨
            @Override
            public void order(String coffee) {
                super.order(coffee);    // 부모클래스의 메서드 실행
                System.out.println("딸기케이크 서비스로 줄게");
            }

            @Override
            public void returnTray() {  // 상속받은 super 지우고 새로쓸수도있음
                System.out.println("자리에 두고가 내가 치울게");  // super 지움
            }
        }; // 이게 익명클래스. 똑같이 CoffeeOrder클래스를 사용하는데 오버라이딩을 통해
        // 기능을 확장. specialCoffee객체만을 위한 1회성 코드. c1,c2는 사용할수없다.
        // specialCoffee클래스를 따로 만들필요없이 익명클래스로 재정의하면됨
        specialCoffee.order("모카");
        specialCoffee.returnTray();

    }

}

class CoffeeOrder {
    public void order(String coffee) {
        System.out.println("주문하신 " + coffee + " 나왔습니다.");
    }

    public void returnTray() {
        System.out.println("커피 반납이 완료됐습니다.");
    }
}