package chap_02;

import java.io.FileWriter;
import java.io.IOException;

public class _14_Throws {
    public static void main(String[] args)  {
        // throws 메서드를 호출한곳으로 예외를 던질 수 있다

        try {
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("메인 메서드에서 처리할게요.");
        }
        // writeFile에 빨간밑줄이 뜨면 눌러보면 '예외를 메서드 시그니처에 추가하기'
        // 가 있고 클릭하면 메서드 이름 옆에 throws IOException 이 생긴다
        // 그럼 다른 곳으로 예외를 던지는건데
        // 이번엔 여기서 try catch 로 예외를 처리할거다


    }


    public static void writeFile() throws IOException {
//        try {
//            FileWriter writer = new FileWriter("test.txt");
//            throw new IOException("파일 쓰기에 실패했어요!!");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("writeFile 메소드 내에서 자체 해결했어요");
//        }
        // FileWriter 파일을 쓰는 내장객체
        // throw를 던져서 catch에서 잡고 메시지 출력

        // 원래는 writeFile메서드 내에서 예외를 처리하는데
        // 예외를 호출한 클래스나 main에서 예외를 처리하게 할수 있다 ↓


        FileWriter writer = new FileWriter("test.txt");
        throw new IOException("파일 쓰기에 실패했어요!!");
        // FileWriter에 빨간밑줄이 뜨면 눌러보면 '예외를 메서드 시그니처에 추가하기'
        // 가 있고 클릭하면 메서드 이름 옆에 throws IOException 이 생긴다
        // 이러면 이 메서드에서 예외를 처리하는게 아니라 메서드를 호출한곳에서
        // 예외를 처리하게된다.


    }
}
