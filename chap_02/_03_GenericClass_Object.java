package chap_02;

import chap_02.coffee.*;
import chap_02.coffee.user.User;
import chap_02.coffee.user.VipUser;

public class _03_GenericClass_Object {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeByNickname c2 = new CoffeByNickname("유재석");
        c2.ready();

        System.out.println("-------");

        // Object를 이용해서 여러 타입을 인수로 쓰기
        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();
        System.out.println("-------");

//        int c3name = c3.name;   c3이 숫자여도 Object타입이라 int에 담기지않는다
        int c3name = (int) c3.name;  // int로 형변환을 해줘야함
        System.out.println("주문 고객 번호 : " + c3.name);

        String c4name = (String) c4.name;
        System.out.println("주문 고객 번호 : " + c4.name);

        // c4Name = (String) c3.name;  정수를 문자열에 넣으려고 하면 오류는 뜨지않는데
        // 실행시키면 그때 오류가뜸  이런 문제를 제네릭 클래스로 해결할수있다
        System.out.println("-------");

        Coffee<Integer> c5 = new Coffee<>(35); // 여기 인수에 문자열을 넣으면
        c5.ready();     //  앞에 Integer를 정해놨기때문에 오류바로뜸
        int c5name = c5.name;  // 타입을 미리 Integer로 정해놔서 형변환없이 바로 변수에담는다
        System.out.println("주문 고객 번호 : " + c5name);

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6name = c6.name;
        System.out.println("주문 고객 이름 : " + c6name);

        System.out.println("-------");
        CoffeeByUser<User> c7 = new CoffeeByUser<User>(new User("강호동"));
        // CoffeeByUser객체를 만들때 인수에 타입 User를 써야하는데 객체를 만들면서
        // User도 새로 만들어야하기때문에 new User를 쓰고 User의 인수에는 name을 써야함
        c7.ready();
        String c7name = c7.user.name;
        System.out.println("주문 고객 이름 : " + c7name);

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VipUser("이경규 "));
        c8.ready();  // VipUser를 상속받아  특별한이경규 출력

        System.out.println("--------");
        orderCoffee("김희철", "바닐라라떼", 1);
        orderCoffee(10, "홍차", 1);
    }

    public static <T, V, N> void orderCoffee(T name, V coffee, N number) {
        // 제네릭메서드에 인수값 여러개만들기
        System.out.println(coffee + " 준비 완료 : " + name + " " + number);
    }
}
