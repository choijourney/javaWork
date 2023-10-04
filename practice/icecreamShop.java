package practice;

public class icecreamShop {
    public static void main(String[] args) {
        Icecream icecream = new Icecream("붕싸", 5, 1300);
        System.out.println(icecream.getIcecream() + " " + icecream.getNumber() + "개 "
                + icecream.getPrice() + "원 입니다 ^~^ ");
        icecream.setIcecream("거북이알");
        icecream.setNumber(3);
        System.out.println(icecream.getIcecream() + " " + icecream.getNumber() + "개 "
                + icecream.getPrice() + "원 입니다 ^~^ ");
        icecream.setIcecream("조안나");
        icecream.setNumber(1);
        icecream.setPrice(5000);
        System.out.println(icecream.getIcecream() + " " + icecream.getNumber() + "개 "
                + icecream.getPrice() + "원 입니다 ^~^ ");

        icecream.setPrice(-5000);  // price에 private을써서 변경하려면 setPrice로밖에못함
        System.out.println(icecream.getPrice());
        // price가 1000원 미만이면 1000원으로 설정해놔서 1000 출력
    }

}

class Icecream {
    String icecream;

    public String getIcecream() {
        return icecream;
    }

    public void setIcecream(String icecream) {
        this.icecream = icecream;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        if(this.price < 1000){
            this.price = 1000;
        }
        return price * number;
    }

    public void setPrice(int price) {
        if (price < 1000) {
            this.price = 1000;
        } else
            this.price = price;
    }

    int number;
   private int price;

    Icecream(String icecream, int number, int price) {
        this.icecream = icecream;
        this.number = number;
        this.price = price;
    }

    Icecream() {
        this("붕싸", 10, 1300);
    }

}