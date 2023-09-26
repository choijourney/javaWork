package chap_01;

import chap_02.PacageTest;

import java.util.Random;     // 랜덤클래스 가져옴 (내장 클래스?)

public class _09_Access_private {
    public static void main(String[] args) {
        // 바꿀 단어를 선택후 ctrl + c 로 복사 , ctrl + r 누르면
        // 단어바꿔주는 창이 뜸 그창에 바꿀단어를 적고 replace all 누르면
        // 선택한 단어와 같은 단어는 모두 바뀜

        BlackBoxRefurbish b5 = new BlackBoxRefurbish();
        b5.modelName = "주황이";
        // b5.resolution = "UHD"; //실수로 주석처리했다는 가정
        b5.setPrice(150000);
        b5.color = "오렌지";

        b5.setPrice(-5000);  //price-5000 을해야하는데 실수로 -5000을 썼다는가정
        //할인행사로 5000원을 깎아주려했는데 가격이 -5000원이됨
        System.out.println("가격 : "+b5.getPrice() + "원");
        // 고객이 해상도 문의를 했는데 주석처리돼서
        System.out.println("해상도 : " + b5.resolution);
        // 해상도 : null 로출력   이런상황을 막기위해 getter 와 setter 를 쓴다

        System.out.println("------------");

        b5.setPrice(-10000);

        System.out.println("가격 : " + b5.getPrice() + "원");
        System.out.println("해상도 : " + b5.getResolution());

  //    b5.price = -5000; // 이렇게 실수를 하지않게 하기위해 접근제어자 private을 씀
                        // BlackBoxRefurbish 클래스에 가서 price가격에 private 씀
   // private을 써서 b5.price 는 못쓰고 getPrice,setPrice는 쓸수있다


        // 접근 제어자
        // private : 해당 클래스 내에서만 접근 가능
        // public : 모든 클래스에서 접근가능
        // default : (아무것도 적지 않았을때) 같은 패키지 내에서만 접근가능
        // protected : 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 접근가능

// 캡슐화 : 필요한것들끼리만, 서로 연관된 것들끼리만 하나의 캡슐에 담는다.
//예를들어 블랙박스와 관련된 만큼만 하나의 클래스로 정의하는게 캡슐화이다.

// 정보은닉 (information hiding) : 예를들어 블랙박스의 가격을 아무렇게나 접근해 마이너스 5천원 으로 만드는
// 것을 막기위해 변수,메서드에 접근제어를 하는게 정보은닉이다.

//   private을 사용하는 이유는 데이터 캡슐화 때문이다. 모든 데이터를 private로 만들고 public한
//   get/set 메서드를 제공한다. 이렇게 하면 객체가 제공해주는 메서드를 통해서만 private
//   객체 내부의 데이터에 접근할수 있다.


        // 패키지
        PacageTest hey = new PacageTest();
//      import chap_02.PacageTest;
// 다른패키지에 있는 클래스를 불렀더니 맨윗줄에 자동으로 import가 생겼다
//      import chap_02.*;
// *은 챕터2에 있는 클래스를 모두 가져다 쓰겠다는것

        // 랜덤 클래스
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt()); // int의 범위내에서 정수 값 반환
        System.out.println("랜덤 정수 (범위) : "+ random.nextInt(10)); // 0 이상 10 미만의 정수값 반환
        System.out.println("랜덤 실수 : " + random.nextDouble()); // 0.0 이상 1.0 미만의 실수값

   //   System.out.println("랜덤 실수 (범위) : "+ random.nextDouble(10.0)); 실수는 범위를 쓸수 없다
   // 실수 범위를 쓸수 있는 방법 !
   // 만약 5.0 이상 10.0 미만의 실수를 구하고싶다면
   double min = 5.0;
   double max = 10.0;
        System.out.println("랜덤 실수(범위): "+ (min+ (max-min) * random.nextDouble()));

        System.out.println("랜덤 booleat : " + random.nextBoolean());

        // 로또 번호를 랜덤으로 뽑으려면? 1~ 45
        System.out.println("로또번호 : " + (random.nextInt(45)+1)); // 괄호로 꼭감싸줘야함

// Math, Scanner, Stringbuilder,BigInteger, LocalDate 등 구글에서 자바 유용한 클래스 검색해서 사용해보기

    }

}

//class test{}  파일안에 클래스를 여러개 만들수있다
// 자바 파일명과 맨윗줄의 public class 이름은 같아야한다