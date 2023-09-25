package chap_01;

public class _05_method {

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
        }
        System.out.println(number + " 의 " + exponent + "승은 "+ result);
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



    }




}

