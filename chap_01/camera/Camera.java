package chap_01.camera;

public class Camera{    // 부모 클래스
    public String name;

//    public Camera() {       //생성자 만듦 code - generator - constructor 클릭
//        this.name = "카메라";
//    }

   public Camera(){
       this("카메라");    // 아래 생성자에서 인수를 name으로 설정해서 this쓰고 인수에 name을 적는다
   }                            // 이설정은 자식클래스에게도 상속됨

    protected Camera(String name){  // 인수를 name으로 설정한다
        this.name = name;
    }

    public void takePicture(){
        // 사진 촬영
        System.out.println(this.name+ ": 사진을 촬영합니다");
        // this.name을 썼을때 상속을 받았어도 상속받은클래스의 이름이 출력됨
    }

    public void recordVideo(){
        // 동영상 녹화
        System.out.println(this.name+ ": 동영상을 녹화합니다");
    }

    public void showMainFeature(){
        System.out.println(this.name + "의 주요기능 : 사진 촬영, 동영상 녹화");
    }       // 자식클래스에서도 이 메서드를 가져다 쓰는데 그 자식들한텐 화재 감지 기능도 있고 속도 측정 기능도 있다
            // 그래서 메서드 오버라이딩을 할거다. 이 메서드를 가져가서 자식클래스에서 내용만 바꾸면 된다
}
