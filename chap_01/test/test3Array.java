package chap_01.test;

import java.util.*;

public class test3Array {
    public static void main(String[] args) {

        // Array

        String[] baverage = new String[3];
        baverage[0] = "딸기쥬스";
        baverage[1] = "딸바쥬스";
        baverage[2] = "파인애플쥬스";


        String appetite[] = new String[]{"호박수프", "산양삼", "전복죽", "마늘빵"};
        String mainDish[] = {
                "언양불고기", "묵국수", "갈비찜", "보리굴비", "대하구이"
        };
        String[] dessert = new String[]{"앙금케익", "파인애플", "매실차"};

        int[] piecesOfCake = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        Double[] decimal = new Double[]{10.5, 25.5, 60.5, 85.5};
        String[] seoul = new String[]{"상암", "가양", "강남", "미아", "홍대"};

        System.out.println(seoul[1]);
        System.out.println(decimal[1]);


        // 퀴즈 배열을 활용해 쇼핑몰에서 구매 가능한 신발 사이즈를 출력하는 프로그램을 작성해라
        // 신발 사이즈는 250 ~ 295 까지 5 단위로 증가 / 신발사이즈 수는 총 10가지

//        int[] shoe = new int[10];
//        int size = 250;
//        for (int i = 0; i < 10; i++) {
//            shoe[i]= size;
//            System.out.println("구매 가능한 사이즈 : " + size);
//            size += 5;
//        }

// StringBuilder.append  유용할것같음
// object.toString

        ArrayList<Integer> li = new ArrayList<>();
        li.add(10);         // ArrayList 만들어서
        li.add(2);
        Collections.sort(li);   // 정렬하기
        System.out.println(li); // [2,10] 출력

        HashSet<Integer> ha = new HashSet<>();
        ha.add(33);     // HashSet 만들어서
        ha.add(13);     // 정렬하기위해 ArrayList로 형변환
        ArrayList<Integer> nha = new ArrayList<>(ha);
        Collections.sort(nha);  // 정렬
        System.out.println(nha); // [13,33] 출력

        test3Array array = new test3Array();


//        array.randomNum(6);

        ArrayList<Integer[]> ar = new ArrayList<Integer[]>();
        ar.add(new Integer[]{1,2,3});
        ar.add(new Integer[]{4,5,6});
        Object[] arr = ar.toArray(); //for문없이 deepToString으로 배열값
        // 출력하기위해 Object 배열로 변환
//        System.out.println(Arrays.deepToString(arr));


           array.randomNum();

    }

    // 겹치는 숫자없는 랜덤숫자 6개 만들기

   final HashSet<Integer> rand = new HashSet<>();
ArrayList<ArrayList<Integer>> lotto = new ArrayList<ArrayList<Integer>>();
Integer[][] arr1 = lotto.toArray(new Integer[3][6]);
    Random random = new Random();
    Integer[] arr = rand.toArray(new Integer[6]);
//    List 클래스의 인스턴스 메서드인 toArray()는 Object 타입의 배열을 반환한다.
//    타입 변환이 자동으로 이루어지지 않아서 리턴 배열을 활용하기 번거롭다.
//        toArray(T[] a)는 T 타입 배열을 반환한다.
//        T는 값 타입이 될 수 없기 때문에 int, double, float와 같은 타입의 배열은 이 방법으로는 얻을 수 없다.
//        파라미터 a의 길이는 0으로 지정하면 알아서 list의 길이에 맞게 조정되어 arr에 저장된다.

    int r;

    public ArrayList<ArrayList<Integer>> randomNum() {

    for (int i = 0; i < arr.length; i++) {  //arr배열 길이만큼 반복
        r = (random.nextInt(45) + 1);  // 랜덤숫자
        if (rand.contains(r)) { // rand에 r이 포함돼있으면
            i--;        // i를 빼서 다시반복하게만듦
        }
        rand.add(r);    // rand에 r추가

    }
        ArrayList<Integer> nr = new ArrayList<Integer>(rand);
        Collections.sort(nr); // 정렬하기위해 Hash를 ArrayList로변경
        System.out.println(nr); //[1, 12, 23, 24, 42, 43]

        lotto.add(nr);   // lotto이중배열에 nr배열추가
        System.out.println(lotto);
        return lotto;  // [[1, 12, 23, 24, 42, 43]]
    }

// 6자리 랜덤숫자를 뽑는 과정을 3번 반복하고싶은데 실패..
// [1, 12, 23, 24, 42, 43] 이렇게 3번반복됨 다른숫자로 반복하고싶다





//    public ArrayList<Integer> randomNum() {   // 이중배열없는코드
//
//        for (int i = 0; i < arr.length; i++) {
//            r = (random.nextInt(45) + 1);
//            if (rand.contains(r)) {
//                i--;
//            }
//            rand.add(r);
//        }
//
//        ArrayList<Integer> nr = new ArrayList<>(rand);
//        Collections.sort(nr); // 정렬하기위해 Hash를 ArrayList로변경
//        System.out.println(nr);
//        return nr;
//    }





//
//    public ArrayList<Integer> randomNum(int num) {
//
//        for (int i = 0; i < num; i++) {
//
//            r = (random.nextInt(45) + 1);
//            if (rand.contains(r)) {
//                i--;
//            }
//
//            rand.add(r);
//        }
//        ArrayList<Integer> nr = new ArrayList<>(rand);
//        Collections.sort(nr);
//        System.out.println(nr);
//        return nr;
//    }










}








