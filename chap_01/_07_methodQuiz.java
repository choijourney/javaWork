package chap_01;


import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class _07_methodQuiz {
    // 나코딩 -> 나** / 주민번호 990130-1***** / 전번 010-1234-****
    // 개인정보를 비공개로 전환하는 메서드 만들기

    public static String id(String info, int number) {

        String hiddenData = info.substring(0, number); //나코딩 -> 나

        for (int i = 0; i < info.length() - number; i++) {
            hiddenData += "*";  // h=h+* , h= h* + *,  h=h**   *만 반복 더함
        }
        return hiddenData;
    }

//    public static String id1(String info, int number) {
//
//        String hiddenData = info.substring(0,number);
//        for (int i = number; i < info.length() ; i++) {
//            hiddenData += "*";
//        }
//        return hiddenData;   위와 같은 결과
//    }

    public static void main(String[] args) {

        String name = "나코딩";
        String idNumber = "990130-123456";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + id(name, 1));
        System.out.println("주민번호 : " + id(idNumber, 8));
        System.out.println("전화번호 : " + id(phone, 9));

    }
}
