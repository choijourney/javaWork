package chap_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _10_Stream {
    public static void main(String[] args) {
        // 스트림 생성
        // 스트림은 한번사용하면 다시사용할수 없기때문에 매번 새롭게 만들어야함
        // 원본데이터는 스트림을써도 그대로이다.


        // 배열 스트림  Arrays.stream()
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);
//      Arrays.stream(scores); 쓰고 ctrl + alt + v 누르면 자동완성
        
        String[] langs = {"python", "java", "javascript", "c", "c++","c#"};
        Stream<String> langStream = Arrays.stream(langs);

        // Collection.stream()
        List<String> langList = new ArrayList<>();  // 컬렉션ArrayList
//        langList.add("python");
        langList = Arrays.asList("python", "java", "javascript", "c", "c++","c#");
        System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();

        // Stream.of()
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");


        // 스트림 사용
        // 중간 연산 : filter, map, sorted,distinct, skip,...
        // 최종 연산 : count, min, max, sum, forEach, anyMatch, allMatch,...

        // 맨 위 스코어중 90점 이상인 점수만 출력
        Arrays.stream(scores).filter(x->x>=90).forEach(x-> System.out.println(x));
        System.out.println("----"); //위 식과 아래식은 결과같음
        Arrays.stream(scores).filter(x->x>=90).forEach(System.out::println);
       // forEach안에 soutc 입력하면 자동완성

        // 90점 이상인 사람의 수
        int count = (int) Arrays.stream(scores).filter(x -> x >= 90).count();
//      long count = Arrays.stream(scores).filter(x -> x > 90).count();
//      반환값이 있을땐 ctrl + alt + v 눌러서 변수에 저장하기
        System.out.println(count);


        // 90점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("----");

        // 90점 이상인 점수 정렬
       Arrays.stream(scores)
                .filter(x -> x >= 90).sorted().forEach(System.out::println);
        // 배열을 출력해야하니까 forEach를 통해 출력
        System.out.println("----");


        // "python", "java", "javascript", "c", "c++","c#"
        // c 로 시작하는 프로그래밍 언어  위에 langs라는 String변수로 저장
        Arrays.stream(langs).filter(x->x.startsWith("c"))
                .forEach(System.out::println);

        // java 라는 글자를 포함하는 언어
        Arrays.stream(langs).filter(x->x.contains("java"))
                .forEach(System.out::println);

        System.out.println("----");

        // 4글자 이하의 언어를 정렬해서 출력  컬렉션은 stream인수필요없음
        langList.stream().filter(x -> x.length() < 5)
                .sorted().forEach(System.out::println);

        System.out.println("----");

        // 4글자 이하의 언어중에서 c 라는 글자를 포함하는 언어
        langList.stream().filter(x-> x.length()<5)
                .filter(x->x.contains("c")).forEach(System.out::println);

        // 4글자 이하의 언어중에서 c라는 글자를 포함하는 언어가 1개라도 있는지 여부
        boolean c = langList.stream().filter(x -> x.length() < 5)
                .anyMatch(x -> x.contains("c"));
        // anyMatch는 불리안이라 변수저장해서 출력가능함
        System.out.println(c);


        // 4글자 이하의 언어들은 모두 c 라는 글자를 포함하는지 여부
        boolean c1 = langList.stream().filter(x -> x.length() < 5)
                .allMatch(x -> x.contains("c"));
        System.out.println(c1);

        // 4글자 이하의 언어중에 c 라는 글자를 포함하는 언어 뒤에 "어려움" 글자를 함께출력
        // map
        langList.stream().filter(x->x.length()<5)
                .filter(x->x.contains("c")).map(x->x+" (어려움)")
                .forEach(System.out::println);

        System.out.println("----");

        // c 라는 글자를 포함하는 언어를 대문자로 출력
        langList.stream().filter(x->x.contains("c"))
                .map(String::toUpperCase).forEach(System.out::println);

        System.out.println("----");

        // c 라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
        List<String> langListStartsWithC = langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        langListStartsWithC.stream().forEach(System.out::println);


    }


}
