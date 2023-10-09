package chap_02;

import chap_02.clean.CleanRunnable;
import chap_02.clean.CleanThread;

public class _16_Thread_Runnable {
    public static void main(String[] args) {
        // 쓰레드 동시에 어떤 작업을 하기위해 쓰레드를 씀
        // 자바는 기본이 단일 쓰레드인데 쓰레드를 설정할수있다

        // 1 3 5 7 9    호텔청소중인데 이쪽은 사장청소
        // 2 4 6 8 10   이쪽은 직원청소

        CleanThread cleanThread = new CleanThread();  // 쓰레드 객체를 만든뒤
        cleanThread.start(); // 직원 청소   .start()를 쓰면 쓰레드 작동

        cleanByBoss();  // 사장 청소
        // 직원 청소, 사장 청소를 함께 한다. 순서는 항상 랜덤으로 섞인다.


        System.out.println("----");

        // Runnable 러너블
        // 쓰레드와 똑같은 기능인데 쓰레드는 클래스를 상속받고
        // 러너블은 인터페이스를 구현한다
        // 여러 부모를 상속받아야 하는 경우엔 러너블을 쓴다
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();
        cleanByBoss();




    }

    public static void cleanBySelf() {
        System.out.println("--혼자 청소 시작--");
        for (int i = 1; i <= 10; i++) {
            System.out.println("(혼자) " + i + "번방 청소 중");
        }
        System.out.println("--혼자 청소 끝--");
    }

    public static void cleanByBoss() {
        System.out.println("--사장 청소 시작--");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("(사장) " + i + "번방 청소 중");
        }
        System.out.println("--사장 청소 끝--");
    }
}
