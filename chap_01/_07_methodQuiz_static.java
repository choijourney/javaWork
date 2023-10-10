package chap_01;




public class _07_methodQuiz_static {
    // 나코딩 -> 나** / 주민번호 990130-1***** / 전번 010-1234-****
    // 개인정보를 비공개로 전환하는 메서드 만들기

    public static String id(String info, int number) {

        String hiddenData = info.substring(0, number); //나코딩 -> 나

        for (int i = 0; i < info.length() - number; i++) {
            hiddenData += "*";  // h=h+* , h= h* + *,  h=h**   *만 반복 더함
        }
        return hiddenData;
    }

//    public static String id1(String info, int number) {
//
//        String hiddenData = info.substring(0,number);
//        for (int i = number; i < info.length() ; i++) {
//            hiddenData += "*";
//        }
//        return hiddenData;   위와 같은 결과
//    }

    public static void main(String[] args) {

        String name = "나코딩";
        String idNumber = "990130-123456";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + id(name, 1));
        System.out.println("주민번호 : " + id(idNumber, 8));
        System.out.println("전화번호 : " + id(phone, 9));

    }
}


/*  자바에서 프로그램이란 클래스의 집합이다.
    클래스 외부에 존재할 수 있는건 아무것도 없다.
    클래스는 설계도이고 실체가 아니다. 따라서 클래스의 데이터 필드에 데이터를 저장할수 없다.

    new 명령으로 해당 클래스 타입의 객체를 만든후, 그 객체에 데이터를 저장하고 그객체의 메서드를
    실행하는 것이다. 여기에 하나의 예외가 존재하는데 그것이 static이다.
    static은 클래스안에 존재하는 실체이며 객체에는 존재하지 않는다.

    static은 class멤버이고 non-static은 객체 멤버이다.
    때문에 main메서드에서 non-static멤버에 접근하려면 해당 클래스의 객체를 new를 통해
    생성한뒤 그 객체에서 불러와 접근해야한다. 또한 다른 클래스의 static멤버를 호출하고
    싶다면 새로운 객체를 생성해서 static 변수를 호출하기보다 클래스이름으로부터
    메서드를 호출하는게 바람직하다.

    main 함수 없이 클래스만으로 프로그램이 진행될 수 없다.
    때문에 main 함수가 꼭 필요한데, 프로그램을 진행하는 main 함수를 다른 클래스에서 사용한다면
    문제가 발생하기 때문에 main메서드는 반드시 static 이어야한다.
    클래스멤버인 static은 오직 static멤버만 사용할수 있다.

    static이 앞에 붙는 변수나 메서드는 어떤 객체에 소속되는게 아닌, 클래스에 고정돼있는
    변수나 메서드이다.

    어떤 객체에 소속돼있으면 new키워드를 이용해 객체를 생성해야만
    해당 변수나 메서드를 사용할수 있다.
    public class Main {

    public void print(){
        System.out.print("이게 실행될까요");
    }

    public static void main(String[] args){
        print();
    }               여기서 print는 에러가난다.
    }
    그이유는 print메서드는 static이 아니라 new키워드로 main 객체를 생성해야만
    실행될수 있기때문이다.
    public class Main {

    public void print(){
        System.out.print("이게 실행될까요");
    }

    public static void main(String[] args){
        Main main = new Main();
        main.print();       이렇게 하면 실행된다
    }
    }

    하지만 static 키워드가 있다면 main객체를 만들지않아도 실행된다.
    public class Main {

    public static void print(){
        System.out.print("이게 실행될까요");
    }

    public static void main(String[] args){
        print();
    }
    }

    프로그램이 시작되어 클래스가 메모리에 올라가면 static이 붙은 변수나 메서드는
    클래스와 함께 자동으로 메모리의 static 영역에 생성된다.자동으로 메모리에 올라가기
    때문에 객체를 생성할필요없이 사용이 가능하다.
    일반메서드는 객체를 생성하면 메모리의 Heap 영역에 올라가고 사용하지 않는 객체는
    알아서 삭제시킴으로써 메모리를 관리해준다.
    반면 static메서드는 static 영역에 존재해서 이런 관리를 받지못한다.
    프로그램이 종료될때 메모리를 해제하는데, 이때문에 static을 과도하게 선언하면
    메모리에 과부하가 올수있다.


    public 클래스 외부에서 접근이 가능하다.

    private 클래스 내부에서만 접근이 가능하다.
    private을 사용하는 이유는 데이터 캡슐화 때문이다. 모든 데이터를 private로 만들고 public한
    get/set 메서드를 제공한다. 이렇게 하면 객체가 제공해주는 메서드를 통해서만 private
    객체 내부의 데이터에 접근할수 있다. 이것을 data encapsulation 혹은 information hiding 이라 부른다.

    defalt 동일 패키지에 있는 다른 클래스에서 접근 가능하다.

    protected 동일 패키지의 다른 클래스와 다른 패키지의 자식클래스에서도 접근 가능하다.




 */

