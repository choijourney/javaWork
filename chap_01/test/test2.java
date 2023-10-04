package chap_01.test;

import java.util.Scanner;

/*

//        Scanner sc = new Scanner(System.in);
//        System.out.println("첫번째 숫자 입력 : ");
//        int a = sc.nextInt();
//        System.out.println("두번째 숫자 입력 : ");
//        int b = sc.nextInt();

//        if(a<b){
//            System.out.println("b가 a보다 큽니다.");
//        }
//        if(a>b){
//            System.out.println("a가 b보다 큽니다.");
//        }
//        if(a == b){
//            System.out.println("값이 같습니다.");
//        }
//        if(a != b) {
//            System.out.println("값이 다릅니다.");
//        }
//        if(a <= b){
//            System.out.println("b가 a보다 크거나 둘이 같습니다.");
//        }
//
//        if (a == 1 && b == 1) {
//            System.out.println("a에 1이 들어있고, b에도 1이 들어있습니다.(and)");
//        }
//        if (a != 1 || b != 1) {
//            System.out.println("a에 1이 들어있거나, 혹은 b에 1이 들어있지않습니다.(or)");
//        }
//
//String str1 = "Hello";
//String str2 = "Hello";
//String str3 = "World";
//        if(str1.equals(str2)){
//            System.out.println("str1과 str2는 같습니다.");
//        }else  {
//            System.out.println("str1과 str2는 다릅니다.");
//        }
//        if(str1.equals(str3)){
//            System.out.println("str1과 str3은 같습니다.");
//        }else {
//            System.out.println("str1과 str3는 다릅니다.");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("첫번째 사람이름 입력 : ");
//        String  a = sc.next();
//        System.out.println("두번째 사람이름 입력 : ");
//        String  b = sc.next();
//        System.out.println("세번째 사람이름 입력 : ");
//        String  c = sc.next();
//        System.out.println("km 수 : ");
//        int km = sc.nextInt();
//        System.out.println("답 : ");
//        int answer =sc.nextInt();
//
//        System.out.println(a + "과 " + b + "와" + c +"이 있다.");
//        System.out.println("셋의 집은 각각 "+ km + "km마다 떨어져 있는 거리에 존재한다.");
//        System.out.println("세 명의 집을 차례대로 방문하려면 몇 km를 걸어가야 하는가.");
//        System.out.println("답 : "+ answer );
//        System.out.println();
//
//        if(answer==(km*3)){
//            System.out.println("정답입니다.");
//        }else {
//            System.out.println("오답입니다.");
//            System.out.println("답은 30km입니다.");
//        }


//        Scanner sc = new Scanner(System.in);
//        System.out.println("첫번째 숫자 입력 : ");
//        int a = sc.nextInt();
//        System.out.println("두번째 숫자 입력 : ");
//        int b = sc.nextInt();
//        System.out.println("둘중 더 큰 숫자는 ?");
//        int answer1 = sc.nextInt();






        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자 입력 : ");
        int a = sc.nextInt();
        System.out.println("두번째 숫자 입력 : ");
        int b = sc.nextInt();
        System.out.println("10 + 20 =");
        int answer = sc.nextInt();

        if (answer == a + b) {
            System.out.println("정답입니다.");
        } else {
            System.out.println("오답입니다.");
            System.out.println("정답은 " + (a + b) + " 입니다.");
        }

        System.out.println("둘중 더 큰 숫자는 ? " + a + b);
        int c = sc.nextInt();

        if (c == 1) {
            if (a > b) {
                System.out.println("정답입니다.");
            }
            if (b > a) {
                System.out.println("오답입니다 답은 2번입니다.");
            }
        }
        if (c == 2) {
            if (a < b) {
                System.out.println("정답입니다.");
            }
            if (b < a) {
                System.out.println("오답입니다 답은 1번입니다.");
            }
        }


 */
public class test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("a 숫자 입력 : ");
        int a = sc.nextInt();
        System.out.println("b 숫자 입력 : ");
        int b = sc.nextInt();
        System.out.println("c 숫자 입력 : ");
        int c = sc.nextInt();
        System.out.println("d 숫자 입력 : ");
        int d = sc.nextInt();
        System.out.println("e 숫자 입력 : ");
        int e = sc.nextInt();
        System.out.println("f 숫자 입력 : ");
        int f = sc.nextInt();
        System.out.println("g 숫자 입력 : ");
        int g = sc.nextInt();


        if (!(a >= 5000 && a < 10001)) {
            System.out.println("a 가 잘못되었습니다.");
        }

        if (!(b > 3999)) {
            System.out.println("b 가 잘못되었습니다.");
        }

//        if (a < b) {
//            if (c == a + b) {
//
//            } else {
//                System.out.println("c가 잘못되었습니다.");
//            }
//        }

        if (a < b) {
            c = a + b;
            if (!(c == a + b)) {
                System.out.println("c가 잘못되었습니다.");
            }
        }

        if (b < a) {
            c = (a + b) - 300;
            if (!(c == (a + b) - 300)) {
                System.out.println("c 가 잘못되었습니다.");
            }


            if (!(e == (a + b + c))) {
                System.out.println("d가 잘못되었습니다.");
            }

            if (e == (a + b + c) % 3) {

            } else System.out.println("e가 잘못되었습니다.");

            if (f == (a + b + c + d + e) + 5000) {

            } else System.out.println("f가 잘못되었습니다.");

            if (g == f * 2) {

            } else System.out.println("g가 잘못되었습니다.");

            if (!(a >= 5000 && a < 10001) && !(b > 3999) && !(a < b) &&
                    !(b < a) && !(e == (a + b + c)) && !(e == (a + b + c) % 3) &&
                    !(f == (a + b + c + d + e) + 5000) && !(g == f * 2)) {
                System.out.println("모두 잘못되었습니다.");
            }


        }
    }
}
