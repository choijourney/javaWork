package chap_02;

public class _13_TryWithResources_customException {
    public static void main(String[] args) {

        // try with resources
        // DB커넥션을 열거나 파일을 열었을때 꼭 닫아줘야한다

        MyFileWriter writer1 = null;
        try {
            writer1 = new MyFileWriter();
            writer1.write("아이스크림이 먹고싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer1.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        // writer1.close(); 만 쓰려고 하니까 예외처리를 하라고 떠서 alt+enter 한뒤
        // try catch문을 씀

        System.out.println("----");


        // finally 에서 close를 쓸필요없이 자동으로 close 되는방법
        // try에 AutoCloseable를 implements한 객체를 넣어줌
        try (MyFileWriter writer2 = new MyFileWriter()) {
            writer2.write("빵이 먹고싶다");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 빵이 먹고싶다 파일을 자동으로 닫습니다. 출력

        // AutoCloseable 인터페이스를 구현하는 객체를 try인수에 넣어주면
        // 자동으로 close메서드 실행됨
        System.out.println("----");


        // 사용자 정의 예외 Custom Exception
        // 예외클래스를 만들어서 사용할수있다 
        // AgeLessThan19Exception 클래스를 만들어 씀
        int age = 17;
        try {
            if (age < 19) {
                // throw new Exception("만 19세 미만에게는 판매하지않습니다.");
                throw new AgeLessThan19Exception("만 19세 미만에게는 판매하지않습니다.");
            } else {
                System.out.println("주문하신 상품 여기 있습니다.");
            }
        } catch (AgeLessThan19Exception e) {
            System.out.println(e.getMessage()+ " 조금 더 성장하고 오세요.");
        } catch (Exception e) {
            System.out.println("모든 예외를 처리합니다.");
        }


    }

}


class MyFileWriter implements AutoCloseable { // 자동으로 파일을닫아주는 인터페이스

    @Override
    public void close() throws Exception {     //파일을 닫아주는 메서드
        System.out.println("파일을 자동으로 닫습니다.");
    }  // alt+shift+enter 입력해서 구현할 메서드를 가져옴

    public void write(String line) {    // 파일을 쓰는 메서드
        System.out.println("파일에 내용을 입력합니다.");
        System.out.println("입력 내용 : " + line);
    }
}


// 사용자정의 예외 클래스 /   예외를 만들때는 Exeption을 상속받는다
class AgeLessThan19Exception extends Exception {
    public AgeLessThan19Exception(String message) {
        super(message);  //alt+insert로 생성자를 만들때 생성자가 여러개가 있는데
    }                   // 그중 문자열인수를 받는 생성자를 만듦
}