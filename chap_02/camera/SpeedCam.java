package chap_02.camera;

import chap_02.detector.Detectable;
import chap_02.reporter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable {


    Detectable detector;
    Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호판 인식");
    }

    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}


