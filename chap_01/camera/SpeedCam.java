package chap_01.camera;

public class SpeedCam extends Camera {  // 자식 클래스  extends를 써서 하나의 부모한테서 상속을 받을수있다
//    public String name;   이줄은 Camera에서 상속받아 쓴다

    // alt + insert 누르면 generator 바로떠서 constructor를 만들수있다
    public SpeedCam() {     // 생성자 만듦
//        this.name = "과속 단속 카메라";
        super("과속 단속 카메라"); // 부모 생성자에서 상속받음
    }

//    public void takePicture() {   이줄은 Camera에서 상속받아 쓴다
//        // 사진 촬영
//        System.out.println("사진을 촬영합니다");
//    }
//
//    public void recordVideo() {
//        // 동영상 녹화
//        System.out.println("동영상을 녹화합니다");
//    }

public void takePicture(){      // 사진촬영하면서 속도측정과 번호판인식을 동시에 하게끔함
    // 사진 촬영
//    System.out.println(this.name+ ": 사진을 촬영합니다"); 이렇게 쓰면 상속받는 이유가없다
    super.takePicture();        // super를 써서 부모의 takePicture메서드를 쓰고 아래메서드를 실행한다
    checkSpeed();
    recognizeLicensePlate();
} // 오버라이딩을 했지만 부모코드를 쓰면서 그뒤에 추가로 기능을 추가함


    public void checkSpeed() {
        //속도 체크
        System.out.println("속도를 측정합니다");
    }

    public void recognizeLicensePlate(){
        // 번호판 인식
        System.out.println("차량 번호를 인식합니다");
    }

    // 메서드 오버라이딩  부모클래스인 Camera의 코드를 가져와서 내용만 바꿈
    // 그러면 Camera에게 상속을 받아도 오버라이딩 한 코드는 바꾼코드로 출력된다
    @Override  // annotation 주석  없어도됨
    public void showMainFeature(){
        System.out.println(this.name + "의 주요기능 : 속도 측정, 번호판 인식");
    }




}
