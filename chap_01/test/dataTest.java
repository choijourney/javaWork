package chap_01.test;

import java.util.Scanner;

/*

    static void selectProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("다음 세가지중 고르시오.");
        System.out.println("1.감자 2.옥수수 3.수박");
        int select = sc.nextInt();
        if (select == 1) {
            System.out.println("감자를 선택하셨습니다.");
            price("감자", 1000, 2000, 3000);
        }
        if (select == 2) {
            System.out.println("옥수수를 선택하셨습니다.");
            price("옥수수", 4000, 5000, 6000);
        }
        if (select == 3) {
            System.out.println("수박을 선택하셨습니다.");
            price("수박", 10000, 20000, 30000);
        }
    }

    static void price(String product, int price, int price2, int price3) {
        Scanner sc = new Scanner(System.in);
        System.out.println(product + " 1. " + price + " 2. " + price2 + " 3. " + price3
                + " 중 선택해주세요.");
        int selecPrice = sc.nextInt();
        if (selecPrice == 1) {
            selecPrice = price;
            sum(selecPrice);
        }
        if (selecPrice == 2) {
            selecPrice = price2;
            sum(selecPrice);
        }
        if (selecPrice == 3) {
            selecPrice = price3;
            sum(selecPrice);
        }
    }
    static void sum(int selecPrice) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇개 주문할거에요?");
        int num = sc.nextInt();
        System.out.println(num * selecPrice + "원 입니다.");
    }


        selectProduct();



 */
public class dataTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력해주세요");
        int score = sc.nextInt();
        System.out.println("학점을 입력해주세요");
        String al = sc.next();
        method1(al,score);


    }

    static void method1(String al, int score) {


        if (score >= 100 && al.contains("A")) {
            System.out.println(" 점수:" + score + "\n 학점:" + al +
                    "\n 올바른 학점입니다..");

        } else if (score >= 90 && al.contains("B")) {
            System.out.println("올바른 학점입니다..");
        } else if (score >= 80 && al.contains("C")) {
            System.out.println("올바른 학점입니다..");
        } else if (score >= 70 && al.contains("D")) {
            System.out.println("올바른 학점입니다..");
        } else if (score >= 60 && al.contains("E")) {
            System.out.println("올바른 학점입니다..");
        } else if (score >= 50 && al.contains("F")) {
            System.out.println("올바른 학점입니다..");
        } else {
            System.out.println("올바르지않은 학점입니다.");
        }


    }
}





























