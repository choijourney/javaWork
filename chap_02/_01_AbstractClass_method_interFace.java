package chap_02;

import chap_02.camera.Camera;
import chap_02.camera.FactoryCam;
import chap_02.camera.SpeedCam;
import chap_02.detector.AccidentDetector;
import chap_02.detector.AdvancedFireDetector;
import chap_02.detector.Detectable;
import chap_02.detector.FireDetector;
import chap_02.reporter.NormalReporter;
import chap_02.reporter.Reportable;
import chap_02.reporter.VideoReporter;

public class _01_AbstractClass_method_interFace {
    public static void main(String[] args) {


        // 데이터 추상화 ( Data Abstraction)
        // abstract
        // 추상 클래스 ( 아직 완성되지 않은 클래스 )  객체를 만들수 없다
        // 반드시 자식클래스를 만들어서 구체화를 시킨후 객체생성 가능
        // 추상 메서드 ( 추상 클래스 또는 인터페이스에서만 사용가능한 껍데기만 있는 메서드)

        //  Camera camera = new Camera();  추상클래스라 객체만들수없음
        FactoryCam factoryCam = new FactoryCam();
        //Camera factoryCam = new FactoryCam();  부모클래스를 앞에써서 자식객체를 만들수있다
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();


        // 인터페이스 뼈대만 제공함
        // 클래스는 단일 상속이지만 인터페이스는 여러개를 상속받을수있다

        NormalReporter normalReporter = new NormalReporter();
        // Reportable normalReporter = new NormalReporter();  인터페이스를 써서 만들수도있음
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("-------");

        FactoryCam factoryCam1 = new FactoryCam();
        factoryCam1.setDetector(fireDetector);  // factoryCam1객체에 fireDetector객체 전달
        factoryCam1.setReporter(normalReporter); // normalReporter객체 전달

        factoryCam1.detect();   //메서드 실행하면 fireDetector의 detect메서드 실행
        factoryCam1.report();   //normalReporter의 report메서드 실행


        System.out.println("--------");
        // quiz
        AccidentDetector accidentDetector = new AccidentDetector();
        speedCam.setDetector(accidentDetector);
        speedCam.setReporter(videoReporter);
        speedCam.detect();
        speedCam.report();

    }
}