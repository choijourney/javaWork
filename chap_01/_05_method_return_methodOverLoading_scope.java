package chap_01;

public class _05_method_return_methodOverLoading_scope {

    // 메서드 정의 (함수 정의)  메서드 정의는 main 위에 작성
    public static void sayHello() {
        System.out.println("안녕하세요 메서드 입니다.");
    }

    // 전달값이 있는 메서드 ( 매개변수 , 인수)
    public static void power(int number) {  // 매개변수
        int result = number * number;
        System.out.println(number + "의 2승은 " + result);
    }

    public static void powerByExp(int number, int exponent) { //인수 두개사용
        int result = 1;
        for(int i = 0; i < exponent; i++){
            result *= number;  //거듭제곱 구하기
        }  // number를 exponent숫자 만큼 곱함 number가 2, exponent 3 이면, 2를 3번 곱함
        System.out.println(number + " 의 " + exponent + "승은 "+ result);
    }

    // return
    // void를 쓰면 반환값이 없음. void를 안쓰면 반환값을 받음
    // 호텔 전화번호
    public static String getPhoneNumber(){      // String 이면 반환값도 String이어야함
        String phoneNumber = "o2-1234-5678";
                return phoneNumber;
    }
    // 호텔 주소
    public static String getAddress(){
        return "서울시 남산";
    }

    // 호텔 액티비티
    public static String activity(){
        return "패러글라이딩, 노래방, 남산등산";
    }


    // 전달값과 반환값이 있는 메서드 (인수와 return이 있는 메서드)
    public static int power(int number, int exponent){
        int result1 = 1;            //타입같고 인수개수나 인수타입 다르면 함수이름 중복사용가능
        for (int i = 0; i < exponent; i++) {
            result1 *= number; // number를 exponent숫자만큼 곱함 예를들어
        } //number가 2, exponent 3 이면, 2를 3번 곱함
        return result1;
    }


    // 메서드 오버로딩  같은 기능을 하는 함수인데 함수를 여러개 만드는건 비효율적이라
    // 타입이 같고 인수개수나 인수타입이 다르다면 함수 이름 하나를 중복으로 사용 할 수 있다.

    /*  public static int powerStr(String strNumber){   // 제곱 구하는 함수인데
        int number = Integer.parseInt(strNumber);       // "3" 문자열을 숫자로 바꿈
        return number * number;
    } */
    public static int power(String strNumber){ //  위 식에서 함수이름을 전에 만들었던
        int number = Integer.parseInt(strNumber);  // power 함수로 통일 시켰다
        return number * number;
    }

    // 메서드 안에 메서드를 호출 할수있다
    public static int getPower(int number){  //이 인수 number를
        return power(number,2);  // 여기에 써서 연결
    }  // getPower(3) 이렇게 인수 하나만 써서 함수를 이용할수있다

    public static int abc(int abc){  // main에 있는 변수 abc를 넣음
       System.out.println(abc);      // 변수 범위 테스트. 중괄호 밖 범위지만 함수 인수로는 사용가능
        return abc;
    }

    public static void main(String[] args) {
        // 메서드 호출 (함수 호출)
        System.out.println("메서드 호출 전");
        sayHello();
        sayHello();
        System.out.println("메서드 호출 끝");

        // 인수 Argument
        power(2); //2 * 2 = 4  / 3 * 3 = 9
        powerByExp(3,3); // 3*3*3 = 27

        // 호텔 리턴값있는 함수를 변수에 저장
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호: " + contactNumber);

        String address = getAddress();
        System.out.println("호텔 주소: " + address);

        System.out.println("호텔 액티비티: " + activity()); // 함수를 그냥 써도된다


        // 전달값과 반환값이 있는 메서드
        int retVal = power(3,3);
        System.out.println(retVal);  // 3*3*3=27

        // 메서드 오버로딩   타입같고 인수개수나 인수타입 다르면 함수이름 중복사용가능
        System.out.println(power("2")); // 문자열을 숫자로 바꾸는 함수로 자동으로 인식
        System.out.println(power(5,2));


        // 변수 범위  for문이든 일반중괄호든 중괄호 안에서 선언한 변수는 그 중괄호 안에서만 활용할수있다.
        { int j =0;
            System.out.println(j); // 여기선 j가 호출되지만
        }
        // System.out.println(j);  // 중괄호 밖인 여기선 호출 안됨

        int abc =0;         // main에 선언한 변수 abc를  함수 인수에 넣어 쓸 수는있다.
        System.out.println(abc(abc));

        
    }
}

