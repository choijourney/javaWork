package chap_01;

import java.time.format.ResolverStyle;

public class _12_final_enum {
//    public final class _12_final {  // class에도 final을 쓸수있음
    public static void main(String[] args) {
//    public  static final void main(String[] args) {
        // final 상수
        // 메서드,변수,클래스 앞에 final을 써서 상수로 만든다.
        // 상수로 만들면 값을 절대 못바꾼다 메서드 오버라이딩도 못한다
        
        // public > abstract > static > final  위치순서


        // Enum 열거혐
        // 상수들의 묶음
        // 달력, 옷사이즈, 해상도 같은 변하지않는 값을 묶어서 열거한다
//        enum Resoulution {    enum 쓰는 방법 이름첫글자 대문자,
//            HD, FHD, UHD }    내용을 대문자로씀 클래스와 main 밖에서 씀

        Resoulution resoulution = Resoulution.HD;
        // 열거내용을 쓰는방법  클래스 정의와 비슷하게 씀
        System.out.println(resoulution); // HD 출력
        resoulution = Resoulution.FHD;   // 값을 바꿈
        System.out.println(resoulution); // FHD 출력

        // enum은 switch문과 같이 많이 쓰인다
        System.out.println("동영상 녹화 품질은 :");
    switch (resoulution){
        case HD :
            System.out.println("일반 화질");
            break;
        case FHD :
            System.out.println("고화질");
            break;
        case UHD :
            System.out.println("초고화질");
            break;
    }      // 동영상 녹화 품질은 : 고화질  출력

        resoulution = Resoulution.valueOf("UHD");
        System.out.println(resoulution);  // UHD 출력
//        문자열을 열거형으로 바꿔준다고해서
// valueOf("QHD")를 넣어봤는데 enum값에 QHD가 없다고 에러남. 추가는 못함

        for (Resoulution myRes : Resoulution.values()) {
            System.out.println(myRes.name() + " : " + myRes.ordinal());
        }
        // for each 로 enum Resolution 을 순회시킴
        // .name() 은 myRes에 있는 요소의 이름을 보여주는 메서드
        // .ordinal() 은 요소의 순서 인덱스를 보여주는 메서드

        for (Resoulution myRes : Resoulution.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }
        // Resolution 값 이름들와 해상도 출력
    }
}
enum Resoulution {
    HD(128), FHD(1920), UHD(3840);  //@
    // HD = 1280, FHD = 1920 , UHD =3840 상수에 값을 넣고싶으면
    private final int width;  // width라는 상수를 선언

Resoulution(int width){     //생성자 만들고
    this.width = width;
}
public int getWidth(){  //getter 만들고  @줄에 HD()괄호에 값을 적으면됨
    return width;       // 어디서 width값을 쓸수있으니 getter를 만든다
}
}