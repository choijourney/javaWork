package chap_01.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.*;

public class data2 {

    public static void main(String[] args) {
//        String game1 = null;
//        String game2 = null;
//        String game3 = null;
//        String game4 = null;
//        String game1, String game2, String game3, String game4

        name();

    }

    static void name() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 쓰세요");
        String name1 = sc.next();
        System.out.println("이름을 쓰세요");
        String name2 = sc.next();
        System.out.println("이름을 쓰세요");
        String name3 = sc.next();
        System.out.println("이름을 쓰세요");
        String name4 = sc.next();
        game(name1, name2, name3, name4);
    }

//    static String wordFilter(String game1) {
//        Scanner sc = new Scanner(System.in);
//        List arr = new ArrayList<>(Arrays.asList("가위", "바위", "보"));
//
//        System.out.println("가위, 바위, 보 중 입력해주세요.");
//        String save = sc.next();
//
//        if (!arr.contains(save)) {
//            for (int i = 0; i < 100; i++) {
//                System.out.println("가위, 바위, 보 중 입력해주세요.");
//            }
//        } else {
//            game1 = save;
//        }
//        return game1;
//    }

    static void game(
            String name1, String name2, String name3, String name4) {
        Scanner sc = new Scanner(System.in);

        List arr = new ArrayList<>(Arrays.asList("가위", "바위", "보"));
        System.out.println(name1 + "님 가위 바위 보를 합니다 .!");

        String game1 = sc.next();

        if (!arr.contains(game1)) {
            while (true) {
                System.out.println("가위, 바위, 보 중 입력해주세요.");
                String save = sc.next();
                if (arr.contains(save)) {
                    game1 = save;
                    break;
                }
            }
        }


//        if (!arr.contains(game1)) {
//            for (int i = 0; i < 100; i++) {
//                System.out.println("가위, 바위, 보 중 입력해주세요.");
//                String save = sc.next();
//                if (arr.contains(save)) {
//                    game1 = save;
//                    break;
//                }
//            }
//        }


        System.out.println(name2 + "님 가위 바위 보를 합니다 .!");
        String game2 = sc.next();

        if (!arr.contains(game2)) {
            for (int i = 0; i < 100; i++) {
                System.out.println("가위, 바위, 보 중 입력해주세요.");
                String save = sc.next();
                if (arr.contains(save)) {
                    game2 = save;
                    break;
                }
            }
        }
        //        String game2 = sc.next();
        System.out.println(name3 + "님 가위 바위 보를 합니다 .!");
        String game3 = sc.next();

        if (!arr.contains(game3)) {
            for (int i = 0; i < 100; i++) {
                System.out.println("가위, 바위, 보 중 입력해주세요.");
                String save = sc.next();
                if (arr.contains(save)) {
                    game3 = save;
                    break;
                }
            }
        }
        System.out.println(name4 + "님 가위 바위 보를 합니다 .!");
        String game4 = sc.next();
        if (!arr.contains(game3)) {
            for (int i = 0; i < 100; i++) {
                System.out.println("가위, 바위, 보 중 입력해주세요.");
                String save = sc.next();
                if (arr.contains(save)) {
                    game3 = save;
                    break;
                }
            }
        }
        finalResult(name1, name2, name3, name4, game1, game2, game3, game4);
    }

    static void game2(
            String name2, String name3, String name4) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2등은 누구일까요? 가위바위보를 다시합니다 '-'");
        System.out.println(name2 + "님 가위 바위 보를 합니다 .!");
        String game2 = sc.next();
        System.out.println(name3 + "님 가위 바위 보를 합니다 .!");
        String game3 = sc.next();
        System.out.println(name4 + "님 가위 바위 보를 합니다 .!");
        String game4 = sc.next();
        finalResult2(name2, name3, name4, game2, game3, game4);
    }

    static void game3(
            String name3, String name4) {
        Scanner sc = new Scanner(System.in);
        System.out.println("3등은 누구일까요? 가위바위보를 다시합니다 '-'");
        System.out.println(name3 + "님 가위 바위 보를 합니다 .!");
        String game3 = sc.next();
        System.out.println(name4 + "님 가위 바위 보를 합니다 .!");
        String game4 = sc.next();
        finalResult3(name3, name4, game3, game4);
    }

    static boolean result(
            String name1, String name2, String name3, String name4,
            String game1, String game2, String game3, String game4) {
        if (game1.contains(name1) && game2.contains(name2) && game3.contains(name3)
                && game4.contains(name4)) {
            return true;
        }
        return false;
    }

    static boolean result(  // 오버라이딩
                            String name2, String name3, String name4,
                            String game2, String game3, String game4) {


        if (game2.contains(name2) && game3.contains(name3)
                && game4.contains(name4)) {
            return true;
        }
        return false;
    }

    static boolean result(  // 오버라이딩
                            String name3, String name4,
                            String game3, String game4) {
        if (game3.contains(name3)
                && game4.contains(name4)) {
            return true;
        }
        return false;
    }

    static void finalResult2(String name2, String name3, String name4
            , String game2, String game3, String game4) {

        if (
                result("가위", "보", "보", game2, game3, game4) ||
                        result("보", "바위", "바위", game2, game3, game4) ||
                        result("바위", "가위", "가위", game2, game3, game4)) {
            game2 = name2;
            System.out.println(game2 + "님 2등입니다~!");
            game3(name3, name4);

        }


        if (
                result("보", "가위", "보", game2, game3, game4) ||
                        result("바위", "보", "바위", game2, game3, game4) ||
                        result("가위", "바위", "가위", game2, game3, game4)) {
            game3 = name3;
            System.out.println(game3 + "님 2등입니다~!");
            game3(name2, name4);
        }


        if (
                result("보", "보", "가위", game2, game3, game4) ||
                        result("바위", "바위", "보", game2, game3, game4) ||
                        result("가위", "가위", "바위", game2, game3, game4)) {
            game4 = name4;
            System.out.println(game4 + "님 2등입니다~!");
            game3(name2, name3);
        } else
//        (result("보", "보", "보", game2, game3, game4) ||
//                result("바위", "바위", "바위", game2, game3, game4) ||
//                result("가위", "가위", "가위", game2, game3, game4))

        {
            System.out.println("무승부 입니다 -");
            System.out.println("가위 바위 보를 다시 합니다! 2등 가르기");
            game2(name2, name3, name4);
        }

    }

    static void finalResult3(String name3, String name4
            , String game3, String game4) {

        if (
                result("가위", "보", game3, game4) ||
                        result("보", "바위", game3, game4) ||
                        result("바위", "가위", game3, game4)) {
            game3 = name3;
            System.out.println(game3 + "님 3등입니다~!");
            return;

        }


        if (
                result("보", "가위", game3, game4) ||
                        result("바위", "보", game3, game4) ||
                        result("가위", "바위", game3, game4)) {
            game4 = name4;
            System.out.println(game4 + "님 3등입니다~!");
            return;

        }
        if (result("보", "보", game3, game4) ||
                result("바위", "바위", game3, game4) ||
                result("가위", "가위", game3, game4)
        ) {
            System.out.println("무승부 입니다 -");
            System.out.println("가위 바위 보를 다시 합니다! 3등가르기");
            game3(name3, name4);
        }
    }

    static void finalResult(String name1, String name2, String name3, String name4
            , String game1, String game2, String game3, String game4) {

        if (
                result("가위", "보", "보", "보", game1, game2, game3, game4) ||
                        result("보", "바위", "바위", "바위", game1, game2, game3, game4) ||
                        result("바위", "가위", "가위", "가위", game1, game2, game3, game4)) {
            game1 = name1;
            System.out.println(game1 + "님 1등입니다~!");
            game2(name2, name3, name4);

        }

        if (
                result("보", "가위", "보", "보", game1, game2, game3, game4) ||
                        result("바위", "보", "바위", "바위", game1, game2, game3, game4) ||
                        result("가위", "바위", "가위", "가위", game1, game2, game3, game4)) {
            game2 = name2;
            System.out.println(game2 + "님 1등입니다~!");
            game2(name1, name3, name4);
        }


        if (
                result("보", "보", "가위", "보", game1, game2, game3, game4) ||
                        result("바위", "바위", "보", "바위", game1, game2, game3, game4) ||
                        result("가위", "가위", "바위", "가위", game1, game2, game3, game4)) {
            game3 = name3;
            System.out.println(game3 + "님 1등입니다~!");
            game2(name1, name2, name4);
        }


        if (
                result("보", "보", "보", "가위", game1, game2, game3, game4) ||
                        result("바위", "바위", "바위", "보", game1, game2, game3, game4) ||
                        result("가위", "가위", "가위", "바위", game1, game2, game3, game4)) {
            game4 = name4;
            System.out.println(game4 + "님 1등입니다~!");
            game2(name1, name2, name3);
        } else
//        (result("보", "보", game3, game4) ||
//                result("바위", "바위", game3, game4) ||
//                result("가위", "가위", game3, game4))

        {
            System.out.println("무승부 입니다 -");
            System.out.println("가위 바위 보를 다시 합니다! 1등가르기");
            game(name1, name2, name3, name4);
        }
    }


}


// String name2,String name3,String name4,

