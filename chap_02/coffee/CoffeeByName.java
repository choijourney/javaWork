package chap_02.coffee;

public class CoffeeByName {  // Object를 이용해 여러 타입을 인수로 쓰기
    public Object name;   // int같은 타입대신에 Object 를 쓴다 
    // 타입에 Integer, Double,String,BlackBox같은 객체도 가능하다
    public CoffeeByName(Object name){  // 인수에 int,string,객체이름 다 쓸수있다.
        this.name = name;
    }

    public void ready(){
        System.out.println("커피 준비 완료 : " +name);
    }
}
