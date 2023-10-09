package chap_02;

import java.io.*;
import java.util.Scanner;

public class _25_Quiz13BufferedReader_Scanner {
    public static void main(String[] args) {
        // 속담 퀴즈 프로그램을 작성하시오
        // 퀴즈 내용은 saying.txt라는 이름의 파일로 제공
        // 퀴즈는 문제와 정답이 각각 한줄로 구성 ( 퀴즈 3개인 경우 총 6줄)
        // 사용자로부터 값을 입력받아 정답여부 확인
        // 오답인 경우 정답 안내
        // 퀴즈 내용이 더이상 없을때까지 반복

//        String fileSaying = "src/chap_02/saying.txt";
//        File saying = new FileReader(fileSaying);
        try (BufferedReader bfs = new BufferedReader(new FileReader("src/chap_02/saying.txt"))) {
            System.out.println("속담 퀴즈 입니다. 빈칸에 알맞은 말을 입력하시오.  (주관식)");
            System.out.println("-------------------------------------------");
            
            String quiz ;
            String answer;
            String input;
            while (true) {
                quiz = bfs.readLine();   //첫번째줄은 quiz에저장
                answer = bfs.readLine(); //두번째줄은 answer에저장  모든줄을 읽고
                if(quiz==null ||answer==null ) { //  quiz나 answer에 저장할 값이없으면 브레이크
                    break;
                }
                
                System.out.println("(문제) " + quiz);
                Scanner sc = new Scanner(System.in);
                System.out.print("정답 입력 => ");
                input = sc.next();
                if (answer.equals(input)) {
                    System.out.println("정답입니다!!!\n");
                } else System.out.println("틀렸습니다. 정답은 " + answer + "입니다.\n");
            }

            System.out.println("---------------------------------------");
            System.out.println("모든 퀴즈가 완료되었습니다.");
            System.out.println("수고하셨습니다. ^^");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
