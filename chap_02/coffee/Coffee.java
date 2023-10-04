package chap_02.coffee;

public class Coffee <T> {  //제네릭 클래스 만들기
    public T name;  // 타입대신 T를 씀 (아직 어떤 타입이 들어올지 모르기때문)
                // 타입대신 객체를 쓸수도 있는데 아무객체나 쓸수없게 형을 제한할수있다
    public Coffee(T name) {
        this.name = name;
    }

   public void ready(){
       System.out.println("커피 준비 완료 : " + name);
   }


}
