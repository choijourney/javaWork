package chap_01;

public class _06_mainMethod {
    public static void main(String[] args) {
        // 메인 메서드  알고보니 string배열을 인수로 받는 main 메서드였다
        // 맨위에 current File 을 펼쳐보면 edit configurations 클릭
        // Application 클릭 실행할 파일을 정하고 그밑줄에
        // 실행할 내용을 적는다  name 변경도 가능하다
        // 이번 테스트에선 name을 Test로 했고 그랬더니 currentFile이 Test로바뀌었다
        // 실행할 내용엔  테스트 전달값 입니다  라고 적었다
        for (String s:args) {
            System.out.println(s); // 테스트 전달값 입니다 출력
        }

        // 1.도서 조회  2.도서 대출 3.도서 반납
        if (args.length==1) {  // args 인수개수가 하나면
            switch (args[0]) { // 인덱스는 0 하나다
                case "1":
                    System.out.println("도서 조회 메뉴입니다.");
                    break;
                case "2":
                    System.out.println("도서 대출 메뉴입니다.");
                    break;
                case "3":
                    System.out.println("도서 반납 메뉴입니다.");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }
        } else{
                System.out.println("사용법) 1~3 중 하나를 입력해주세요.");
            }
        // test해보려면 edit configurations 클릭, 실행 내용에 1입력하고
        // 런누르면 1 도서 조회 메뉴입니다. 출력
        // 1 3 두값을 넣고 실행하면 사용법) 1~3 중 하나를 입력해주세요. 출력

        // 테스트를 끝내려면 Test를 누르고 delete하는 방법도있고
        // edit configurations 클릭 Test 위에 - 를 눌러도 삭제됨


    }
}
