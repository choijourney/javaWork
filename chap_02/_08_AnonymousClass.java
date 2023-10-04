package chap_02;

public class _08_AnonymousClass {
    public static void main(String[] args) {
//HomeMadeBurger momMadeBurger = new HomeMadeBurger() {
//    @Override                    익명클래스를 이렇게 써도되지만 코드가 복잡해져서
//    public void cook() {          따로 메서드를 만들었다
//
//    }
//};

        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();

        HomeMadeBurger broMadeBurger = getBroBurger();
        broMadeBurger.cook();
    }

    private static HomeMadeBurger getBroBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("동생표 군대리아");
                System.out.println("재료 : 빵, 치킨패티, 딸기쨈, 치즈, 삶은계란");
            }
        };
    }

    public static HomeMadeBurger getMomMadeBurger() {
        return new HomeMadeBurger() {   // 익명클래스
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제버거");
                System.out.println("재료 : 빵, 패티, 해시브라운, 양상추, 마요네즈, 피클");
            }
        };
    }





}

abstract class HomeMadeBurger {  // 추상클래스 구체화해야 객체를만들수있다
    public abstract void cook();  // 추상메서드
}
// 버거재료가 출력되는 메서드를 만들건데 집집마다 버거재료는 다르다
// 그때마다 클래스와 메서드를 만들 수 없으니, 익명클래스를 이용한다