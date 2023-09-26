package chap_01.camera;

public class SlowActionCam extends ActionCam {
    public SlowActionCam() {  // alt + insert 로 생성자만들기
        this.name = "슬로우 액션 카메라";
        // extends ActionCam이라  super("액션 카메라"); 쓸수없다.(이기능은Camera에서상속받아야함)
    }
}
