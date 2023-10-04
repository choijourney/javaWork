package practice;

public class beautyShop {
    public static void main(String[] args) {
        NailArt nailArt = new NailArt("네일샵", "K", "hand", 55000,
                "charactor");
        System.out.println(nailArt.nailistName);
        System.out.println(nailArt.design);
        System.out.println("--------");

        NailArt pedi = new NailArt();
        pedi.nailistName = "J";
        pedi.handOrfoot = "foot";
        pedi.price = 65000;
        pedi.design = "full Color";

        System.out.println(pedi.nailistName);
        System.out.println(pedi.design);

        System.out.println("--------");

        NailArt hand = new NailArt();
        System.out.println(hand.design);
        System.out.println(hand.handOrfoot);
        hand.introduce();
        System.out.println("---------");
        Waxing waxing = new Waxing();
        waxing.introduce();

        System.out.println("----------");
        Hair hair = new Hair();
        hair.introduce();

        System.out.println("----------");

        NailArt nailShop = new NailArt();
        NailArt waxingShop = new Waxing();
        NailArt hairShop = new Hair();

        System.out.println("-----------");

        NailArt[] nailArts = new NailArt[3]; // 배열에 NamiArt라는 클래스를 가져온다 맨앞클래스필수
        nailArts[0] = new NailArt();    // 첫번째 배열은 NailArt 클래스
        nailArts[1] = new Waxing();     // 두번쨰 배열은 Waxing 클래스
        nailArts[2] = new Hair();       // 세번째 배열은 Hair 클래스

        for (NailArt beauty: nailArts) {   // 배열이니까 foreach로 반복시킨다
            beauty.introduce(); // introduce 메서드를 NailArt,Waxing,Hair 버전으로 반복시킨다.
        }
        System.out.println("----------");

        // wawing.counter  오류남 부모클래스로 인스턴스를 만들었기때문에 자식클래스메서드가 적용안됨
        // 이럴때 instance of 를 사용하는 방법이있다
        if(waxing instanceof Waxing){
            ((Waxing)waxing).counter(1);
        }


    }


}


class NailArt {
    String shopName;
    String nailistName;
    String handOrfoot;
    int price;
    String design;

    NailArt(String shopName, String nailistName, String handOrfoot, int price, String design) {
        //  greet("네일샵"); // greet을 생성자에쓰면 왁싱샵,헤어샵 생성자에도 greet이생기는데
//  왁싱샵에서 인수를 따로 설정해도 "안녕하세요 네일샵입니다" 라고뜸  그래서 인수있는메서드는 생성자에쓰면안됨
        this.shopName = "네일샵";
        this.nailistName = nailistName;
        this.handOrfoot = handOrfoot;
        this.price = price;
        this.design = design;
    }



    public NailArt() {
        this("네일샵", "U", "foot", 65000, "fullColor");
    }


    void greet(String shopName) {
        System.out.println("안녕하세요 " + shopName + " 입니다 ^-^");

    }

    void introduce() {
        System.out.println("저희 " + this.shopName + "은 국산젤, 일회용 파일을 사용하고 있습니다.");
    }   // 메서드 오버라이딩

}

class Waxing extends NailArt {
    String waxer;
    String skinOf;
    int leftTime;

    int counter = 20;
    int num;

    Waxing(String shopName, String waxer, String skinOf, int leftTime) {
        greet("왁싱샵");   // greet은 NailArt에서 상속받음
        this.shopName = "왁싱샵";
        this.waxer = waxer;
        this.skinOf = skinOf;
        this.leftTime = leftTime;
        counter(2);
    }

    Waxing() {
        this("왁싱샵", "T", "legs", 10);
    }


    void counter(int num) {
        System.out.println("감사합니다 오늘 횟수 " + num + "회 차감합니다.");
        leftTime = counter - num;
        System.out.println(leftTime + "번 남았습니다.");
    }

    void introduce() {
        System.out.println("저희 " +this.shopName + "은 인체에 무해한 왁스를 사용하고 있습니다.");
    }        // 메서드 오버라이딩

}

class Hair extends NailArt {
    String designer;
    String whatDesign;
    boolean decolorization; //탈색여부

    Hair(String designer, String whatDesign, boolean decolorization) {
        greet("헤어샵");
        this.shopName = "헤어샵";
        this.designer = designer;
        this.whatDesign = whatDesign;
        this.decolorization = decolorization;
    }

    Hair() {
        this("kim", "color", false);

    } // greet 은 NailArt에서 상속받음

    void introduce() {
        System.out.println("저희 "+ this.shopName + "은 저자극 펌제, 염색약을 사용하고 있습니다.");
    }        // 메서드 오버라이딩

}