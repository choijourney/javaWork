package chap_02.clean;

public class Room {
    public int number = 1;
    synchronized public void clean(String name){
        // 직원 1 : 3번방 청소중
        System.out.println(name+ " : " + number + "번방 청소중");
        number++;
    }
    // 동기화 : clean 메서드를 어떤 쓰레드가 쓰고있는동안 다른 쓰레드는
    // 접근할수 없게 한다

}
