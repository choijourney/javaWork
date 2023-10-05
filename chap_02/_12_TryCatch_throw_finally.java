package chap_02;

public class _12_TryCatch_throw_finally {
    public static void main(String[] args) {
        // 예외 처리 (error=오류는 코드로 처리할수없다)
        // 오류 : 컴파일 오류, 런타임 오류 (에러는 코드로 수습할수 없음 -무한루프.
        // 예외는 코드로 수습할수있음) 컴파일오류도 코드로 수습할수없음
        

        // 예외가 발생하면 아래코드는 실행이안됨
        // 이럴때 try catch를 써서 실행하게 할수있다

        try {
            //System.out.println(3 / 0);

            int[] arr = new int[3];
            arr[5] = 100;

//            Object obj = "test";
//            System.out.println((int) obj);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("뭔가 실수 하셨네요."); //예외를 묶어서 처리 | 를씀
            //  }catch (ArrayIndexOutOfBoundsException e) {
            //      System.out.println("인덱스를 잘못 설정했어요.");
        } catch (ClassCastException e) {
            System.out.println("잘못된 형 변환입니다.");
        } catch (Exception e) {  // Exception은 모든 예외를 처리해줌. 조상
            System.out.println("그 외의 모든예외는 여기서 처리돼요. " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("에러 잡고 이 줄 실행");

//         e.getMessage() 를 쓰면  / by zero  어디서 오류가발생했는지 출력
//         sout 안에서 써야함

//         e.printStackTrace(); 를쓰면 아래 코드 출력
//        java.lang.ArithmeticException: / by zero
//        at chap_02._12_TryCatch.main(_12_TryCatch.java:13)

//        ArithmeticException 를 catch문의 인수로 써서 예외를 처리할수있음

// 해당 예외 catch문을 만나면 예를들어 ArithmeticException e를 만나서
// 예외처리가 되면 다음 catch문을 실행하는게 아니라 catch문을 빠져나오고 다음 코드를 실행.


//catch (ArithmeticException | ArrayIndexOutOfBoundsException e)
// 예외 두개를 묶어서 한번에 처리할때 | 를 씀


        // throw

        int age = 17;
        try {
            if (age < 19) {
             // System.out.println("만 19세 미만에게는 판매하지않습니다.");
                throw new Exception("만 19세 미만에게는 판매하지않습니다.");
            } else {
                System.out.println("주문하신 상품 여기 있습니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 일부러 throw를 던져 에러가뜨게함 new Exception에 쓴 코드를
        // catch에서 잡아서 출력
        System.out.println("----");


        // finally  오류가 있어도 없어도 무조건 실행됨
        try {
            System.out.println("택시의 문을 연다");
            throw new Exception("휴무 택시");
        } catch (Exception e) {
            System.out.println("!! 문제발생 : " + e.getMessage());
        } finally {
            System.out.println("택시의 문을 닫는다.");
        }

        System.out.println("다음 줄 실행");

        // try + catch(여러번가능)
        // try + catch(여러번가능) + finally
        // try + finally
        // try 단독으로 사용불가
        System.out.println("----");

        // try와 finally만 썼을때
        try {
            System.out.println(3 / 0);

        } finally {
            System.out.println("catch없이 finally작동");
        }
        System.out.println("잘 빠져나왔다");
        // 오류가 있어도 finally 는 작동하지만 다음줄 코드는 실행 안됨




    }
}
