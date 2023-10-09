package chap_02;

import java.io.*;

public class _24_listFiles_BufferedReader_BufferedWriter_Delete {
    public static void main(String[] args) {
        // 파일과 폴더 조회

        //String folder = ".";  // .은 현재경로 javaWorkSpace
        //String folder = "C:\\Users\\wlgus\\OneDrive\\바탕 화면\\javaWorkSpace\\src\\chap_01"; // chap_01의 절대경로
        String folder = "src/chap_01";  // 상대경로
        File filesAndFolders = new File(folder);
        System.out.println("현재 폴더 경로 : " + filesAndFolders.getAbsolutePath());
        for (File file : filesAndFolders.listFiles()) {
            if (file.isFile()) {  // 파일이면
                System.out.println("(파일) " + file.getName());
            } else if (file.isDirectory()) {  // 폴더면
                System.out.println("(폴더) " + file.getName());
            }

            // 패키지의 절대경로 가져오기
            // 패키지 오른쪽마우스 클릭 - 경로참조 (copy path reference) 클릭 -
            // 절대경로 (Absolute Path) 클릭

        }

        // .listFiles() 파일과 폴더를 모두 보여줌
        // .getName() 파일이름 보여줌


        // 파일 쓰기
        // BufferedReader : 파일에서 내용을 읽어올때
        // BufferedWriter : 파일에 내용을 쓸때
        // buffer는 데이터를 한곳에서 다른곳으로 보낼때 잠시 보관하는곳

        // FileWriter fw = new FileWriter("goodJob");
        //fw는 한번만 쓸거라 없애고 new FileWriter("goodJob") 를 BufferedWriter인수에 쓴다
        // 파일은 쓰고나서 닫아줘야한다 자동으로 닫아주기 위해서 try()인수에 쓴다 tryWithResources

/*
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("goodJob.txt", true))) {
            // 디폴트는 덮어쓰기인데 FileWriter 두번째 인수에 true를 쓰면 추가된다
           // bw.write("이제 거의 끝이 보여요.");
           // bw.newLine();
           // bw.write("끝이 아닌거 같아요");
            bw.write("언제 끝이날까.."); // 파일에 글쓰기
            bw.newLine();   // 줄바꿈
            bw.write("취업하고싶다..");
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/

        // 파일 읽기

        try (BufferedReader br = new BufferedReader(new FileReader("goodJob.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {  // 읽을 값이 있으면
                System.out.println(line);
                // line= br.readLine() 한줄 불러오고 그 줄을 line에 저장
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // 파일 삭제 .delete()

        File file = new File("test.txt");
        if (file.exists()) { // 파일이 존재하면
            if (file.delete()) {  // .delete는 불리언이라 if()인수값에 쓸수있음
                System.out.println("파일 삭제 성공 : " + file.getName());
            } else {
                System.out.println("파일 삭제 실패 : " + file.getName());
            }
        }

        File folder1 = new File("A");
        if (folder1.exists()) {
            if (folder1.delete()) {
                System.out.println("폴더 삭제 성공 : " + folder1.getAbsolutePath());
            } else {
                System.out.println("폴더 삭제 실패 : " + folder1.getAbsolutePath());
            }
        }
        // A 폴더한테 하위폴더들이 있어서 삭제 불가. 이럴땐 하위폴더 먼저 삭제하면됨
        // "A/B/C" 이렇게 적어야 C 삭제됨
        // 아니면 하위폴더까지 모두 삭제하는 메서드를 만들어 쓸수있음

        if (deleteFolder(folder1)) {    // deleteFolder메서드 호출(불리언메서드)
            System.out.println("*폴더 삭제 성공 : " + folder1.getAbsolutePath());
        } else {
            System.out.println("*폴더 삭제 실패 : " + folder1.getAbsolutePath());
        }


    }

    // if문 인수로 쓰려면 불리언 값이어야 하니까 불리언메서드를 만듦
    public static boolean deleteFolder(File folder) { // 인수에 A를 넣으면
        if (folder.isDirectory()) {     // 폴더가 존재하면
            for (File file : folder.listFiles()) {  // A폴더의 리스트를 file에저장
                deleteFolder(file); // A의 하위폴더 B가 deleteFolder(B) 인수로.
            }   // 다시 첫줄로가서 B의 하위폴더를 찾고 C 가오는데 C는 하위폴더가 없어서
        }       // for문을 탈출하고 삭제됨. 그다음 열려있던 B삭제 -> A삭제
        System.out.println("삭제 대상 : " + folder.getAbsolutePath());
        return folder.delete();
    }





}
