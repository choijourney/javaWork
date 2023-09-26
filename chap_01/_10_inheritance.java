package chap_01;

import chap_01.camera.Camera;
import chap_01.camera.FactoryCam;
import chap_01.camera.SpeedCam;

public class _10_inheritance {
    public static void main(String[] args) {
        // 상속  Camera 패키지의 Camera가 부모 클래스, SpeedCam , FactoryCam이 자식클래스로
        // extends를 써서 부모의 코드를 상속받는다
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();


        // 메서드 오버라이딩 : 자식 클래스에서 부모 클래스의 메서드를 덮어쓰기 ( 재정의 )
        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();


        // 다형성

        // class Person : 사람
        // class Student extends Person : 학생 (학생은 사람이다. Student is a person)
        // class Teacher extends Person : 선생님 (선생님은 사람이다. Teacher is a person)
        // 그런데 사람은 모두 학생이 아니고 선생님도 아니다. 이 관계를 is-A 라고 한다.

        Camera camera1 = new Camera();
//      FactoryCam factoryCam1 = new FactoryCam();  원래 이렇게 써야하는데 부모클래스로 바꿀수있다.
        Camera factoryCam1 = new FactoryCam();
        Camera speedCam1 = new SpeedCam();
// 이렇게 부모 클래스로 객체를 만드는것을 다형성 이라 한다.

        camera1.showMainFeature();     // 결과는 같다
        factoryCam1.showMainFeature();
        speedCam1.showMainFeature();

        System.out.println("-------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();
// 배열에 Camera클래스,FactoryCam클래스,SpeedCam클래스를 넣음

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }   // 배열을 for each로 반복시키고 값을얻는다

        System.out.println("--------");
//        factoryCam1.detectFire();
//        speedCam1.checkSpeed();           부모클래스에서 만든객체라 부모클래스 코드만 이용할수있어서
//        speedCam1.recognizeLicensePlate();  자식클래스에서 만든 메서드가 작동안됨

        // 이때 instanceOf 를 써서 factoryCam1 객체가 FactoryCam클래스의 인스턴스인지 확인하고
        // 형변환을 해서 FactoryCam의 메소드에 접근할수있다
        if(factoryCam1 instanceof FactoryCam){
            ((FactoryCam)factoryCam1).detectFire();  // 형변환 방법  (int)3.3 변환처럼 괄호로 변환하면됨
        }
        if (speedCam1 instanceof SpeedCam){
            ((SpeedCam)speedCam1).recognizeLicensePlate();
            ((SpeedCam)speedCam1).checkSpeed();
        }
        System.out.println("--------");
    // 모든 자바클래스는 Object 라는 클래스를 상속하고있다 java.lang.object 라는 클래스가 있는데
    // 이게 우리가 사용하는 모든 클래스의 최상위 클래스이다

    Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();
    // 그래서 Object 배열을 만들어서 클래스들을 넣을수 있다  모든 클래스에 extends Object 이렇게 쓰진않지만
    // 기본적으로 자바에서는 Object 클래스를 상속하고있고 때문에 Object 배열을 쓰면 어떤 형태라도
    // 우리가 모든 클래스 객체를 넣을수있어서 한꺼번에 관리할수 있다


       // super        오버라이딩을 했지만 super를 써서 부모코드를 쓰면서 그뒤에 추가로 기능을 추가함

        factoryCam1.recordVideo();   //super로 상속받은코드 잘실행됨
        System.out.println("--------");
        speedCam1.takePicture();
    }
}

