package chap_02;

import chap_02.converter.*;

public class _09_Lamda {
    public static void main(String[] args) {
        // 람다식  (x,y)-> x+y

        // FunctionalInterface
        KRWConverter converter = new KRWConverter();
        //   converter.convert(3);  // 3 달러 = 4200 원

        // convertUSD(converter, 3); // 3 달러 = 4200 원

//      convertUSD( public void convert(int USD) {
//            System.out.println(USD +" 달러 = "+ (USD*1400) + " 원");
//        }, 3);
//        converter의 객체는 KRWConverter와 같아서 KRWConverter의 메서드를 가져와서
//      인수 첫번째자리에 converter 대신 썼는데 일반식은 오류가 나고 람다식을 써야함

        convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원")
                , 3);

        Convertible convertible = (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
        // 위 식의 첫째인수를 Convertible객체를 만들어 변수에 저장
        // 이게 함수형 인터페이스. FunctionalInterface  인터페이스 안에 메서드가 딱 하나여야함

        convertUSD(convertible, 3);


        // 전달값이 하나도 없다면?
        ConvertibleWithNoParams c1 = () -> System.out.println("1 달러는 1400원");
        c1.convert();

// 두줄 이상의 코드가 있다면
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD * KRW) + " 원");
        };

        // 전달값이 두개이상이면
        ConvertibleWithTwoParams c2 = (USD,KRW) -> {    // 인수에 d,w 다른문자열써도됨
            System.out.println(USD + " 달러 = " + (USD * KRW) + " 원");
        };
        c2.convert(10,1400);

        // 반환값이 있는경우
        ConvertibleWithReturn c3 = (d,w) -> d * w;  // return생략가능
        c3.convert(20, 1400); // 이상태에서 ctrl + alt + v 누르면
        int result = c3.convert(20, 1400);  // int 자동완성
        System.out.println("20 달러 = " + result + " 원");
    }

    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);  //KRWConvertible대신 부모인 Convertible을 써도됨
    }
/*
    람다식
     public void print(){
         String s = "test";
         System.out.println(s);
     }

    ()-> {                      위식을 람다식으로
        String s = "test";
        System.out.println(s);
    }
     람다식에선 접근제어자 필요없고 이름도 필요없음
     리턴값이 있으면 자동으로 리턴을해주기때문에 void도 필요없다

    public void print(String s){
        System.out.println(s);
    }

    (s) -> System.out.println(s)  한줄로 쓸땐 중괄호 세미콜론도 필요없음
    // 컴파일할때 타입도 알아서 처리해줘서 타입도 필요없음

    s -> System.out.println(s)
    인수 전달값이 하나면 소괄호도 생략가능

    public int add (int x , int y){
    return x + y;
    }

    (x , y) -> {return x + y }  return이 있을땐 중괄호써야함
    (x , y) ->  x + y   하지만 return을 안써도 알아서  return해줌



*/


}
