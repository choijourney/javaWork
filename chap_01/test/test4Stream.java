package chap_01.test;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class test4Stream {
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

        String[] arr = {"a", "b", "c", "d"};  // 배열을
        System.out.println(Arrays.toString(arr));
        List<String> newArr = Arrays.asList(arr); // List배열로 변환
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
        System.out.println(t);

        HashSet<Integer> t2 = new HashSet<>();
        t2.add(77);
        t2.addAll(t);
        System.out.println(t2);

        HashSet<Integer> t3 = new HashSet<>(Arrays.asList(33, 44));
        t3.addAll(t2);
        System.out.println(t3);

        // List도 컬렉션이기때문에 addAll을 이용해 HashSet에 
        // 요소를 추가할수있고 List에도 HashSet을 추가할수있다
        List<String> al1 = new ArrayList<>(Arrays.asList("a", "b"));

        HashSet<String> al2 = new HashSet<>(Arrays.asList(" c, d"));
        al2.addAll(al1);
        System.out.println(al2);
        // "a","b"  와  "a,b" 차이가 있는지 궁금

        List<String> al3 = new ArrayList<>(Arrays.asList("e", "f"));
        al3.addAll(al2);
        System.out.println(al3);

        HashSet<Integer> tr = new HashSet<>(Arrays.asList(3,2,4));
        System.out.println("HashSet : "+ tr); //[2,3,4]
        TreeSet<Integer> tr1 = new TreeSet<>();
        tr1.addAll(tr);
        System.out.println("TreeSet : "+ tr1); // [2,3,4]


       // List<String > list = List.of  //자바8에서 지원안됨


    }
}
