package chap_02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class _06_QuizArrayList {

    public static void main(String[] args) {

        ArrayList<Certification> certifi = new ArrayList<>();
        certifi.add(new Certification("유재석", "파이썬"));
        certifi.add(new Certification("박명수", "자바"));
        certifi.add(new Certification("김종국", "자바"));
        certifi.add(new Certification("조세호", "C"));
        certifi.add(new Certification("서장훈", "파이썬"));

        for (Certification c : certifi) {
            if (c.certification.equals("자바")) {
                System.out.println(c.name);
            }
        }

//        for (Certification c : certifi) {
//            if (c.certification == "자바") {     문자열 비교할때 == 쓰지말라고함
//                System.out.println(c.name);       equals써야함
//            }
//        }


    }
}


class Certification {
    String name;
    String certification;

    public Certification(String name, String certification) {
        this.name = name;
        this.certification = certification;
    }
}