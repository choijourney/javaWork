package chap_01;

public class _04_array {
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

        String[][] seats = new String[][] {   // new String[][] 생략가능
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
        String[][][] marray = new String[][][] {};


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


    }
}
