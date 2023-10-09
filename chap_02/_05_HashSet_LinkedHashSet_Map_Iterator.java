package chap_02;

import java.util.*;

public class _05_HashSet_LinkedHashSet_Map_Iterator {
    public static void main(String[] args) {
        // set  세트 중 HashSet - 중복값을 빼고 저장, 순서를 랜덤으로 저장
        // index가 없음

        HashSet<String> hash = new HashSet<>(); // 다른타입을써도됨

        hash.add("삼겹살");
        hash.add("쌈장");
        hash.add("음료");
        hash.add("소금");
        hash.add("후추");
        hash.add("삼겹살");
        hash.add("깻잎");
        hash.add("상추");
        hash.add("삼겹살");
        System.out.println("구매한 상품 수는 : " + hash.size());
        // 9개를 적었는데 중복된 삼겹살 2개를 빼고 7개 출력

        // 순회
        for (String s : hash) {
            System.out.println(s); // 소금,쌈장,깻잎..   순서대로 출력되지않음
        }

        // 포함돼있나 확인 contains
        if (hash.contains("삼겹살")) {
            System.out.println("삼겹살 사러 출발");
        }
        System.out.println("----");

        // 삭제
        System.out.println(hash);
        hash.remove("상추");
        // hash.remove(0);   인덱스로는 삭제가 안됨 (set만. list는 인덱스로 삭제됨)
        System.out.println(hash);

        // 전체 삭제
        hash.clear();
        if (hash.isEmpty()) {
            System.out.println("남은 상품 수 : " + hash.size());
        }

        // 세트를 순서맞게 쓰고싶으면 LinkedHashSet 쓰면됨
        HashSet<Integer> intset = new LinkedHashSet<>();
        intset.add(1);
        intset.add(13);
        intset.add(2);
        System.out.println(intset);  // [1,13,2]]

        System.out.println("----");

        // .addAll() 로 여러요소 추가하기
        HashSet<Integer> t = new HashSet<>(Arrays.asList(11, 3));
        t.add(22);
        System.out.println(t); //[3, 11 ,22]

        HashSet<Integer> t2 = new HashSet<>();
        t2.add(77);
        t2.addAll(t);
        System.out.println(t2); //[3, 11, 77 ,22]

        HashSet<Integer> t3 = new HashSet<>(Arrays.asList(33,44));
        t3.addAll(t2);
        System.out.println(t3); //[33, 3, 22, 11, 44, 77]



        // HashSet 을 ArrayList로 변환해서 정렬하기 Collections.sort
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


        // HashSet을 treeSet으로 정렬하기
        // TreeSet은 Tree자료구조를 이용해 구현된 set이다
        // 내부적으로 이진트리를 쓰기때문에 순서대로 저장된다
        // 순서가없는 HashSet을 TresSet에 저장하면 정렬돼서 저장됨
        HashSet<Integer> tr = new HashSet<>(Arrays.asList(3,2,4));
                                 //↑이런식으로쓰면 HashSet도 어느정도정렬돼서출력됨
        System.out.println("HashSet : "+ tr); //[2,3,4]

        TreeSet<Integer> tr1 = new TreeSet<>();
        tr1.addAll(tr);
        System.out.println("TreeSet : "+ tr1); // [2,3,4]




        // 맵 ( Key, Value ) 를 저장함  중복허용X 순서랜덤    컬렉션이 아니다.
        HashMap<String, Integer> map = new HashMap<>();  // 키,값에 타입을 적어줌
//   HashMap<String, Integer> map = new LinkedHashMap<>(); 순서맞게쓰려면 LinkedHashMap

        // 추가   .put
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);
        System.out.println("총 고객수 : " + map.size());  // 3

        // 값 가져오기 .get
        System.out.println(map.get("유재석"));  // 10
        System.out.println(map.get("박명수"));  // 5
        System.out.println("----");


        // containsKey로 포함돼있나 확인
        if (map.containsKey("서장훈")) {  // 인수에 키를 넣어 배열에포함돼있나확인 서장훈이있다면
            int point = map.get("서장훈");  // get을 이용해 값을 가져와서 point에저장
            ++point;  // 오늘 방문했으니까 point 1 플러스
            // map.put("서장훈",++point);  이렇게써도됨
            System.out.println("고객님의 누적 포인트는 : " + point);
        } else {
            map.put("서장훈", 1);
            System.out.println("서장훈님 신규 등록 (포인트 1)");
        }

