package chap_01.test;

import java.util.*;

public class test5Array_Stream {
    public static void main(String[] args) {
        // 배열 , 스트림 연습

        List<String> al1 = new ArrayList<>(Arrays.asList("a", "b"));

        HashSet<String> al2 = new HashSet<>(Arrays.asList(" c, d"));
        al2.addAll(al1);
        System.out.println(al2);
        // "a","b"  와  "a,b" 차이가 있는지 궁금
        for (String al3 : al2) {
            System.out.println(al3);
        }
        // 다름 forEach로 값을받아보면 a b 는 따로 출력되고 c,d 는 c,d로 출력


        //  .removeAll
        ArrayList<String> a5 = new ArrayList<>(Arrays.asList("aa", "bb", "cc", "dd"));
        System.out.println(a5); // [aa, bb, cc, dd]
        ArrayList<String> a6 = new ArrayList<>(Arrays.asList("aa", "bb", "ee"));
        boolean result = a5.removeAll(a6); // a5에서 a6와 겹치는요소를 지움
        System.out.println(a5); // [cc, dd]
        System.out.println(result); // true

        ArrayList<String> a7 = new ArrayList<>(Arrays.asList("ff"));
        boolean result2 = a6.removeAll(a7);  // a6에서 a7과 겹치는 요소가 없어서 안지움
        System.out.println(result2); // false


        // HashMap 연습
        Map<String, Integer> coffee = new HashMap<>();
        coffee.put("서장훈", 10);
        coffee.put("강호동", 1);
        coffee.put("민경훈", 10);
        int point = 0;
        if ((coffee.containsKey("김희철"))) {
            point = coffee.get("김희철"); // .get 쓰면 값 출력
            ++point;
        } else {
            coffee.put("김희철", 1);
        }
        System.out.println(coffee);

        coffee.remove("서장훈");
        System.out.println(coffee.get("서장훈")); // null


        System.out.println(coffee.keySet()); //[민경훈, 강호동, 김희철]
        System.out.println(coffee.values()); // [10, 1, 1]

        for (String st : coffee.keySet()) {
            System.out.println(st); // 민경훈 강호동 김희철
            System.out.println(coffee.get(st)); // 10 1 1
        }

        // .entryset 으로 map의 모든 키와 값을 꺼냄
        for (Map.Entry<String, Integer> entry : coffee.entrySet()) {
            System.out.println("키 : " + entry.getKey() + " / " + "값 : " + entry.getValue());
        }
//        키 : 민경훈 / 값 : 10
//        키 : 강호동 / 값 : 1
//        키 : 김희철 / 값 : 1

        // .remove 겹치는요소 삭제
        List<String> star = new ArrayList<>(Arrays.asList("유재석", "알수없음", "김종국", "알수없음", "하하", "송지효"));
        List<String> none = new ArrayList<>(Arrays.asList("알수없음"));
        System.out.println(star);  // [유재석, 알수없음, 김종국, 알수없음, 하하, 송지효]
        star.removeAll(none);   // removeAll로 삭제
        System.out.println(star);  // [유재석, 김종국, 하하, 송지효]
        System.out.println("----- remove");


        // Iterator 반복문
        List<String> star1 = new ArrayList<>(Arrays.asList("유재석", "알수없음", "김종국", "알수없음", "하하", "송지효"));
        Iterator<String> it = star1.iterator();
        System.out.println(it.next());  // 유재석
        System.out.println(it.next());  // 알수없음
        System.out.println("-----");

        it = star1.iterator();  // 첫줄로 초기화
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);  // 유재석 알수없음 김종국 알수없음 하하 송지효
        }
        System.out.println("-----");

        it = star1.iterator();
        while (it.hasNext()) {
            String t = it.next();
            if (t.contains("알수없음")) { // 알수없음
                it.remove();            // 삭제
            }
        }

        it = star1.iterator();  // 삭제됐나 확인
        while (it.hasNext()) {
            System.out.println(it.next()); // 유재석 김종국 하하 송지효
        }
        System.out.println("-----");

        // set 과 map에도 Iterator를 쓸수 있다.
        HashSet<String> stars = new HashSet<>(Arrays.asList("양세찬", "지석진", "전소민", "알수없음"));
        Iterator<String> it2 = stars.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
            String k = it2.next();
            if (k.contains("알수없음")) {
                it2.remove();
            }
        }

        while (it2.hasNext()) {
            System.out.println(it2.next()); // 양세찬 전소민 지석진
        }
        System.out.println("-----");


        HashMap<String, Integer> runningMan = new HashMap<>();
        runningMan.put("지석진", 1);
        runningMan.put("광수", 3);
        runningMan.put("하하", 8);

        Iterator<String> ite = runningMan.keySet().iterator();
        while (ite.hasNext()) {
            String ii = ite.next();
            System.out.println(ii); // 광수 지석진 하하
//            if(ii.contains("광수")){
//                ite.remove();          삭제안됨
//            }        키와값이 있는데 키만 삭제하려니까 안되는듯
        }


        System.out.println("-----");


        // map을 iterator할때 값을 삭제하려했는데 안됨
        Iterator<Integer> ite2 = runningMan.values().iterator();
        while (ite2.hasNext()) {
            Integer i = ite2.next();
            if (i.equals(8)) {
                ite2.remove();
            }
        }

        ite2= runningMan.values().iterator();
        while (it2.hasNext()) {
            System.out.println(ite2.next()); // 아무것도출력안됨
        }

        for (Integer d : runningMan.values()) {
            System.out.println(d);      // 3 1 출력
        }

        runningMan.remove("지석진"); // 지석진지우고
        System.out.println(runningMan.toString()); // {광수=3} 출력

// iterator로 remove했을때 아무것도출력안되면서 오류처럼 보여지는데, foreach로는 remove가 잘돼서
// 나머지요소만 출력됨.  .toString으로 배열을 출력해봐도 삭제는 잘돼있다.
// 그래도 아무것도출력안되는게 찝찝하니까 안쓰는걸로





    }
}

