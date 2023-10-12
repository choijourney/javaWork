package chap_01;

public class _01_helloWorld {
    //ctrl + alt + l 자동줄맞춤    alt+insert 뉴클래스생성
    public static void main(String[] args) {
        // 변수(variable)는 '값을 저장할 수 있는 메모리 상의 공간'을 의미
        // javac.exe 자바 컴파일러


        System.out.println("Hello World!!");
        System.out.println("안녕");
        System.out.println(13);
        System.out.println(-13);
        System.out.println(3.14);
        System.out.println(123 + 456);
        System.out.println(true);
        System.out.println(false);

        String name = "다니엘";
        int hour = 15;
        System.out.println(name + "님, 배송이 시작 됐습니다");
        System.out.println(name + "님, 배송 시간은 " + hour + "시 입니다");

        double score = 90.5;  //실수
        char grade = 'A';   //문자 한 글자 쓸 수있음
        boolean pass = true;
        name = "현무";  //변수 업데이트

        System.out.println(name + "님의 점수는 " + score + " 점 입니다");
        System.out.println("학점은 '" + grade + "' 입니다");
        System.out.println("이번 시험에 합격 했을까요? -" + pass);

        double d = 3.1433333333; //정밀한 실수값. 긴 실수도 가능
        float f = 3.14F; //F를 꼭 써줘야 함. 짧은 실수만 쓸수있음 메모리 적게차지.
        System.out.println(d);
        System.out.println(f);

        long l = 1_000_000_000_000L; // L을 꼭붙이기. int로는 긴 정수를 쓸수없어서 long을 씀
        System.out.println(l);
        /* 여러줄 주석 ctrl+ shift + /    */

        //상수 Constants     상수는 final 을 쓰고 대문자로 써야함
        final String KR_COUNTRY_CODE = "82";
        final Double PI = 3.141592;

        // 정수를 실수로. 실수를 정수로 형변환
        int scores = 93;
        System.out.println((float) scores); //93.0
        System.out.println((double) scores); //93.0

        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f); //93
        System.out.println((int) score_d); //98

        //정수+실수 연산
        scores = 93 + (int) 98.8;  // 93 + 98 =191

        score_d = 98.8 + 93; // 93은 자동으로 실수로 전환돼 계산됨
        System.out.println(score_d);  //191.8

        //변수에 형변환된 데이터 넣기
        double convertedScoreDouble = scores; //191 -> 191.0 정수를 실수로 바꿀땐 자동.
        //int->long->float->double (작은 범위에서 정밀한 범위로바꿀땐. 자동 형변환)

        int convertedScoreInt = (int) score_d; //191.8 ->191 실수를 정수로.수동 형변환

        // 숫자를 문자열로.  두가지방법있음
        String s1 = String.valueOf(93); // 93문자열됨
        s1 = Integer.toString(93);  // 93문자열됨
        System.out.println(s1);

        String s2 = String.valueOf(98.8);  //98.8문자열됨
        s2 = Double.toString(98.8);  // 98.8문자열됨
        System.out.println(s2);

        //문자열을 숫자로
        int j = Integer.parseInt("93");  //숫자 93으로됨
        System.out.println(j);
        double dd = Double.parseDouble("98.8");  //숫자 98.8로됨

        // int error = Integer.parseInt("자바");  //오류남. 숫자만써야함


        // 퀴즈
        String busNum = "상암08";
        int minute = 3;
        double distance = 1.2;

        System.out.println(busNum + "번 버스");
        System.out.println("약 " + minute + "분 후 도착");
        System.out.println("남은 거리 " + distance + "km");

        // 연산
        System.out.println(5 / 2); // 2.5여야 하는데 소수점을 생략시키고 2출력
        System.out.println(2 / 4); // 0.5 인데 소수점 생략하고 0 출력

        // 우선순위 연산
        System.out.println((2 + 2) * 2);  //8

        // 변수를 이용한 연산
        int a = 10;
        int b = 5;
        int c;

        c = a + b;  //15
        c = a - b;  //5
        c = a * b;  //50
        System.out.println(c);

        // 증감 연산 ++  --
        int val;
        val = 10;
        System.out.println(val); //10
        System.out.println(++val); //11
        System.out.println(val); //11
        // ++val 는 1을 더한값을 바로 출력한다
        // val++ 는 val값을 먼저출력하고 그다음줄에 1을더한다
        val = 10;
        System.out.println(val); //10
        System.out.println(val++); //10
        System.out.println(val); //11

        val=10;
        System.out.println(--val); //9

        val=10;
        System.out.println(val--); //10
        System.out.println(val); //9

        // 은행 대기번호 표
        int wating = 0;
        System.out.println("대기 인원 : " + wating++); //대기 인원 0
        System.out.println("대기 인원 : " + wating++); //대기 인원 1
        System.out.println("대기 인원 : " + wating++); //대기 인원 2
        System.out.println("총 대기 인원 : " + wating++); //총 대기 인원 3

        //대입연산자
        int numb = 10;
        numb = numb + 2; //12
        numb += 2; // 14

        // 비교연산자
        System.out.println(5 == 5); //5는 5와 같다 true
        System.out.println(5 != 3); //5는 3과 같지않다 true

        // 논리연산자  or and
        boolean 김치찌개 = false;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); //true 하나라도 true면 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음); //false 모두 true여야 true

        // 논리 부정 연산자
        System.out.println(!true); //false
        System.out.println(!false); //true
        System.out.println(!(5==5)); //false
        System.out.println(!(5==3)); //true

        // 삼항 연산자
        // 변수 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x = 3;
        int y = 5;
        int max = (x > y) ? x : y; // 3 > 5 는 거짓이니까 5 출력
        System.out.println(max); //이렇게해서 큰값을 구할수 있음

        int min = (x < y) ? x : y; // 3 < 5 는 참이니까 3 출력

        x = 3;
        y = 3;
        boolean boo = (x == y) ? true : false; //true

        String s = (x != y) ? "다름" : "같음"; //같음 출력
        System.out.println(s);

        //퀴즈
        int r = 120;
        String result = (r >=120) ? "탑승 가능합니다." : "탑승 불가능합니다";
        System.out.println("키가 " + r + "cm 이므로 " + result);

    }
}




