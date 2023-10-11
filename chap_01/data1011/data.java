package chap_01.data1011;

/*

        Scanner sc = new Scanner(System.in);
        int pr = 0;
        String product = "";

        System.out.println("다음 세 가지 중 고르시오.");
        System.out.println("1. 감자. 2.옥수수 3.수박 4.호박");
        int num = sc.nextInt();

        q();
        if1(num,"감자",pr,sc);
        if2(num,product,pr,sc);
        if3(num,product,pr,sc);

        order(sc, pr, product);

    }
String product;




    public static void q() {
        System.out.println("몇개를 주문 하시겠습니까?");
    }


    public void if1 (int num,String product,int pr,Scanner sc){
        if (num == 1) {
            this.product = product;
            product(num, product);
            choosePrice(product, pr, sc);
            translatePrice(pr);
        }
    }


    public static void choosePrice(String product, int pr, Scanner sc) {
        System.out.println(product + " 1번. 1000원어치  2번. 2000원어치 3번. 3000원어치  1,2,3번 중 선택해주세요. 숫자만 써주세요.!");
        pr = sc.nextInt();
    }

    public  void product(int num, String product) {
        this.product= product;
        System.out.println(num + "번 " + product + " 를 선택하셨습니다.");
    }

    public  void if2 (int num,String product,int pr,Scanner sc){
        this.product= product;
        if (num == 2) {
            product = "옥수수";
            product(num, product);
            choosePrice(product, pr, sc);
            translatePrice(pr);
        }
    }

    public  void if3 (int num,String product,int pr,Scanner sc){
        this.product=product;
        if (num == 3) {
            product = "수박";
            product(num, product);
            choosePrice(product, pr, sc);
            translatePrice(pr);
        }
    }

    public static void pickOne(Scanner sc) {
        System.out.println("다음 세 가지 중 고르시오.");
        System.out.println("1. 감자. 2.옥수수 3.수박");
        int num = sc.nextInt();
    }




    public static void translatePrice(int pr) {
        if (pr == 1) {
            pr = 1000;
        }
        if (pr == 2) {
            pr = 2000;
        }
        if (pr == 3) {
            pr = 3000;
        }
    }

    public static void order(Scanner sc, int pr, String product) {
        q();
        int numOne = sc.nextInt();
        int number = numOne * pr; // 변수로 따로빼거나 () 괄호로 묶기
        System.out.println(product + " " + numOne + "개 주문하셔서 총 " + number + "원 입니다.");

    }


}

 */

import java.util.Scanner;

public class data {
    public static void main(String[] args) {
        int sum = foodSelect();
        System.out.println("sum = " + sum);
    }

    //food
    public static int foodSelect() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. rkawk 2. dhrtntn 3. tnqkr 4. ghqkr");
        int select = sc.nextInt();

        if (select == 1) {
            return foodPriceSelect("rkawk", 1000, 2000, 3000);
        }
        if (select == 2) {
            return foodPriceSelect("dhrtntn", 4000, 5000, 6000);
        }
        if (select == 3) {
            return foodPriceSelect("tnqkr", 10000, 20000, 30000);
        }
        if (select == 4) {
            return foodPriceSelect("ghqkr", 1, 2, 3);
        }
        return 0;
    }

    //Price
    public static int foodPriceSelect(String food, int price1, int price2, int price3){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. "+price1+" 2. "+price2+" 3. "+price3);
        int select = sc.nextInt();

        if (select == 1) {
            return foodNumberSelect(food,price1);
        }
        if (select == 2) {
            return foodNumberSelect(food,price2);
        }
        if (select == 3) {
            return foodNumberSelect(food,price3);
        }
        return 0;
    }

    //number
    public static int foodNumberSelect(String food, int price){
        Scanner sc = new Scanner(System.in);
        System.out.println("number input : ");
        int number = sc.nextInt();

        return number * price;
    }
}

