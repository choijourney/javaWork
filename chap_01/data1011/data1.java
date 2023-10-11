package chap_01.data1011;

import java.util.Scanner;

public class data1 {
    public static void main(String[] args) {
        getSelect();

    }

    // 채소선택
    public static int getSelect() {
        Scanner sc = new Scanner(System.in);
        System.out.println("다음 세 가지 중 고르시오.");
        System.out.println("1. 감자 2.옥수수 3.수박");
        int select = sc.nextInt();
        if (select == 1) {
            System.out.println(" 감자를 선택하셨습니다.");
            price("감자", 1000, 2000, 3000);
        }
        if (select == 2) {
            System.out.println(" 옥수수를 선택하셨습니다.");
            price("옥수수", 4000, 5000, 6000);
        }
        if (select == 3) {
            System.out.println(" 수박을 선택하셨습니다.");
            price("수박", 10000, 20000, 30000);
        }

        return 0;
    }

    // price
    public static int price(String product, int price1, int price2, int price3) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. " + price1 + "원  2. " + price2 + "원  3. " + price3 + "원  번호중에 골라주세요.");
        int selectPrice = sc.nextInt();
        if (selectPrice == 1) {
            System.out.println(product + " " + price1 + "원어치를 선택하셨습니다.");
            sum(price1);
        }

        if (selectPrice == 2) {
            System.out.println(product + " " + price2 + "원어치를 선택하셨습니다.");
            selectPrice = price2;
            sum(price2);
        }
        if (selectPrice == 3) {
            System.out.println(product + " " + price3 + "원어치를 선택하셨습니다.");
            sum(price3);
        }
        return 0;
    }

    // sum
    public static void sum(int price) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 개를 주문하시겠습니까?");
        int number = sc.nextInt();
        System.out.println((price * number) + "원 입니다.");
    }


}
