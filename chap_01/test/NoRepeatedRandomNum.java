package chap_01.test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NoRepeatedRandomNum {
    public static void main(String[] args) {
        // 중복없는 랜덤숫자 생성

        System.out.println(rN(1));
        System.out.println(rN(0));

    }


    public static int rN(int numb) {
        int num = 2; // 난수 생성 갯수
        int random[] = new int[num];
        int p;
        Random r = new Random();

        for (int i = 0; i < num; i++) {
            p = r.nextInt(45) + 1; // 1~45 숫자중 난수만듦
            if (!(random.equals(p))) {
                random[i] = p;
            }
        }
        return random[numb];
    }


}
//    int[] scores = {100, 95, 90, 85, 80};
//    IntStream scoreStream = Arrays.stream(scores);
////      Arrays.stream(scores); 쓰고 ctrl + alt + v 누르면 자동완성


//    // c 라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
//    List<String> langListStartsWithC = langList.stream()
//            .filter(x -> x.contains("c"))
//            .map(String::toUpperCase)
//            .collect(Collectors.toList());
//
//        langListStartsWithC.stream().forEach(System.out::println);