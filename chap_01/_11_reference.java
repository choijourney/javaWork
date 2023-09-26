package chap_01;

import chap_01.camera.Camera;

public class _11_reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형 : int, float, double, long, boolean ...
        // 소문자로 적혀있는 자료형을 기본자료형이라함 모두 기본값이 있다. 0, 0.0, false 등..
        int[] i = new int[3];
        System.out.println(i[0]); //0 출력

        double[] d = new double[3];
        System.out.println(d[0]); // 0.0 출력
        // 기본자료형은 배열에 아무값을 넣지않아도 0 출력

        // 참조 자료형 : String, Camera, FactoryCam,SpeedCam같은 객체..

        String[] s = new String[3];
        System.out.println(s[0]); // null 출력

        Camera[] c = new Camera[3];   // Camera는 문자열이아니라 null일지 확인한다
        System.out.println(c[0] == null); // true 출력

        // 참조 자료형은 기본값이 없고 null 출력
        // 기본자료형은 메서드가 없고 참조자료형은 메서드가 있다
        // 기본자료형은 소문자로 시작, 참조자료형은 대문자로 시작

        System.out.println("--------");

        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a); //10
        System.out.println(b); //10
        b = 30;
        System.out.println(a); //10
        System.out.println(b); //30
        System.out.println("---------");

        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name); // 카메라1
        System.out.println(c2.name); // 카메라2
        c2 = c1;
        System.out.println(c1.name); // 카메라1
        System.out.println(c2.name); // 카메라1
        c2.name = "고장난 카메라";
        System.out.println(c1.name); // 고장난 카메라
        System.out.println(c2.name); // 고장난 카메라
        changeName(c2);         // 메서드로 c2의 이름을 바꿈
        System.out.println(c1.name); // 잘못된 카메라
        System.out.println(c2.name); // 잘못된 카메라
        c2 = null;
        System.out.println(c1.name); // 잘못된 카메라
        System.out.println(c2.name); // null에러

        // 처음에 c1과 c2는 다른 값을 참조하고 있었다. c2=c1 을 하면 c2와 c1의 참조가
        // 같아진다. c2가 c1의 참조를 같이 참조한다. 그래서 c2의 값을 바꿀때
        // c1의 참조를 바꾼다.
        // 여기서 참조를 끊으려면 c2.name= null 로 끊는다

        // 기본자료형은 참조를 같이쓰지않는다. 참조자료형만 참조를 같이쓴다.
    }
        public static void changeName(Camera camera){
            camera.name = "잘못된 카메라";
        }
        // 메서드라서 main 밖에 썼음
}
