package chap_02;

public class _18_MultiThread {
    public static void main(String[] args) {
        // 익명클래스를 이용해 메인메서드 안에서 쓰레드 여러개 만들기

        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("--직원1 청소 시작 --");
                for (int i = 1; i <= 10; i += 2) {
                    System.out.println("(직원1) " + i + "번방 청소 중");
                    try {
                        Thread.sleep(1000); //1초 기다렸다가 다음코드실행
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("--직원1 청소 끝 --");
            }
        };

        // Runnable은 함수형인터페이스라 메서드가 하나다. 그래서
        // 람다식으로 쓰면 Runnable인터페이스의 run메서드가 실행됨
        Runnable cleaner2 = () -> {
            System.out.println("--직원2 청소 시작 --");
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("(직원2) " + i + "번방 청소 중");
                try {
                    Thread.sleep(1000); // 1초 기다렸다가 다음코드실행
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("--직원2 청소 끝 --");
        };

        // 그다음 쓰레드를 만들고 .start로 실행
        Thread cleanerThread1 = new Thread(cleaner1);
        Thread cleanerThread2 = new Thread(cleaner2);
        cleanerThread1.start();
        cleanerThread2.start();
        //직원1, 직원2 동시에 청소함


    }
}
