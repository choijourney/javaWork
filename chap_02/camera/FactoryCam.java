package chap_02.camera;

import chap_02.detector.Detectable;
import chap_02.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {   // 자식클래스에서 구체화 시킨후 객체를 만들 수있다
    private Detectable detector; // Detectable인터페이스에 있는 detect메서드를 사용하려고 변수를만듦

    private Reportable reporter;

    public void setDetector(Detectable detector) {  // 인수에 인스턴스 전달
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }


    @Override
    public void showMainFeature() {     // 부모클래스인 Camera의 추상메서드를 가져와 오버라이딩
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {  // Detectable인터페이스에 있는 detect메서드를 사용하려고
        detector.detect();  // 변수 detector를 만들고 메서드를 씀
    }

    @Override
    public void report() {
        reporter.report();
    }


}
