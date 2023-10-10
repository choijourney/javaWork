package chap_01;

import java.util.Arrays;
import java.util.Collections;

public class _04_array_forEach_askiCode {
    public static void main(String[] args) {

        // array 배열 선언 첫 번째 방법
        String[] coffees = new String[3];
        coffees[0] = "아메리카노";
        coffees[1] = "카페모카";
        coffees[2] = "라떼";
        // 두번째 방법
        String[] coffees1 = new String[]{"아메리카노", "카페모카", "라떼"};
        // 세번째 방법
        String[] coffees2 = {"아메리카노", "카페모카", "라떼"};

        // 커피 주문
        System.out.println(coffees1[0] + "하나"); // 아메라카노 하나
        System.out.println(coffees2[1] + "하나"); // 카페모카 하나
        coffees2[2] = "에스프레소"; //값 변경
        System.out.println(coffees2[2] + "하나"); // 에스프레소 하나

        // 다른 자료형 배열
        int[] p = new int[2];
        p[0] = 1;
        p[1] = 2;
        double[] dd = new double[]{1.1, 2.2, 3.3};
        boolean[] bb = {true, false, true};

        // 배열의 순회
        String[] coffee = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        for (int i = 0; i < 4; i++) {
            System.out.println(coffee[i] + " 하나");
        }

        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffee.length; i++) {
            System.out.println(coffee[i] + " 두잔");
        } //인덱스를 이용해 범위를 조절해 쓸 수 있음


        // 배열 출력 .toString()
        int[] number = {1,2,3,4,5};
        System.out.println(Arrays.toString(number)); // [1, 2, 3, 4, 5]

        //  Arrays.deepToString() 배열 출력 이중배열출력가능
        String[] arr = {"a", "b", "c", "d"};
        System.out.println(Arrays.deepToString(arr)); //[a, b, c, d]


        // 배열 정렬  Arrays.sort 오름차순
        int[] numb= {100,1};
        Arrays.sort(numb);
        System.out.println(Arrays.toString(numb)); // [1,100]

        // 내림차순 정렬 Collections.reverserder 를 써야하는데
        // Integer가 필요해서 int를 Integer로 변환한다
        Integer[] nums = Arrays.stream(numb).boxed().toArray(Integer[]::new);
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println(Arrays.toString(nums)); // [100,1]

        // 다시 int형으로 바꿈
        int[] nums1 = Arrays.stream(nums).mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(nums1)); //[100,1]

        // for문으로 다시 Integer로 바꿈
        Integer[] nums2 = new Integer[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            nums2[i] = nums1[i];
            System.out.println(nums2[i]); // 100 1
        }
        System.out.println(Arrays.toString(nums2)); // [100,1]


        // int배열 부분정렬
        int [] n1 = new int[] {9,8,7,6};
        Arrays.sort(n1,0,2);
        System.out.println(Arrays.toString(n1)); // [8, 9, 7, 6]
        // 인덱스 0~ 2 전까지 배열정렬   즉 0,1 배열정렬

        // String 배열 부분정렬
        String [] s1 = new String[]{"s","d","a"};
        Arrays.sort(s1,0,2); // 인덱스 0,1 배열정렬
        System.out.println(Arrays.toString(s1)); // [d,s,a]



        // for each 반복문 enhanced for
        for (String coff : coffee) {
            System.out.println(coff + " 세잔");
        } // 배열의 모든값을 순회함

        // 다차원 배열 (2차원 배열)

        // 소규모 영화관 좌석
        // A1 - A5   B1- B5  C1 - C5

        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        String[][] seats = new String[][]{   // new String[][] 생략가능
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        // B2에 접근하려면?
        System.out.println(seats[1][1]);

        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };  // 길이가 다른 배열을 같은 배열에 넣을수있다

        // 3차원 배열 만들기
        String[][][] marray = new String[][][]{};


        // 다차원 배열 순회
        String[][] seats1 = new String[][]{
                {"A1", "A2", "A3", "A4", "A5"},  //인덱스[0]
                {"B1", "B2", "B3", "B4", "B5"},  //     [1]
                {"C1", "C2", "C3", "C4", "C5"}   //     [2]
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(seats1[i][j] + " "); //seats1인덱스ij
            }
            System.out.println(); //줄바꿈
        }
        // 길이 다른 배열 순회
        String[][] seats3 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }

        // 세로 크기 10 * 가로 크기 15 의 영화관 좌석 배열 만들기
        String[][] seats5 = new String[10][15];
        String[] eng = {"A","B","C","D","E","F","G","H","I","J"};
        for (int i = 0; i < seats5.length; i++) {   //10번 반복 세로
            for (int j = 0; j < seats5[i].length; j++) { //15번 반복 가로
                seats5[i][j] = eng[i] + (j+1);  //A+1 A+2 A+3 A4 A5 A6 A7 A8 A9 A10 .. A15
            }
        }

        // 표 구매
        seats5[3][7] = "__";  // D8,D9
        seats5[3][8] = "__";

        // 만든 좌석 출력하기
        for (int i = 0; i < seats5.length; i++) {
            for (int j = 0; j < seats5[i].length; j++) {
                System.out.print(seats5[i][j] + " ");
            }
            System.out.println();
        }


        // 아스키 코드 (ANSI) 에서 만든 미국 표준 코드
        char c = 'A'; //아스키코드는 하나의 문자기 때문에 char를 씀
        System.out.println(c);      // A 출력
        System.out.println((int)c); // 65 출력  A를 아스키 10진법 코드로 바꾸면 65

        c = 'B';
        System.out.println(c);      // B 출력
        System.out.println((int)c); // 66 출력

        c++;
        System.out.println(c);      // C 출력
        System.out.println((int)c); // 67 출력

        // char 를 써서 c++ 연산을 해서 다음 문자인 C 를 얻을 수 있다
        // c = 'a'; 소문자로 바꾸면 a 97 출력
        // c= '0'; 숫자로 바꾸면 0 48 출력

        // 알파벳 대문자 A는 65 부터 시작, 소문자 a는 97 부터 시작, 숫자 0은 48 부터 시작


        // 아스키코드를 이용해 더 쉽게 영화관 좌석 배열 만들기
        String[][] seats6 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats6.length; i++) {   //10번 반복 세로
            for (int j = 0; j < seats6[i].length; j++) { //15번 반복 가로
                seats6[i][j] = String.valueOf(ch) + (j+1);  // ch를 문자열로 바꿔 seats6와 형을맞춘다
            }  // A1 A2 A3 .. A15 까지 반복후
            ch++; // B 로 바꾼후 다시반복
        }
        // 좌석 출력하기
        for (int i = 0; i < seats6.length; i++) {
            for (int j = 0; j < seats6[i].length; j++) {
                System.out.print(seats6[i][j] + " ");
            }
            System.out.println();
        }


        // 퀴즈 배열을 활용해 쇼핑몰에서 구매 가능한 신발 사이즈를 출력하는 프로그램을 작성해라
        // 신발 사이즈는 250 ~ 295 까지 5 단위로 증가 / 신발사이즈 수는 총 10가지
        int[] size = new int[10];  // [10] 배열안에 요소를 몇개 만들건지 씀
        int shoe = 250;

        for (int i = 0; i <10; i++) {
            size[i]= shoe;
            System.out.println("사이즈 "+ shoe + " (재고 있음)");
        shoe+=5;
        }

    }
}
