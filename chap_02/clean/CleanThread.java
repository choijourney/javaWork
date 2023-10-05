package chap_02.clean;

public class CleanThread extends Thread{
    //동시에 작업을 하기위해 쓰레드를 쓰는데 쓰레드를 쓰려면 Thread를 상속받는다
    public void run(){
        System.out.println("--직원 청소 시작 (Thread)--");
        for (int i = 2; i <= 10; i+=2) { // 2,4,6,8,10번방 청소할거임
            System.out.println("(직원) " + i + "번방 청소 중 (Thread)");
        }
        System.out.println("--직원 청소 끝 (Thread)--");
    }

}
