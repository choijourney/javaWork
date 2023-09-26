package chap_01;

public class BlackBox {
    String modelName; // 모델이름
    String resolution; // 화질
    int price; // 가격
    String color; //색상
    // 이 네개의 값들을 인스턴스변수 라고 한다. 필드 라고도 부른다.
    int serialNumber; // 시리얼 번호
    static int counter = 0; //시리얼 번호를 생성해주는 역할  ++로 시리얼번호를 더해줄거임

    static boolean canAutoReport = false; // 자동 신고 기능 
    // static이 붙으면 클래스변수 라고 한다. 고정된 변수로 모든 인스턴스에 사용가능하다
    // 같은 클래스 내에서 호출이 가능하다


    // constructor 생성자  보통 클래스 변수아래에 씀, 클래스이름과 같은이름을씀
    BlackBox(){
      // this("파랑이","FHD",150000,"블루");  아래의 BlackBox를 사용할수있음
        System.out.println("기본 생성자 호출");
        this.serialNumber = ++counter;
        System.out.println("새로운 시리얼 넘버를 발급받았습니다. : "+ this.serialNumber);
    }   // new로 객체 생성할때 인수를 안쓰면 이 생성자호출 , 인수값을 쓰면 ↓ 호출

    BlackBox(String modelName,String resolution,int price,String color){
        this();  // ↑ BlackBox() 생성자를 한번 실행한후 ↓ 아래코드 실행

        System.out.println("사용자 정의 생성자 호출");
        this.modelName = modelName;  // 사용자가 인수를 써야하니까 사용자정의
        this.resolution = resolution;
        this.price = price;
        this.color = color;
    }


    // 메서드 만듦
    // void 는 리턴값이 없다
    void autoReport() {       // 자동 신고 기능 메서드
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {   // 메모리카드 용량 메서드
        System.out.println("메모리 카드 용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {    // 영상 개수 알려주는 메서드
        if (type == 1) {  // 일반 영상 타입1
            return 9;
        } else if (type == 2) {  // 이벤트 영상 타입2
            return 1;
        }
        return 10;  // 알 수 없는 값일때
    } // 일반 영상과 이벤트영상을 타입을 나눠 보관하고 있다가 원하는 타입을 입력하면 보여줌


    // 메서드 오버로딩
    void record(boolean showDateTime, boolean showSpeed, int min) {
        if (showDateTime) {
            System.out.println("영상에 날짜 정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도 정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    // 인수값을 안써도 호출할수있게 디폴트 메서드를 만듦
    void record() {      // 메서드 오버로딩으로 만듦
        record(true, true, 3);
    }


    // 클래스와 메서드
    static void callServiceCenter() {
        System.out.println("서비스 센터 (1588-oooo) 로 연결됩니다.");
        //  modelName = "test";  맨윗줄 인스턴스변수 modelName을 바꾸려했더니 안된다
        // non-static 은 static 안에서 쓸 수 없다. 인스턴스변수는 static안에 쓸 수없다.
        canAutoReport = true;
        // static 메서드였던 canAutoReport 는 쓸 수있다.
        // 만드려는 중괄호안에 인스턴스 변수가 없을때 static 메서드를 만들수있다.
    }

    // this
    public void appendModelName(String modelName) {
//        modelName += modelName;     앞에 modelName은 인스턴스변수 , 뒤는 인수의
//      modelName인데 이름이 같아서 인식을 못한다.이럴때 this를 인스턴스변수앞에 붙인다
        this.modelName += modelName;
        // 인수와 인스턴스 이름이 다를때는 this가 없어도 된다
    }


    // getter 는 값을 가져오고 setter 는 값을 설정함
    String getModelName(){  // modelName을 가져오는 getter
        return modelName;
    }

    void setModelName(String modelName){  //modelName을 인수값으로 바꿈 setter
    this.modelName = modelName;
    }

    String getResolution() {          // if  resolution값이 없거나 비었으면
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    void setResolution(String resolution){
        this.resolution = resolution;
    }

    int getPrice(){
        return price;
    }

    void setPrice(int price){
        if (price <100000){
            this.price = 100000;
        } else {
            this.price = price;
        }
        }

    String getColor(){
        return color;
    }

    void setColor(String color){
        this.color = color;
    }
}
