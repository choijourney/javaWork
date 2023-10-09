package chap_02;

import chap_02.clean.CleanRunnable;

public class _17_Join_ThreadSleep {
    public static void main(String[] args) {
        // join   비동기 then 같은 기능
        CleanRunnable cleanRunnable1 = new CleanRunnable();
        Thread thread1 = new Thread(cleanRunnable1);
        thread1.start();    // 직원 청소
        try {
        //    thread1.join();  // 직원청소 끝날때까지 기다렸다가
         thread1.join(2500); // 직원청소 2.5초동안 한후 사장청소
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        cleanByBoss();  // 사장 청소
        // .join 은 try catch 필수
        // thread1.join  -thread1 실행이 끝날때까지 기다렸다가 다음줄실행
    }

    // Thread.sleep(1000); 1초동안 기다렸다가 다음코드실행
    public static void cleanByBoss() {
        System.out.println("--사장 청소 시작--");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("(사장) " + i + "번방 청소 중");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("--사장 청소 끝--");
    }

}
