package chap_02.coffee;

import chap_02.coffee.user.User;

public class CoffeeByUser <T extends User>{ //어떤 타입이든 상관없는데 반드시 User에서 상속받은 T를 써야함
  // User클래스나 User를 상속받는 VipUser만  <T> 에 들어갈수있다.

    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready(){
        System.out.println("커피 준비 완료 : " + user.name);  // User를 상속받아서 name도 같이상속받음
        user.addPoint();    // 메서드도 같이상속받음
    }
}
