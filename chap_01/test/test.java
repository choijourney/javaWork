package chap_01.test;


import java.util.Scanner;

/*

        int age;
        age =27;

        int num =21;
        age = 26;

        age = num;
        age = age+1;

        System.out.print("Hello, I'm ");
        System.out.print(age);
        System.out.print(".");

        String  mystring = "나는 " + "Java를 배우고 있다!";
        System.out.println(mystring);

        System.out.println("Hello, I'm "+ 20 + ".");

        // 문제

        int people = 10;
        String foods = "떡볶이";
        int price = 100000;
        String a = "은";
        String a1 = "는";
        String a2 = "를";
        String a3 = "을";
        String a4 = "의";
        String b = "원";
        String c = "어치.";
        String d = "합치면";
        String e = "모자란";
        String f = "내야만";

        System.out.println("총 "+ people + "명의 사람이 다 함께 음식점에 도착하였다.");
        System.out.println("총 "+ people + "명이 모은 금액은 "+ price + b+ "이다.");
        price = 6470000;
        System.out.println(foods + a1 + " " + price + b +" " +c);
        foods = "감자튀김";
        price = 6988000;
        System.out.println(foods + a + " "+ price + b +" " +c);
        foods = "모듬 튀김";
        price = 666777;
        System.out.println(foods + a + " "+ price + b +" " +c);
        foods = "김말이 튀김";
        price = 8900000;
        System.out.println(foods + a + " "+ price + b +" " +c);
        foods = "계란 튀김";
        price = 70000;
        System.out.println(foods +  a  + " "+ price + b +" " +c);
        foods = "순대";
        price = 438000;
        System.out.println(foods + a1 + " "+ price + b +" " +c);
        foods = "우동";
        price = 660000;
        System.out.println(foods + a + " "+ price + b +" " +c);
        foods = "오뎅";
        price = 1480000;
        System.out.println(foods + a + " "+ price + b +" " +c);
        foods = "돈까스";
        price = 728000;
        System.out.println(foods + a1 + " "+ price + b +" " +c);
        foods = "치즈 돈까스";
        price = 889000;
        System.out.println(foods + a1 + " "+ price + b +" " +c);
        foods = "계란 볶음밥";
        price = 4385000;
        System.out.println(foods + a + " "+ price + b +" " +c);
        foods = "음료수";
        price = 190000;
        System.out.println(foods + a1 + " "+ price + b +" " +c);
        foods = "과자";
        price = 150000;
        System.out.println(foods + a1 + " "+ price + b +" 어치" + a2 + " 사먹게 되었다.");
        System.out.println("위 음식"+ a4 + " 가격"+ a3 + " 모두 " + d + " ?"+ b+ "이고,");
        System.out.println("현재 ?"+ b + "이 부족한 상태다.");
        System.out.println("따라서, ?명" + a + " ?" + b + a3 +" 더 내야만 한다.");



 */
public class test {
    public static void main(String[] args) {
//        boolean myBoolean = true;
//        myBoolean = false;
//        System.out.println(myBoolean);
//
//        long myLong = 12345667789L;
//
//        int a = 9;
//        double b = 5;
//        System.out.println(a + "+" + b + " = " + (a + b));
//
//        System.out.println(3+ " > " + 2 + ":" + (3>2));
//
//        System.out.println("!true : " + !true);

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 사람 이름 : ");
        String name1 = scanner.next();
        System.out.println("두번째 사람 이름 : ");
        String name2 = scanner.next();
        System.out.println("첫번째 음식 이름 : ");
        String food1 = scanner.next();
        System.out.println(food1 + "의 가격 ");
        int food1Data = scanner.nextInt();
        System.out.println("두번째 음식 이름 : ");
        String food2 = scanner.next();
        System.out.println(food2 + "의 가격 ");
        int food2Data = scanner.nextInt();
        System.out.println("세번째 음식 이름 : ");
        String food3 = scanner.next();
        System.out.println(food3 + "의 가격 ");
        int food3Data = scanner.nextInt();
        System.out.println("네번째 음식 이름 : ");
        String food4 = scanner.next();
        System.out.println(food4 + "의 가격 ");
        int food4Data = scanner.nextInt();
        System.out.println("다섯번째 음식 이름 : ");
        String food5 = scanner.next();
        System.out.println(food5 + "의 가격 ");
        int food5Data = scanner.nextInt();
        System.out.println("여섯번쨰 음식 이름: ");
        String food6 = scanner.next();
        System.out.println(food6 + "의 가격 ");
        int food6Data = scanner.nextInt();

        System.out.println("은");
        String en =scanner.next();
        System.out.println("는");
        String nen = scanner.next();
        System.out.println("을");
        String el = scanner.next();
        System.out.println("를");
        String lel = scanner.next();
        System.out.println("원");
        String won = scanner.next();
        System.out.println("어치");
        String uchi = scanner.next();
        System.out.println("지불");
        String pay = scanner.next();


        System.out.println(name1 + "와 " + name2 + nen + " 함께 음식을 준비했습니다.");
        System.out.println(name1 + en + " " + food1 + ", " + food2 + ", " + food3 + lel + " 샀습니다.");
        System.out.println(name1 + nen + food4 + ", " + food5+ ", " + food6 + lel + " 샀습니다.");
        System.out.println(food1 + nen + " " + food1Data + won + ", " + food2 + nen + " " +
                food2Data + won + ", " + food3 + nen + " " + food3Data + won + "입니다.");
        System.out.println(food4 + en + " " + food4Data + won + ", " +
                food5 + en + " " + food5Data + won + ", " + food6 + nen + " " + food6Data + won + "입니다.");
        System.out.println("총 합" + en + " ?" + won + "이 나왔습니다.");
        System.out.println(name1 + nen + " ?" + won + el + " " + pay + " 하고");
        System.out.println(name2 + nen + " ?" + won + el + " " + pay + " 하였습니다.");
        System.out.println(name2 + nen + " " + name1 + "보다 ?" + won + el + " 더 " +pay+ "했습니다.");
    }
}
