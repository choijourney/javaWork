package chap_02.reporter;

public class NormalReporter implements Reportable{   //인터페이스 Reportable을 구현함
    @Override
    public void report() {     // 메서드 구체화   메서드 구체화를 안하면 오류표시
        System.out.println("일반 화재 신고를 진행합니다.");
    }
}
 // NormalReporter 클래스는 신고를 하는 기능을 가진 클래스로 만듦