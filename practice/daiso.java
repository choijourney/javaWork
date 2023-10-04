package practice;

import static practice.DaisoShop.phoneNum;

public class daiso {
    public static void main(String[] args) {
        DaisoShop daisoShop = new DaisoShop();
        daisoShop.shop("주방세제",2);
        daisoShop.shop("스티커", 3);
        daisoShop.shop("양치컵", 2);
        daisoShop.limit("커튼",1);
        daisoShop.setNumber(30);
        daisoShop.limit("펭귄게임",1);

        String daisoPhone= phoneNum();  // 변수에 메서드 저장
        System.out.println("다이소 전화번호는 " +daisoPhone + " 입니다.");
    }
}

// 클래스 이름이 daiso Daiso 로 대소문자만 달랐는데 오류나서 DaisoShop으로 바꿈
class DaisoShop {
    String thingsName;

    int number;
    int count = 1;


    boolean withCar;

    DaisoShop(String thingsName,int number, boolean withCar){
        System.out.println("다이소 왔다 ^_^");
        this.thingsName = thingsName;
        this.number = number;
        this.withCar = withCar;
    }

    DaisoShop(){
        this("가위", 1, false);
        System.out.println(thingsName + " " + number + "개 구매하셨습니다.  (구매개수 : "
                +this.number+ " )");

    }

   void shop(String thingsName,int number){
       this.number= getNumber()+number;
       System.out.println(thingsName + " " + number + "개 구매하셨습니다.  (구매개수 : "
               +this.number + " )");
    }   // 누적개수 구하기

    void limit (){
        System.out.println("무거우니까 그만 사");

    }



    void limit (String thingsName,int number){
        if (getNumber()<30){
            shop(thingsName,number);
        } else limit();
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static String phoneNum(){
        String phone = "02-0000-0900";
        return phone;
    }


}