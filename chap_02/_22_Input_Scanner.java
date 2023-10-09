package chap_02;

import java.util.Scanner;

public class _22_Input_Scanner {
    public static void main(String[] args) {
        // 사용자로부터 입력받음 System.in

        Scanner sc =new Scanner(System.in);
        System.out.println("이름을 입력하세요");
        String name = sc.next();
        System.out.println("키를 입력하세요");
        Double height = sc.nextDouble();  // 실수

        System.out.println("어떤 프로그래밍 언어를 배웠나요?");
        String langs = sc.next();   // 자바를 배웠어요
        // 라고 입력하면 sc.next는 단어1개만 저장하기때문에
        // langs에 자바를   이저장되고   배웠어요 는 아래 feeling에 저장된다

        sc.nextLine(); // 이때 nextLine을쓰면 배웠어요를 삭제한다


        System.out.println("배운 소감은요?");
        String feeling = sc.nextLine(); // 어렵지만 재밌었어요

        // nextLine은 문장을 저장한다

        System.out.println("입력하신 정보는 다음과 같습니다");
        System.out.println("이름 : " +name);
        System.out.println("키 : " + height);
        System.out.println("배운 언어 : "+ langs);
        System.out.println("배운 소감 : "+ feeling);
    }
}
