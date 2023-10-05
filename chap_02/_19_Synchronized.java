package chap_02;

import chap_02.clean.Room;

public class _19_Synchronized {
    public static void main(String[] args) {
        // 동기 synchronized

        // 직원 1,2가 방 호수를 정해놓지않고 10개 방을 5개씩 순서대로 청소

        Room room = new Room();

        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("--직원1 청소 시작 --");
                for (int i = 1; i <= 5; i++) {
                    room.clean("직원1");
                }
                System.out.println("--직원1 청소 끝 --");
            }
        };


        Runnable cleaner2 = () -> {
            System.out.println("--직원2 청소 시작 --");
            for (int i = 1; i <= 5; i++) {
                room.clean("직원2");
            }
            System.out.println("--직원2 청소 끝 --");
        };


        Thread cleanerThread1 = new Thread(cleaner1);
        Thread cleanerThread2 = new Thread(cleaner2);
        cleanerThread1.start();
        cleanerThread2.start();

        // clean메서드에 synchronized를 쓰지않으면
        // 직원 1,2가 1번방을 동시에 청소한다
        // 이럴때 clean메서드에 synchronized 를 써서 동기화를 시켜주면
        // 직원 1이 메서드를 쓰고있는동안 직원2는 접근하지못한다

        // 쓰레드를 여러개쓸때 한개가 예외됐을때 나머지 쓰레드는 정상 작동한다
        // 예를들어 직원1이 예외되더라도 직원2는 맡은코드를 끝낸다

    }
}
