package chap_02;

import java.util.*;

public class _04_WrapperClass_intValue_toString_ArrayList {
    public static void main(String[] args) {
        // 래퍼 ( Wrapper ) 클래스
        // int double float char 같은 기본자료형을 객체형태로 만들어줌
        // 첫글자를 대문자로 바꾸면됨. char는 Character 로 바꿔줌
        Integer i = 123;  // int i = 123;
        Double d = 1.0;  // double d = 1.0;
        Character c = 'A';  // char c = 'A';

        System.out.println(i);  //123
        System.out.println(d);  //1.0
        System.out.println(c);  // A

        System.out.println("------");
        // 래퍼클래스는 클래스기때문에 사용할수있는 메서드들이있다.
        // . 찍으면 쓸수있는 메서드들이나온다
        System.out.println(i.intValue());
        System.out.println(d.intValue()); // 1 실수를 정수로 바꿔줌
        System.out.println(c.charValue());

        System.out.println("-------");
        String s = i.toString();  // 정수를 문자열로 바꿔줌
        System.out.println(s);

        Integer w = null;
        System.out.println(w); // null

        // int 와 Integer 차이
        //int q = null;  오류남


        // 컬렉션 프레임워크  (ArrayList,LinkedList , set, Map)
        // 배열에 개수를 정하지않고 계속추가변경,정렬등 여러기능 가능함

        //ArrayList 여러내용을 배열에 추가할수있음  // 중복추가 가능!!
        // 배열과 비슷하지만 자료형은 객체 타입을 저장하게 되어있다.
        ArrayList<String> list = new ArrayList<>();
        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        
        // List에서 ArrayList로 강제변환, ArrayList에서 List로 자동변환
        List<String> lists = new ArrayList<>();   // List에 자식객체대입 (ArrayList가 List로 자동변환)
        lists = Arrays.asList("C", "C+");  // List에 문자열추가
        ArrayList<String> lists1 = new ArrayList<>(lists); // ArryList로 강제변환
        List<ArrayList<String>> lists2 = Arrays.asList(lists1);  // 다시 리스트로변환
        // ArrayList에는 Arrays.asList를 쓸수없다
        // 그래서 List에 자식객체를 대입해서 asList로 문자열을 추가하고
        // List를 다시 ArrayList로 강제변환했다
        // 그리고 다시 List로 변환할때 List<ArrayList<String>> List타입이 이렇게변했다


        // .asList 로 여러요소 한번에 생성하기 / .addAll 로 추가하기
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


        // List.of 로 여러요소 추가하기
        List<String> list1 = List.of("g", "h", "i");  //자바8에서 지원안됨
        System.out.println(list); // [g, h, i]
        // Array.asList() 와 비슷한방식. 기본적으로 List객체로 리턴.
        // ArrayList로 리턴받으려면 ↓처럼 인수에 넣어 변환하면됨
        ArrayList<String> list2 = new ArrayList<>(list);
        System.out.println(list2);  // [g, h, i]


        // 중괄호 두개를 쓰면 {{ 변수를 쓰지않고 add만 써도됨
        ArrayList<String> als = new ArrayList<String>() {{
            add("apple");
            add("grape");
            add("banana");
        }};


        // 배열을 List배열로 변환
        String[] starr = {"a", "b", "c", "d"};
        List<String> newArr = Arrays.asList(starr);


        // 데이터 조회 ( 인덱스로 조회) .get을 써서 인덱스값을 넣어 조회할수있음
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println("----");

        //   list.size() 배열의길이를알려줌 length같은기능

        // 삭제 ( 박명수 이사 ) remove
        System.out.println("학생 수 (이사 전) : " + list.size());
        list.remove(3);
//        list.remove("박명수"); 요소이름이나 인덱스를 써서 삭제할수있다
        System.out.println("학생 수 (이사 후) : " + list.size());
        System.out.println(list);

        // 마지막 요소 삭제하기
        System.out.println("남은 학생 수 (이사 전) : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("남은 학생 수 (이사 후) : " + list.size());

        // 순회
        for (String l : list) {
            System.out.println(l);
        }

        // 변경  .set 첫인수에 변경할 인덱스, 두번째인수에 어떤요소이름으로 바꿀건지 적기
        System.out.println("수강권 양도 전 : " + list.get(0)); // 유재석
        list.set(0, "이수근");
        System.out.println("수강권 양도 전 : " + list.get(0)); // 이수근

        //  indexOf 인덱스를 알려줌
        System.out.println(list.indexOf("김종국")); // 2


        // contains  배열안에 포함이 돼있나 확인만 함  / true false 로 답해줌
        System.out.println(list.contains("김종국"));  // true

        if (list.contains("김종국")) {
            System.out.println("수강 신청 성공");
        } else System.out.println("수강 신청 실패");

        // 전체 삭제  .clear()
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        // .isEmpty()  비었는지 확인하는 메서드
        System.out.println(list.isEmpty());  // true


        //  .removeAll  a5에서 a6와 겹치는 요소를 모두지움
        ArrayList<String> a5 = new ArrayList<>(Arrays.asList("aa", "bb", "cc", "dd"));
        System.out.println(a5); // [aa, bb, cc, dd]
        ArrayList<String> a6 = new ArrayList<>(Arrays.asList("aa", "bb", "ee"));
        boolean result = a5.removeAll(a6); // a5에서 a6와 겹치는요소를 지움
        System.out.println(a5); // [cc, dd]
        System.out.println(result); // true

        ArrayList<String> a7 = new ArrayList<>(Arrays.asList("ff"));
        boolean result2 = a6.removeAll(a7);  // a6에서 a7과 겹치는 요소가 없어서 안지움
        System.out.println(result2); // false


        // 다음 학기에 새로 공부 시작
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 정렬
        Collections.sort(list);  // 배열을 가나다라순으로 정렬 /임포트 필요
        for (String l : list) {
            System.out.println(l);
        }
        System.out.println("----");


        // 중첩 배열 ArrayList
        ArrayList<Integer[]> ar = new ArrayList<Integer[]>();
        ar.add(new Integer[]{1, 2, 3});
        ar.add(new Integer[]{4, 5, 6});
        //System.out.println(ar);   ar만쓰면 오류남
        System.out.println(ar.get(0)[0]); // 1 출력
        Object[] arr = ar.toArray();  // Object 배열로 변환후 전체배열출력
        System.out.println(Arrays.deepToString(arr)); // [[1,2,3],[4,5,6]]
//        List 클래스의 인스턴스 메서드인 toArray()는 Object 타입의 배열을 반환한다.
//                타입 변환이 자동으로 이루어지지 않아서 리턴 배열을 활용하기 번거롭다.
        Integer[] arr1 = ar.toArray(new Integer[0]);
        System.out.println(arr1);
//        toArray(T[] a)는 T 타입 배열을 반환한다.
//        T는 값 타입이 될 수 없기 때문에 int, double, float와 같은 타입의 배열은 이 방법으로는 얻을 수 없다.
//        파라미터 a의 길이는 0으로 지정하면 알아서 list의 길이에 맞게 조정되어 arr에 저장된다.


        // LinkedList 링크드 리스트  ArrayList보다 메서드기능이많음  // 중복추가 가능!!
        LinkedList<String> linkedList = new LinkedList<>();

        // 데이터 추가
        linkedList.add("유재석");
        linkedList.add("조세호");
        linkedList.add("김종국");
        linkedList.add("박명수");
        linkedList.add("강호동");

        // 데이터 조회  .getFirst 배열맨앞조회
        System.out.println(linkedList.get(0)); // 유재석
        System.out.println(linkedList.getFirst()); // 유재석
        System.out.println(linkedList.getLast()); // 강호동   배열맨뒤조회
        System.out.println("----");

        // 추가  .addFirst 배열맨앞에추가
        linkedList.addFirst("서장훈");
        for (String link : linkedList) {
            System.out.println(link);
        }

        linkedList.addLast("남창희");  // 배열맨뒤에 추가
        System.out.println(linkedList);
        System.out.println(linkedList.getLast()); //남창희

        // 배열 중간에 요소추가
        linkedList.add(1, "김영철");
        System.out.println(linkedList.get(1));  //김영철
        System.out.println(linkedList);
        System.out.println("----");

        // 삭제 .removeFirst  .removeLast
        linkedList.remove(linkedList.size() - 1); // 마지막요소 삭제
        linkedList.removeLast();  // 마지막요소 삭제
        linkedList.removeFirst(); // 처음요소 삭제
        System.out.println(linkedList);

        // 변경 .set
        linkedList.set(0, "이수근"); // 0번인덱스를 이수근으로 변경
        System.out.println(linkedList.get(0)); //이수근

        //  indexOf  인덱스를 알려줌  contains 포함됐는지알려줌
        System.out.println(linkedList.indexOf("김종국"));  // 3
        System.out.println(linkedList.contains("김종국")); // true

        if (linkedList.contains("김종국")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }

        // 전체 삭제
        linkedList.clear();
        if (linkedList.isEmpty()) {
            System.out.println("남은 학생수 : " + linkedList.size());  // 0
        }
        // isEmpty 비었으면 true 출력

        // 새로운 학기
        linkedList.add("유재석");
        linkedList.add("조세호");
        linkedList.add("김종국");
        linkedList.add("박명수");
        linkedList.add("강호동");
        linkedList.add("강호동");
        linkedList.add("강호동");
        // 중복추가 가능!!

        // 정렬 가나다라순으로
        Collections.sort(linkedList);
        System.out.println(linkedList);

    }


}
