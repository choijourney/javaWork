package chap_01;

public class _02_contains_subString_equals_if_switch {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        //드래그하면 오른쪽 아래에 글자수 볼수있음
        //문자열의 길이 .length() 를 써서 알수도 있음
        System.out.println(s.length()); //29

        // 포함 메서드
        System.out.println(s.contains("Java")); //포함된다면 true 출력
        System.out.println(s.contains("C#")); //포함되지않으면 false 출력
        System.out.println(s.indexOf("Java")); //위치 정보 7 출력
        System.out.println(s.indexOf("C#")); //포함되지않으면 -1 출력
        System.out.println(s.indexOf("and")); //처음 일치하는 위치정보 12출력
        System.out.println(s.lastIndexOf("and")); //마지막 일치하는 위치정보 23출력
        System.out.println(s.startsWith("I like ")); // 이 문자열로 시작하면 true
        System.out.println(s.endsWith(".")); //이 문자열로 끝나면 true

        // 문자열 변환
        System.out.println(s.replace(" and", ",")); //and를 , 로 변환
        System.out.println(s.substring(7));
        //인덱스7부터 끝까지 출력. s변수는 그대로이다.
        System.out.println(s.substring(s.indexOf("Java")));
        //인덱스메서드로 7 을찾은뒤 7부터 끝까지출력.
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".")));
        //Java부터 .마침표 전까지 출력   I like Java and Python and C

        // 공백 제거
        s = "   I love Java.  ";
        System.out.println(s.trim()); //앞 뒤 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); //JavaPython
        System.out.println(s1 + "," + s2); //Java,Python
        System.out.println(s1.concat(",").concat(s2)); //Java,Python

        // 문자열 비교
        String s3 = "Java";
        String s4 = "Python";
        System.out.println(s3.equals(s4)); //fale출력 문자열 내용이 같으면 true
        System.out.println(s3.equals("Java")); //true 출력

        System.out.println(s4.equals("python")); //false 출력 대소문자 구분하니까
        System.out.println(s4.equalsIgnoreCase("python"));
        //true출력 대소문자 구분안하고 글자만 같은지 확인


        // 문자열 비교 심화  문자열 내용을 비교할때는 equals메서드를 써야함
        s1 = "1234"; //벽에 붙은 메모지의 비번 정보 (참조)
        s2 = "1234"; //s1과 s2는 "1234"라는 같은 참조를 갖음
        System.out.println(s1.equals(s2)); //true "1234" 내용을 비교
        System.out.println(s1 == s2); //true 참조를 비교

        s1 = new String("1234"); //new를 쓰면 참조가 달라짐
        s2 = new String("1234"); //s1과 s2는 다른 참조를 갖음
        System.out.println(s1.equals(s2));//true  내용비교니까 true
        System.out.println(s1 == s2); //false 참조를 비교하니까 false


        // 특수 문자 이스케이프 문자
        System.out.println("자바가\n너무\n재밌어요");
        //  줄바꿈 \n  윗줄과 아래세줄은 같은결과
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");
        // 탭기능 \t  띄어쓰기 줄을 아래랑 맞춰줌
        //해물파전   9000원
        //김치전     8000원
        //부추전     8000원
        System.out.println("해물파전\t\t9000원");
        System.out.println("김치전\t\t8000원");
        System.out.println("부주천\t\t8000원");

        // 역슬래시 \\두번씩 적기
        System.out.println("C:\\Program Files\\Java"); // C:\program Files\Java 출력

        // 큰따옴표 작은따옴표 앞에 \
        System.out.println("단비가 \"냐옹\" 이라고 했어요"); //단비가 "냐옹" 이라고 했어요
        System.out.println("단비가 \'냐옹\' 이라고 했어요"); //단비가 '냐옹' 이라고 했어요
        System.out.println("단비가 '냐옹' 이라고 했어요"); //단비가 '냐옹' 이라고 했어요

        char c = '\''; //작은따옴표 하나만 저장하고싶을때 씀 '

        // 퀴즈
        String socialNo = "901231-1234567";  //901231-1 까지만 출력하게 만들기
        String socialNo1 = "030708-4567890";
        System.out.println(socialNo.substring(0, 8)); //0부터 8전까지 출력
        System.out.println(socialNo1.substring(0, socialNo1.indexOf("-") + 2));
        // 하이픈위치 인덱스를찾아 +2를 한다


        // 조건문 if
        int hour = 15;
        if (hour < 14)
            System.out.println("아이스 아메리카노 +1  #0"); //한줄일땐 중괄호 생략가능

        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1  #0"); //두줄부터 중괄호 씀
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료 #0");

        // 오후 2시 이전, 모닝 커피를 마시지 않은 경우?
        hour = 10;
        boolean mornigCoffee = false;
       // if(hour < 14 && mornigCoffee) // true여야 조건문을 실행하니까 true로 만들어야함
       // if(hour < 14 && !mornigCoffee) // false를 리버스해서 true니까 실행
        if (hour < 14 && mornigCoffee == false) // false == false는 true니까 실행
            System.out.println("아이스 아메리카노 +1  #1");


        // 조건문 else
        hour = 15;
        if(hour < 14){
            System.out.println("아이스 아메리카노 +1  #2");
        } else {
            System.out.println("아이스 아메리카노 (디카페인) +1  #2");
        }
        System.out.println("커피 주문 완료 #2");

        hour = 10;
        boolean isMorningCoffee = false;
        if(hour > 14 || isMorningCoffee == true){ //false == true 는 false 하지만 or 니까
            System.out.println("아이스 아메리카노 (디카페인) +1  #3"); // 실행
        }else{
            System.out.println("아이스 아메리카노 +1  #3");
        }

        // else if
        boolean hallabongAde = false; //한라봉에이드
        boolean mangoJuice = false; //망고쥬스
        boolean orangeJuice = true; //오렌지쥬스
        if(hallabongAde){
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고쥬스 +1");
        } else if (orangeJuice){
            System.out.println("오렌지쥬스 +!");
        } else System.out.println("아이스 아메리카노 +1");
        //한라봉에이드,망고쥬스가 false라서 오렌지쥬스 +1 주문
        //else if까지만 쓰고 else를 적지않아도 됨.
        //else if까지 모두 false라면 아무조건문도 실행하지않고 종료


   // switch case 명확한 값이 있는경우 씀 / if문은 < 범위를 비교할때 씀

        int ranking = 4; //등수
        if(ranking == 1){
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else System.out.println("장학금 대상 아님"); //장학금 대상 아님 출력
        //이 if 문을 switch case문으로 바꾸면

        ranking = 2;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
                break;
        }

        // 중고상품의 등급에 따른 가격을 책정 (1급: 최상, 4급: 최하)
        int grade = 1; //등급
        int price = 7000; //기본가격
        switch (grade){
            case 1:
               price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }  // defalut는 생략가능
        System.out.println(grade + "등급 제품의 가격 : " + price +"원");
      //1등급 제품의 가격 : 10000원 출력   2등급 :9000원  3등급:8000원


    }
}
