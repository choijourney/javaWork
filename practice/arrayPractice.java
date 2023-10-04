package practice;

public class arrayPractice {




    public static void main(String[] args) {



        // 가로 10 * 세로 15 영화관 좌석 만들기
//
//String[][] seats = new String[10][15];
//String[] eng =  {"A","B","C","D","E","F","G","H","I","J"};
//        for (int i = 0 ; i < 10; i++) {
//            for (int j = 0; j < 15; j++) {
//
//               seats[i][j] = eng[i]+ (j+1) + " ";
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < seats.length; i++) {
//            for (int j = 0; j < seats[i].length; j++) {
//                System.out.print(seats[i][j] + " ");
//            }
//            System.out.println();
//        }


//String [][] seat = new String[10][15];
//char c = 'A';       // 아스키코드 를 이용하기. char 에 연산 ++ 을써서 ABC 자동출력되게함
//
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 15; j++) {
//                seat[i][j]=String.valueOf(c) + (j+1) + " ";
//                System.out.print(seat[i][j]);
//            }       // char를 valueOf로 String으로 변환
//            System.out.println();
//            c++;
//        }


//
//        // 왼쪽 삼각형 별 만들기
//        String[][] star = new String[6][6];
//
//
//        for (int i = 1; i < star.length; i++) {
//            for (int j = 0; j < i; j++) {
//                star[i][j]= "*";
//                System.out.print(star[i][j]);
//            }
//            System.out.println();
//        }


// 배열을 이용해 쇼핑몰에서 구매가능한 신발사이즈를 출력하는 프로그램을 작성해라
// 신발사이즈는 250~ 295까지  사이즈는 5단위   사이즈수는 총 10가지

//        int[] shoe = new int[10];
//        int shoe1 = 250;
//        for (int i = 0; i < 10; i++) {
//            shoe[i] = shoe1;
//            System.out.println(shoe[i]);
//            shoe1 += 5;
//        }



//        System.out.println(secret("나코딩", 1));
//        System.out.println(secret("990130-111111", 8));
//        System.out.println(secret("010-1234-1111", 9));
    }

    // 개인정보중 일부를 비공개로 전환하는 메서드 만들기
// 나코딩 - 나**  990130-1*****  010-1234-****
//
//   static String secret(String info, int num) {
//        String st = info.substring(0, num);  // info의 앞부분만 자름. "나"
//        for (int j = num; j < info.length(); j++) {
//            st+= "*";   // "나" + "**"
//        }
//        return st;
//    }


}


