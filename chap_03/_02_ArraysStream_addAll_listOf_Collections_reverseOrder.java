package chap_03;

import java.util.*;
import java.util.stream.IntStream;

public class _02_ArraysStream_addAll_listOf_Collections_reverseOrder {
    public static void main(String[] args) {
        // Stream 연습

        int[] number = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(number)); // [1, 2, 3, 4, 5]

        IntStream intstream = Arrays.stream(number);
        intstream.filter(x -> x < 3).forEach(System.out::println); // 1 2 출력


        // .asList로 여러요소 한번에 생성 / .addAll 로 여러요소 추가
        List<String> langsList = new ArrayList<>();
        langsList.add("Js");
        System.out.println(langsList); //[js]
        // add한 상태에서 asList를 쓰면 앞에추가했던 js를 지우고 java만출력
        langsList = Arrays.asList("java");
        System.out.println(langsList); //[java]

        List<String> langsList1 = new ArrayList<>(Arrays.asList("python", "dart"));
        System.out.println(langsList1.size());  // 2
        langsList1.addAll(langsList);   // java추가
        System.out.println(langsList1.size()); // 3

//       langsList.add("flutter");    // 이렇게 추가하면 오류
//        System.out.println(langsList);
        List<String> langsList2 = new ArrayList<>(Arrays.asList("go", "c"));
        langsList2.addAll(langsList1);  // ↑ 이렇게 추가해야함
        System.out.println(langsList2.size()); // 5


        System.out.println("-----");

        // 배열을 List로 변환
        String[] arr = {"a", "b", "c", "d"};
        System.out.println(Arrays.toString(arr));
        List<String> newArr = Arrays.asList(arr);
        System.out.println(newArr);


        List<Integer> list1 = new ArrayList<>(); //숫자형 List를 만듦
        list1 = Arrays.asList(1, 3, 5);
        System.out.println(list1); // [1,3,5]
        int[] arr1 = list1.stream()
                .mapToInt(Integer::intValue)
                .toArray(); // List형을 스트림을 쓰고 값을 int로 바꿔서
        // int 배열로 바꾼다      / 이부분 아직잘모르겠음

        System.out.println(arr1[1]); //3
        //boxing : primitive type(기본형) -> wrapper class 변환 ( int to Integer )
        //unboxing : wrapper class -> primitive type 변환 ( Integer to int )

        System.out.println("-----");

        // int 와 Integer 차이
        //int q = null;  오류남
        Integer w = null; // null값가능
        System.out.println(w);

        System.out.println("-----");
        HashSet<Integer> t = new HashSet<>(Arrays.asList(11, 3, 5, 6));
        t.add(22);
        System.out.println(t); // [11, 3, 5, 6, 22]

        HashSet<Integer> t2 = new HashSet<>();
        t2.add(77);
        t2.addAll(t);
        System.out.println(t2); // [11, 3, 5, 6, 22 ,77]

        HashSet<Integer> t3 = new HashSet<>(Arrays.asList(33, 44));
        t3.addAll(t2);
        System.out.println(t3); //[11, 3, 5, 6, 22 ,77, 33, 44]

        // List도 컬렉션이기때문에 addAll을 이용해 HashSet에 
        // 요소를 추가할수있고 List에도 HashSet을 추가할수있다
        List<String> al1 = new ArrayList<>(Arrays.asList("a", "b"));

        HashSet<String> al2 = new HashSet<>(Arrays.asList(" c, d"));
        al2.addAll(al1);
        System.out.println(al2);
        // "a","b"  와  "a,b" 차이가 있는지 궁금
        for (String al3 : al2) {
            System.out.println(al3);
        }
        // 다름. forEach로 값을받아보면 a b 는 따로 출력되고 c,d 는 c,d로 출력

        List<String> al3 = new ArrayList<>(Arrays.asList("e", "f"));
        al3.addAll(al2);
        System.out.println(al3);

        HashSet<Integer> tr = new HashSet<>(Arrays.asList(3,2,4));
        System.out.println("HashSet : "+ tr); //[2,3,4]
        TreeSet<Integer> tr1 = new TreeSet<>();
        tr1.addAll(tr);
        System.out.println("TreeSet : "+ tr1); // [2,3,4]


        List<String > list = List.of("g","h","i");  //자바8에서 지원안됨
        System.out.println(list); // [g, h, i]
        // Array.asList() 와 비슷한방식. 기본적으로 List객체로 리턴.
        // ArrayList로 리턴받으려면 ↓처럼 인수에 넣어 변환하면됨
        ArrayList<String> list2 = new ArrayList<>(list);
        System.out.println(list2);  // [g, h, i]

        // 배열 정렬  Arrays.sort 오름차순
        int[] numb= {100,1};
        Arrays.sort(numb);
        System.out.println(Arrays.toString(numb)); // [1,100]

        // 내림차순 정렬 Collections.reverseOrder가 필요한데
        //Integer가 필요해서 int를 형변환 시킨다.
        Integer[] nums = Arrays.stream(numb).boxed().toArray(Integer[]::new);
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println(Arrays.toString(nums)); // [100,1]

        // 다시 int형으로 바꿈
        int[] nums1 = Arrays.stream(nums).mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(nums1)); //[100,1]
        System.out.println("----");


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
    }
}
