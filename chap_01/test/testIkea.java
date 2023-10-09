package chap_01.test;

public class testIkea {
    public static void main(String[] args) {      // Ikea 클래스 썼음
        // 메서드 연습
        String things;
        int chairLeft = 10;
        int num;


        staff();
        order("의자", 2);

        senior("의자");

        things = "의자";
        num = 2;
        chairLeft -= num;

        junior(num, chairLeft);

        testIkea ikea = new testIkea();     // 이 페이지에있는 클래스 안에서 private으로 price를 만들었는데
        System.out.println("가격은 " + ikea.getPrice() + "원 입니다 ");    // 클래스안에선 price에 접근가능하니까
        ikea.price = 25000;                 // price 값을 바꿀수있다
        System.out.println(ikea.price);     // 25000 출력

        Ikea ikea1 = new Ikea();    // Ikea클래스를 따로 만들어서 private으로 price 변수를 만들었더니
        //  ikea1.price = 30000;        // 접근 불가. 값을 바꿀 수 없다

        // System.out.println(ikea1.price);  // 값을 바꾸긴 커녕 출력도 안된다
        ikea1.setPrice(10000);
        System.out.println(ikea1.getPrice());  // setprice와 getPrice를 통해서만 출력, 값변경 가능하다  
    }


    private int price = 30000;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public static String staff() {
        System.out.println("안녕하세요 무엇을 도와드릴까요 ?");
        return "안녕하세요 무엇을 도와드릴까요 ?";
    }


    public static String order(String things, int num) {
        System.out.println(things + " " + num + "개 주세요");
        return things + " " + num + "개 주세요";
    }

    public static String senior(String things) {
        System.out.println(things + " 몇 개 남아있나요?");
        return things + " 몇 개 남아있나요?";
    }

    public static String junior(int num, int chairLeft) {
        System.out.println(num + "개 팔려서 " + chairLeft + "개 남았습니다.");
        return num + "개 팔려서 " + chairLeft + "개 남았습니다.";
    }


}
