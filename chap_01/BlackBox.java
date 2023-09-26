package chap_01;

public class BlackBox {
    String modelName; // 모델이름
    String resolution; // 화질
    String price; // 가격
    String color; //색생
    // 이 네개의 값들을 인스턴스변수 라고 한다. 필드 라고도 부른다.
    static boolean canAutoReport = false; // 자동 신고 기능 
    // static이 붙으면 클래스변수 라고 한다. 고정된 변수로 모든 인스턴스에 사용가능하다
    // 같은 클래스 내에서 호출이 가능하다

    // 메서드 만듦
    // void 는 리턴값이 없다
    void autoReport() {       // 자동 신고 기능 메서드
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {   // 메모리카드 용량 메서드
        System.out.println("메모리 카드 용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {    // 영상 개수 알려주는 메서드
        if (type == 1) {  // 일반 영상 타입1
            return 9;
        } else if (type == 2) {  // 이벤트 영상 타입2
            return 1;
        }
        return 10;  // 알 수 없는 값일때
        // 일반 영상과 이벤트영상을 타입을 나눠 보관하고 있다가 원하는 타입을 입력하면 보여줌


        // public static
    }
}  
