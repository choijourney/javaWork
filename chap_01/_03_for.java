package chap_01;

public class _03_for {
    public static void main(String[] args) {

        // 반복문 for (fori 적고 엔터 치면 자동완성)
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i); //ln지우고 print만쓰면 줄바꿈안함
        }  //02468 짝수 출력

        System.out.println();  //print 사이에 줄바꿈해주기 위해 씀

        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        } //13579 홀수 출력

        System.out.println();  //줄바꿈

        // 거꾸로 숫자 5,4,3,2,1
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        } //5,4,3,2,1출력

        System.out.println();

        // 1부터 10까지 수들의 합
        int total = 0;
        for (int j = 1; j < 11; j++) {
            total += j;
            System.out.println("여기에 sout쓰면 더하는 과정을 보여줌" + total);
        }
        System.out.println(total); //여기는 총합만 나옴 55


        // 반복문 while  조건문이 참 일동안 실행문을 실행한다.
        // 수영장에서 수영하는 모습
        int distance = 25; //전체거리 25m
        int move = 0; //현재 이동 거리 0m
        int height = 2; // 키 2m
        while (move + height < distance) {
            System.out.println("현재 이동거리: " + move);
            move += 3;
        }
        System.out.println("도착했습니다");

        System.out.println("---반복문 #1---");

        // 키가 엄청나게 큰 사람?
        move = 0;
        height = 25; // 키 25m
        while (move + height < distance) {
            System.out.println("현재 이동거리: " + move);
            move += 3;
        }
        System.out.println("도착했습니다");
        //이 사람은 조건이 false라 한번도 실행문을 실행하지 않는다.

        System.out.println("---반복문 #2 ---");

        // Do while 반복문
        do {
            System.out.println("현재 이동거리: " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착했습니다.");
        // 조건이 false여도 do를 써서 실행문을 한번 실행시킨다
        // 그다음 while문의 조건을 확인한 후 true면 do의 실행문을 실행한다


        // 중첩 for
        for (int i = 0; i < 5; i++) {   // 사각형 5*5 별 만들기
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();  //줄바꿈을 위함
        }

        for (int i = 0; i < 5; i++) {   // 왼쪽 삼각형 별 만들기
            //for (int j = 0; j < i+1; j++) {
            for (int j = 0; j <= i; j++) {  // 0,1,2,3,4
                System.out.print("*");
            }
            System.out.println();  //줄바꿈을 위함
        }

        for (int k = 0; k < 5; k++) {    // 오른쪽 삼각형 별 만들기
            for (int l = 0; l < 4 - k; l++) {
                System.out.print(" ");
            }
            for (int m = 0; m < k + 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 구구단 만들기
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }

        // for문에서 break 쓰기
        int max = 20;
        for (int k = 1; k <= 50; k++) {
            System.out.println(k + "번 손님 주문하신 치킨 나왔습니다.");
            if (k == max) {
                System.out.println("금일 재료 소진 됐습니다.");
                break; //브레이크를 써서 반복문 탈출. 20마리까지 판매하고 영업종료
                // 브레이크없으면 반복문 계속진행. 50마리까지 판매.
            }
        }
        System.out.println("영업 종료합니다.");

        // 위와 같은 식 while문 break로 쓰기
        int index = 1; // 손님 대기 번호
        while (index <= 50) {
            System.out.println(index + "번 손님 주문하신 치킨 나왔습니다.");
            index++;
            if (index == max) {  //max값은 저위에있음
                System.out.println("금일 재료 소진 됐습니다.");
                break;
            }
        }

        // continue  컨티뉴를 만나면 다음실행문을 실행하지않고 첫줄로 감
        max = 20; // 최대 판매가능한 치킨 수량
        int sold = 0; // 현재 치킨 판매수량
        int noShow = 17; //대기번호 17번 손님 노쇼

        for (int l = 1; l <= 50; l++) {
            System.out.println(l + "번 손님 주문하신 치킨 나왔습니다.");

            if (l == noShow) {
                System.out.println(l + "번 손님 노쇼로 다음 손님께 치킨드리겠습니다");
                continue;  //컨티뉴가 나오면 다음 실행문을 건너뛰고 처음줄로 간다
            }  // 그래서 sold에 플러스가 안되고 21번 치킨까지 판매.
            sold++;
            if (sold == max) {
                System.out.println("금일 재료 소진 됐습니다.");
                break;
            }
        }
        // while로 위 식을 씀
        index = 1;  //손님 대기번호
        sold = 0;  //현재 치킨 판매수량
        while (index <= 50) {
            System.out.println(index + "번 손님 주문하신 치킨 나왔습니다");
            index++;  // index+1을 해야하는데 continue보다 아래에있으면
            //코드가 실행이 안되니까 continue보다 위에씀
            if (index == noShow) {
                System.out.println(index + "번 손님 노쇼입니다 자 다음손님~");
                continue;
            }
            sold++;

            if (sold == max) { //max는 저위에있음 20
                System.out.println("재료가 소진됐습니다");
                break;
            }
        }

        // 퀴즈 조건문을 활용해 주차 요금 정산 프로그램 만들기
        int hour = 10;
        int price = hour * 4000;
        boolean isSmallCar = false; //경차여부
        boolean withDisPerson = false; // 장애차량 여부

        if (price > 30000) {
            price = 30000;
        }
        System.out.println("주차 요금은 " + (price) + "원 입니다");

        if (!isSmallCar || !withDisPerson) {
            System.out.println("주차 요금은 " + (price / 2) + "원 입니다");
        }



    }
}

