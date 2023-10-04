package chap_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class _04_WrapperClass_intValue_toString_ArrayList {
    public static void main(String[] args) {
        // 래퍼 ( Wrapper ) 클래스
        // int double float char 같은 기본자료형을 객체형태로 만들어줌
        // 첫글자를 대문자로 바꾸면됨. char는 Character 로 바꿔줌
        Integer i = 123;  // int i = 123;
        Double d = 1.0;  // double d = 1.0;
        Character c = 'A';  // char c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("------");
        // 래퍼클래스는 클래스기때문에 사용할수있는 메서드들이있다.
        // . 찍으면 쓸수있는 메서드들이나온다
        System.out.println(i.intValue());
        System.out.println(d.intValue());   // 실수를 정수로 바꿔줌
        System.out.println(c.charValue());

        System.out.println("-------");
        String s = i.toString();  // 정수를 문자열로 바꿔줌
        System.out.println(s);


        // 컬렉션 프레임워크  (ArrayList,LinkedList , set, Map)
        // 배열에 개수를 정하지않고 계속추가변경,정렬등 여러기능 가능함

        //ArrayList 여러내용을 배열에 추가할수있음  // 중복추가 가능!!
        ArrayList<String> list = new ArrayList<>();
        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");
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

        // 배열안에 포함이 돼있나 확인만 하려면 contains / true false 로 답해줌
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
        linkedList.add(1,"김영철");
        System.out.println(linkedList.get(1));  //김영철
        System.out.println(linkedList);
        System.out.println("----");

        // 삭제 .removeFirst  .removeLast
        linkedList.remove(linkedList.size()-1); // 마지막요소 삭제
        linkedList.removeLast();  // 마지막요소 삭제
        linkedList.removeFirst(); // 처음요소 삭제
        System.out.println(linkedList);

        // 변경 .set
        linkedList.set(0,"이수근"); // 0번인덱스를 이수근으로 변경
        System.out.println(linkedList.get(0)); //이수근

        //  indexOf  인덱스를 알려줌  contains 포함됐는지알려줌
        System.out.println(linkedList.indexOf("김종국"));  // 3
        System.out.println(linkedList.contains("김종국")); // true

        if(linkedList.contains("김종국")){
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }

        // 전체 삭제
        linkedList.clear();
        if(linkedList.isEmpty()){
            System.out.println("남은 학생수 : " +  linkedList.size());  // 0
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
