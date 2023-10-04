package chap_02.camera;

import chap_02.detector.Detectable;
import chap_02.reporter.Reportable;

public abstract class Camera {      // 추상클래스 abstract 에선 객체를 만들수없다



    public void takePicture(){
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo(){
        System.out.println("동영상을 녹화합니다");
    }

    public abstract void showMainFeature();  // 자식클래스에서 구현해야하는 메서드
}
