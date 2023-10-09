package chap_01.test;

import java.util.Random;
import java.util.Scanner;

public class homeWork {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자 입력");
        int a = sc.nextInt();
        System.out.println("두번째 숫자 입력");
        int b = sc.nextInt();
        System.out.print(a + " + " + b + " = ");
        int answer = sc.nextInt();
        int wrongCount = 0;
        int correctCount = 0;

        if (answer == a + b) {
            System.out.println("정답입니다");

        }
        if (answer != a + b) {
            ++wrongCount;
            for (int i = 1; i < 10; i++) {
                System.out.print(a + " + " + b + " = ");
                answer = sc.nextInt();
                if (answer != a + b) {
                    ++wrongCount;
                }

                if (answer == a + b) {
                    ++correctCount;
                    if (correctCount > wrongCount) {
                        System.out.println("정답입니다");
                        break;
                    }

                }

                if (i == 9 && wrongCount > correctCount) {
                    System.out.println("정답 횟수가 오답 횟수보다 많아야합니다. 10번 더 기회를 드리겠습니다.");
                    wrongCount = 0;
                    correctCount = 0;

                    System.out.print(a + " + " + b + " = ");
                    answer = sc.nextInt();

                    if (answer == a + b) {
                        System.out.println("정답입니다");
                        ++correctCount;
                    }

                    if (answer != a + b) {
                        ++wrongCount;
                        for (int j = 1; j < 10; j++) {
                            System.out.print(a + " + " + b + " = ");
                            answer = sc.nextInt();
                            if (answer != a + b) {
                                ++wrongCount;
                            }

                            if (answer == a + b) {
                                ++correctCount;
                                if (correctCount > wrongCount) {
                                    System.out.println("정답입니다");
                                    break;
                                }

                            }

                            if (j == 9 && wrongCount > correctCount) {
                                System.out.println("정답 횟수가 오답 횟수보다 많아야합니다. 10번 더 기회를 드리겠습니다.");

                                wrongCount = 0;
                                correctCount = 0;

                                System.out.print(a + " + " + b + " = ");
                                answer = sc.nextInt();

                                if (answer == a + b) {
                                    System.out.println("정답입니다");
                                    ++correctCount;
                                }

                                if (answer != a + b) {
                                    ++wrongCount;
                                    for (int k = 1; k < 10; k++) {
                                        System.out.print(a + " + " + b + " = ");
                                        answer = sc.nextInt();
                                        if (answer != a + b) {
                                            ++wrongCount;
                                        }

                                        if (answer == a + b) {
                                            ++correctCount;
                                            if (correctCount > wrongCount) {
                                                System.out.println("정답입니다");
                                                break;
                                            }

                                        }

                                        if (k == 9 && wrongCount > correctCount) {
                                            System.out.println("정답 횟수가 오답 횟수보다 많아야합니다. 정답은 " + a + b + " 입니다.");

                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }

        System.out.println();
        System.out.println("1. " + a);
        System.out.println("2. " + b);
        System.out.print("더 큰 숫자를 맞춰주세요. => ");
        int answer2 = sc.nextInt();
        System.out.println("----");
        System.out.println();

        if (answer2 == 1) {
            answer2 = a;
        }
        if (answer2 == 2) {
            answer2 = b;
        }

        // 보기에 없는 숫자를 입력했을때를 방지
        while (answer2 != 1 && answer2 != 2 && answer2 != a && answer2 != b) {

            System.out.println("1 , 2 혹은 " + a + " " + b + " 중에 입력하세요.");
            System.out.println();
            System.out.println("1. " + a);
            System.out.println("2. " + b);
            System.out.print("더 큰 숫자를 맞춰주세요. => ");
            answer2 = sc.nextInt();
            System.out.println("----");
            System.out.println();
            if (answer2 == 1 || answer2 == 2 || answer2 == a || answer2 == b) {

                if (answer2 == 1) {
                    answer2 = a;
                }
                if (answer2 == 2) {
                    answer2 = b;
                }
                break;
            }
        }

        if ((a < b && answer2 == b) || (a > b && answer2 == a)) {
            System.out.println("정답입니다!!!");
        }

        int count = 1;
        if ((a < b && answer2 == a) || (a > b && answer2 == b)) { // 정답이 틀렸을때
            while (true) {
                Random random = new Random();



                a = random.nextInt(50); // 중복숫자안나오게
                b = random.nextInt(50);
                while (a == b) {
                    a = random.nextInt(50);
                }

                System.out.println("1. " + a);
                System.out.println("2. " + b);
                System.out.print("더 큰 숫자를 맞춰주세요. => ");
                answer2 = sc.nextInt();

                System.out.println("----");
                System.out.println();

                if (answer2 == 1) {
                    answer2 = a;
                }
                if (answer2 == 2) {
                    answer2 = b;
                }
                ++count;

                if ((a < b && answer2 == b) || (a > b && answer2 == a)) {
                    System.out.println("정답입니다!!!");
                    break;
                }
                if (count % 3 == 0) {
                    System.out.println("오답입니다. 정답은 " + ((a < b) ? b : a));
                    System.out.println();

                }
            }
        }


        count = 1;
        while (true) {
            if ((a < b && answer2 == a) || (a > b && answer2 == b)) {

                Random random = new Random();

                a = random.nextInt(50); // 중복숫자안나오게
                b = random.nextInt(50);
                while (a == b) {
                    a = random.nextInt(50);
                }

                System.out.println("1. " + a);
                System.out.println("2. " + b);
                System.out.print("더 큰 숫자를 맞춰주세요. => ");
                answer2 = sc.nextInt();

                System.out.println("----");
                System.out.println();

                if (answer2 == 1) {
                    answer2 = a;
                }
                if (answer2 == 2) {
                    answer2 = b;
                }
                ++count;

                if ((a < b && answer2 == b) || (a > b && answer2 == a)) {
                    System.out.println("정답입니다!!!");
                    break;
                }
                if (count % 3 == 0) {
                    System.out.println("오답입니다. 정답은 " + ((a < b) ? b : a));
                    System.out.println();

                }

            }
        }


    }
}