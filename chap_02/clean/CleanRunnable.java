package chap_02.clean;

public class CleanRunnable implements Runnable{

    // Thread.sleep(1000); 1초동안 기다렸다가 다음코드실행
    @Override
    public void run() {
        System.out.println("--직원 청소 시작 (Runnable)--");
        for (int i = 2; i <= 10; i+=2) { // 2,4,6,8,10번방 청소할거임
            System.out.println("(직원) " + i + "번방 청소 중 (Runnable)");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("--직원 청소 끝 (Runnable)--");
    }
}
