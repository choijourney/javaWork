package chap_01.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test6 {
    public static void main(String[] args) {
        // java.util 패키지
        // 에는 프로그램을 개발하는데 유용한 유틸리티 클래스가 다수 포함돼있다.
        // java.lang 패키지는 import문을 사용하지않아도 사용할수있고 가장많이사용됨
        // 그다음 많이사용되는 패키지가 java.util패키지이다 import로 패키지를 불러와야
        // 클래스 이름으로 사용할수있다.

        // java.util.Arrays 클래스
        // Arrays 클래스에는 배열을 위한 다양한 메서드가 포함돼있다.
        // Arrays 클래스의 모든 메서드는 클래스 메서드(static)여서 객체를 생성하지않고 바로 사용할수있다


        // Arrays.copyOf    배열을 원하는 길이만큼 복사해서 변수에 저장할수있음
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = Arrays.copyOf(arr1, 2);  // 2번째요소까지출력
        System.out.println(Arrays.toString(arr2)); // [1,2]
        System.out.println("----");

        int[] arr3 = Arrays.copyOf(arr1, 6); // 빈자리에 0 채움
        System.out.println(Arrays.toString(arr3)); //[1, 2, 3, 4, 0, 0]

        // Arrays.copyOfRange  (배열이름, 선택한요소의 다음부터 , 선택한요소까지 )
        int[] arr4 = Arrays.copyOfRange(arr1, 2, 4);
        System.out.println(Arrays.toString(arr4));  // [3,4]


        // Arrays.fill  배열은 초기화가 안되는데 fill을 쓰면 가능하다
        int[] arr5 = new int[2];
        arr5[0] = 4;
        arr5[1] = 4;
        Arrays.fill(arr5, 5);
        System.out.println(Arrays.toString(arr5)); // [4,4]

        int[] arr6 = new int[5];
        Arrays.fill(arr6, 6);
        System.out.println(Arrays.toString(arr6)); //[6, 6, 6, 6, 6]

        // Arrays. sort 배열을 오름차순 정렬해줌
        int[] arr7 = {5, 4, 3, 2, 1};
        Arrays.sort(arr7);
        System.out.println(Arrays.toString(arr7)); //[1, 2, 3, 4, 5]


        // Arrays.binarySearch  일치하는 요소의 인덱스 알려줌
        System.out.println(Arrays.binarySearch(arr7, 1)); // 0 인덱스알려줌
        System.out.println("----");


        // 사용자 지정 contains 메서드만듦
        boolean boo = contains(arr7, 4);
        System.out.println(boo); // true
        System.out.println("----");


        //  Arrays.asList(n).contains(5); 오류
        Integer[] n = {5, 6, 7, 8};
        // int [] n = {5,6,7,8};  기본형을 List로 변환할때 오류남 그래서 답도 false로 오류남
        System.out.println(Arrays.toString(n)); // [5, 6, 7, 8]
        boolean contains = Arrays.asList(n).contains(5);
        System.out.println(contains);   // true

        ArrayList<Integer> as = new ArrayList<>(Arrays.asList(1, 2));
        System.out.println(as.contains(1)); // true
        // 만약 int배열이면 기본자료형인데 요소의 타입이 자동으로 박싱되지않아서
        // 리스트로 변환할수없다.

        // int[]배열을 List로 변환하려면 여러방법이 있다
        int[] ar1 = {1, 3};
        List<Integer> integerList = Arrays.stream(ar1).boxed().collect(Collectors.toList());

        // 두번째방법.  for문으로 반복해서 각요소를 List에 추가함
        int[] ar2 = {4, 5};
        List<Integer> integerList1 = new ArrayList<>();
        for (int ars : ar2) {
            integerList1.add(ars);
        }
        System.out.println(integerList1);  // [4,5]

        // 세번째. Apache Commons Lang 라이브러리사용 다운받아야함 
        int[] ar4={5,6};
        


        // String은 객체배열이라 오류안남
        String[] st = {"f", "g"};
        boolean contains1 = Arrays.asList(st).contains("f");
        System.out.println(contains1); // true

//        boolean boo1 = contains(n, 5);
//        System.out.println(boo1);   // 얘는 true 맞게뜸


        // ArraysUtils 클래스? Apache 다운받아야함
        // String [] st1 = {"a","b"};
        // st1[2]= {"c"};  인덱스2자리에 추가하려했는데 안됨
//        String [] st2 = ArrayUtils.add(st1,"c");


    }

    // 사용자지정 contains 포함된값인지 확인하는 메서드
    public static boolean contains(int[] arr, int key) {
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
            }
        }
        return found;
    }


}
