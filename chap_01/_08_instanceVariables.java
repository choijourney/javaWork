package chap_01;

public class _08_instanceVariables {
    public static void main(String[] args) {

        // 클래스

        String monelName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";
        // 블랙박스를 만들고있다. 이 내용들을 타입이 달라서 배열에 한번에 넣을수 없다.
        // 이럴 때 class 를 쓴다.

        BlackBox bbox = new BlackBox();
        bbox.modelName = "하양이";
        bbox.resolution = "UHD";
        bbox.price = 300000;
        bbox.color = "화이트";
        // BlackBox 클래스로부터 bbox 객체 생성
        // bbox 객체는 BlackBox 클래스의 인스턴스

        System.out.println(bbox.modelName);
        System.out.println(bbox.resolution);
        System.out.println(bbox.price);
        System.out.println(bbox.color);

        BlackBox b1 = new BlackBox();
        b1.modelName = "그레이";
        System.out.println(b1.modelName);
        // b1 이라는 BlackBox의 인스턴스를 하나 더생성

        BlackBox b2 = new BlackBox();
        b2.modelName = "초록이";
        System.out.println(b2.modelName);

        // 특정 범위를 초과하는 충돌 감지 시 자동 신고 기능 개발 여부
        System.out.println("- 개발 전 -");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);

        // 기능 개발
        BlackBox.canAutoReport = true;  // 원래 false였는데 true로 바꿔줌

        System.out.println("- 개발 후 -");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);
        // b1.canAutoReport 같이 인스턴스에 클래스변수를 쓰는것보다
        // BlackBox.canAutoReport 권장


        BlackBox.canAutoReport = false; // false로 다시 바꿔줌
        b1.autoReport(); // 자동 신고 기능 메서드 지원 안됨
        BlackBox.canAutoReport = true;
        b1.autoReport(); // 지원 됨

        b1.insertMemoryCard(256); // 메모리카드 용량 알려주는 메서드

        // 일반 영상 : 1 타입
        // 이벤트 영상 (충돌감지) : 2 타입
        int fileCount = b1.getVideoFileCount(1); // 일반 영상
        System.out.println("일반 영상 파일 수 : " + fileCount+ "개");

        fileCount = b1.getVideoFileCount(2); // 이벤트 영상
        System.out.println("이벤트 영상 파일 수 : " + fileCount+ "개");


        // 메서드 오버로딩
        b1.record(true,true,1); //영상녹화메서드
        // 인수값을 안써도 호출할수있게 메서드 오버로딩으로 디폴트 메서드를 만듦
        b1.record();

        String s = "Black";
        System.out.println(s.indexOf("a"));
        // indexOf에 ctrl 키를 누르면서 클릭하면 메뉴얼이 나온다.
        // 메서드 오버로딩을 볼 수있다


        // 클래스와 메서드  강의 섹션 8 - 클래스 메소드 ★
        b1.callServiceCenter();
        BlackBox.callServiceCenter(); //클래스이름과 메서드를 써도된다


        // this  Blackbox 클래스를 보면 this로 메서드를 만듦
        b1.appendModelName("(최신형)");  // 모델이름에 인수값을 덧붙이는 메서드
        System.out.println(b1.modelName);

        // ctrl + shift + i 누르면 코드와 연결된 메서드,코드를 보여줌
        // ctrl 키를 누르면서 코드를 누르면 연결된 코드 페이지로 이동함


        // constructor 생성자

        BlackBox b3 = new BlackBox();
        b3.modelName = "노랑이";
        b3.resolution= "UHD";
        b3.price = 300000;
        b3.color = "옐로우";
        System.out.println(b3.serialNumber);

        // ↑이렇게 따로안적고 ↓ 인수값에 한번에 적을수 있게 생성자를 이용해 만들었다.
BlackBox b4 = new BlackBox("핑키","FHD",150000,"핑크");
        System.out.println(b4.modelName);
        System.out.println(b4.color);
        System.out.println(b4.serialNumber);


        // getter 와 setter
        BlackBox b5 = new BlackBox();
        b5.modelName = "주황이";
       // b5.resolution = "UHD"; //실수로 주석처리했다는 가정
        b5.price = 150000;
        b5.color = "오렌지";

        b5.price = -5000;  //price-5000 을해야하는데 실수로 -5000을 썼다는가정
                            //할인행사로 5000원을 깎아주려했는데 가격이 -5000원이됨
        System.out.println("가격 : "+b5.price + "원");
        // 고객이 해상도 문의를 했는데 주석처리돼서
        System.out.println("해상도 : " + b5.resolution);
        // 해상도 : null 로출력   이런상황을 막기위해 getter 와 setter 를 쓴다

        System.out.println("------------");

        b5.setPrice(-10000);

        System.out.println("가격 : " + b5.getPrice() + "원");
        System.out.println("해상도 : " + b5.getResolution());
// getter 와 setter 로 설정 하고나니
//        가격 : 100000원
//        해상도 : 판매자에게 문의하세요.  정상적인 답이 출력된다



    }
}
