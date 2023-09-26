package chap_01.camera;

public class FactoryCam extends Camera {  // 자식 클래스  extends를 써서 하나의 부모한테서 상속을 받을수있다
//    public String name;  이줄은 Camera에서 상속받아 쓴다

    public FactoryCam() {
//        this.name = "공장 카메라";
        super("공장 카메라"); // 부모 생성자에서 상속받음
    }

//    public void takePicture(){    이줄은 Camera에서 상속받아 쓴다
//        // 사진 촬영
//        System.out.println("사진을 촬영합니다");
//    }
//
//    public void recordVideo(){
//        // 동영상 녹화
//        System.out.println("동영상을 녹화합니다");
//    }

    public void recordVideo(){      // 동영상을 녹화하면서 화재를 감지하면 바로 화재감지 사인이 출력되게 함
        // 동영상 녹화
//        System.out.println(this.name+ ": 동영상을 녹화합니다");   이렇게 쓰면 상속받는 이유가없다
        super.recordVideo();        // super를 써서 부모의 recordVideo메서드를 쓰고 아래메서드를 실행한다
        detectFire();
    }

    public void detectFire(){
        // 화재 감지
        System.out.println("화재를 감지합니다");
    }

    // 메서드 오버라이딩  부모클래스인 Camera의 코드를 가져와서 내용만 바꿈
    // 그러면 Camera에게 상속을 받아도 오버라이딩 한 코드는 바꾼코드로 출력된다
    public void showMainFeature(){
        System.out.println(this.name + "의 주요기능 : 화재 감지");
    }
}
