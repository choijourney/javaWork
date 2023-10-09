package chap_02;

public class _21_QuizThread_isAlive {
    public static <Set1> void main(String[] args) {
        // 상품 A와 B로 이루어진 세트 상품을 효율적으로 포장하는 프로그램
        // 상품 A와 B는 각각 5개씩 준비
        // A와 B는 두사람이 독립적으로 준비
        // A와 B가 모두 준비된 이후 세트 상품 포장 시작
        // 포장이 필요한 세트 상품은 총 5개
       // name + " 상품 준비 " + num + "/5"

        Runnable runnableA = ()->{
            for (int i = 1; i < 6; i++) {
                System.out.println("A 상품 준비 "+ i + "/5");
            }
            System.out.println("--A 상품 준비 완료--");
        };

        Runnable  runnableB = ()->{
            for (int i = 1; i < 6; i++) {
                System.out.println("B 상품 준비 " + i + "/5");
            }
            System.out.println("--B 상품 준비 완료--");
        };

        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);

        threadA.start();
        threadB.start();

        while (threadA.isAlive() || threadB.isAlive()){

        }   // threadA나 B가 작동하는동안 기다렸다가 다음줄실행
            // .isAlive() 작동하면 true 반환

        Runnable set1 = ()->{
            System.out.println("==세트 상품 포장 시작==");
            for (int i = 1; i < 6; i++) {
                System.out.println("세트 상품 포장 " + i + "/5");
            }
            System.out.println("==세트 상품 포장 완료==");
         };

        Thread threadSet = new Thread(set1);
        threadSet.start();

    }
}
