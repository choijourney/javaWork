package chap_02;

import java.io.File;
import java.io.IOException;

public class _23_Output_souf_createNewFile_Folder_mkdir {
    public static void main(String[] args) {
        // System.out.format();
        // System.out.printf();
        // 문자열 출력을 좀더 고급스럽게해줌
        
        // souf
        System.out.println("--정수--");
        System.out.printf("%d%n", 1);  // 1
        // 정수 %d  /줄바꿈 %n

        System.out.printf("%d %d %d%n", 1,2,3); // 1 2 3
        System.out.printf("%d%n", 1234); // 1234
        System.out.printf("%6d%n",1234); // __1234
        // 6자리 공간을 확보후 1234
        System.out.printf("%06d%n",1234); // 001234
        // 6자리 공간을 확보후 빈자리는 0으로 채우고 1234
        System.out.printf("%6d%n",-1234); // _-1234
        // 6자리 공간 확보후 -1234
        System.out.printf("%+6d%n",1234); // _+1234
        // 6자리 공간 확보후 +1234 (항상기호)
        System.out.printf("%,12d%n",10000000); // __10,000,000
        // 12자리 공간 확보후 세자리마다 콤마
        System.out.printf("%-6d%n",1234); // 1234__
        // 6자리 확보후 왼쪽정렬 1234


        System.out.println("--실수--");
        System.out.printf("%f%n",Math.PI); // 3.141593
        System.out.printf("%.2f%n",Math.PI); // 3.14
        // 소수점 2자리까지만출력 3자리에서 반올림
        System.out.printf("%6.2f%n",Math.PI); // __3.14
        // 6자리 공간 확보후 소수점 둘째자리까지 출력
        System.out.printf("%-6.2f%n",Math.PI); // 3.14__
        // 6자리 공간 확보후 왼쪽정렬
        System.out.printf("%06.2f%n",Math.PI); // 003.14
        // 6자리 공간 확보후 빈공간 0으로 채우기
        System.out.printf("%+6.2f%n",Math.PI); // _+3.14
        // 6자리 확보후 +기호 (항상기호표시)


        System.out.println("--문자열--");
        System.out.printf("%s%n","java"); // java
        System.out.printf("%6s%n", "java"); // __java
        System.out.printf("%-6s%n", "java"); // java__
        System.out.printf("%6.2s%n", "java"); // ____ja
        System.out.printf("%-6.2s%n", "java"); // ja____


        System.out.println("--응용--");
        System.out.println("이름      영어   수학   평균"); // 6칸 3칸 3칸 띄어씀
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호",90,95,95.5);
        System.out.printf("%-6s %4d %4d %6.1f%n", "서태웅",70,95,90.5);
        System.out.printf("%-6s %4d %4d %6.1f%n", "채치수",80,95,99.5);
        // %6.1f%n  : 6칸 확보후 오른쪽정렬 소수점 한자리까지 출력(둘째자리에서반올림)


        System.out.println("--참고--");
        System.out.println("ABCDEFG");
        System.out.println("가나다라마바사");
        System.out.println("가 나 다 라");
        // 위 문자들은 모두 7자리지만 영어,한글,띄어쓰기에따라 자리크기가 다름



        // 파일 File
        String fileName = "_23_test.txt";
        File file = new File(fileName);
        // File 객체만들어서 인수에 fileName넣기

        try {
            file.createNewFile();   // 파일 생성
            if(file.exists()){      // 파일이 존재하면
                System.out.println("파일 이름 : "+ file.getName());
                System.out.println("파일 절대경로 : "+ file.getAbsolutePath());
                System.out.println("파일 크기(byte) : "+ file.length());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//      .createNewFile() 은 파일생성 메서드. try catch 필수

//        javaWorkSpace 밑에 _23_test.txt 파일 생김

//        파일 이름 :  file.getName();
//        파일 절대경로 : file.getAbsolutePath();
//        파일 크기(byte) : file.length();
//        파일크기는 숫자하나당 1 byte



        // Folder 폴더한개 생성  mkdir
        String foloderName = "A";
        File folder = new File(foloderName);
        folder.mkdir();
        if(folder.exists()){
            System.out.println("절대 경로 : "+folder.getAbsolutePath());
        }
        // javaWorkSpace 밑에 A폴더 생김


        // 하위폴더 여러개 생성 mkdirs
        foloderName="A/B/C";    // A 밑에 B 밑에 C 하위폴더
        File folder2 = new File(foloderName);
        folder2.mkdirs();
        if(folder2.exists()){
            System.out.println("절대경로: "+ folder2.getAbsolutePath());
        }

        // 보통 "A/B/C"; 슬래시로 써도 만들어지는데 가끔 안만들어지는경우에
        // 윈도우는 c:\\Users\\Nacoding\\Desktop  역슬래시를 쓰면되고
        // 맥은 /Users/Nadocoding/Desktop
        // "A" + File.separator + "B" + File.separator + "C" 이게가장정확




    }
}