        System.out.println("----");

        // 삭제  .remove
        map.remove("유재석");
        System.out.println(map.get("유재석")); // null

        // 전체 삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("총 고객 수 : " + map.size()); // .size length같은기능
        }

        // 다시 고객들이 찾아옴
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        // .keySet 으로 키 가져옴 (배열로)
        System.out.println(map.keySet()); // [박명수,서장훈,유재석,김종국]
        for (String st : map.keySet()) {
            System.out.println(st);
        }

        // .values() 로 값 가져옴 (배열로)
        System.out.println(map.values()); // [5,15,10,3]
        for (int val : map.values()) {
            System.out.println(val);
        }

        // 키값 모두 가져옴
        for (String k : map.keySet()) {
            System.out.println("키는 : " + k + "\t 값은 :" + map.get(k));
        }
        System.out.println("----");

        // 맵 : 중복사용X 순서보장X
        map.put("김종국", 10);
        map.put("김종국", 30);
        map.put("김종국", 50);
        for (String k : map.keySet()) {
            System.out.println("키는 : " + k + "\t 값은 :" + map.get(k));
        }
        // 중복허용이 안돼서 추가를 3번더했어도 추가가 되지않고 값만 50으로 업데이트됨
        // 김종국 50

        System.out.println("----");


        // 이터레이터 반복하다가 필요없는요소를 쉽게 지울수있음
        List<String> list = new ArrayList<>();
        // ArrayList,LinkedList 의 부모는 List기 때문에 List로 객체를 만들어도됨
        // List는 인터페이스고 List의 메서드를 상속받아 쓸수있다

        list.add("유재석");
        list.add("(알 수 없음)");
        list.add("김종국");
        list.add("(알 수 없음)");
        list.add("강호동");
        list.add("(알 수 없음)");
        list.add("박명수");
        list.add("(알 수 없음)");
        list.add("조세호");

        Iterator<String> it = list.iterator();  // 이터레이터 객체 만듦
// list.iterator(); 를쓴후 ctrl + alt + v 누르면 코드자동완성 ( 반환값이 있는메서드일때 )
        System.out.println(it.next()); // 유재석
        System.out.println(it.next()); // (알 수 없음)
        System.out.println(it.next()); // 김종국
        System.out.println(it.next()); // (알 수 없음)
        // .next 메서드를 쓰면 다음 요소를 출력  첫시작점은 유재석전줄.

        System.out.println("----");
        it = list.iterator();   // 커서를 처음으로 이동
        while (it.hasNext()) {   // 다음요소가있는동안
            System.out.println(it.next());  // 다음요소출력
        }
        // .hasNext 다음요소가있는지 알려줌

        System.out.println("----");

        it = list.iterator();    // 커서를 처음으로 이동
        while (it.hasNext()) {   // 다음요소가 있는동안
            String s = it.next();  // 다음요소들을 순회하면서 String s 에저장
            if (s.contains("(알 수 없음)")) {    // (알수없음)이 포함돼있으면
                it.remove();    // (알 수 없음)삭제
            }
        }

        it = list.iterator();    // 이터레이터로 순회해서 다시보면 (알 수 없음) 은 삭제돼있다
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("----");

        // set과 map에도 이터레이터를 쓸수있다
        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");
        Iterator<String> itset = set.iterator();  // set.iterator(); 쓰고 ctrl + alt +v 로 코드자동완성
        while (itset.hasNext()) {
            System.out.println(itset.next());
        }
        System.out.println("----");

        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("유재석", 10);
        map1.put("지석진", 1);
        // map1.iterator(); 를 바로쓸수없다 키값이 있기때문에 키값을 먼저불러와야함
        Iterator<String> itmap = map1.keySet().iterator(); // .keySet 으로 키를 불러와서 순회
        while (itmap.hasNext()) {
            System.out.println(itmap.next()); // 유재석 지석진
        }

        Iterator<Integer> itmapVal = map1.values().iterator(); // .values 로 값을 불러와서 순회
        while (itmapVal.hasNext()) {
            System.out.println(itmapVal.next());  // 10 1
        }

        // .entrySet 키,값 한번에 불러옴
        Iterator<Map.Entry<String, Integer>> mapKeyVal = map1.entrySet().iterator(); //ctrl+alt+v
        while (mapKeyVal.hasNext()) {
            System.out.println(mapKeyVal.next()); // 유재석=10 지석진=1 출력
        }

    }
}
