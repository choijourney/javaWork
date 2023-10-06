package chap_02;

public class _20_QUiz12 {
    public static void main(String[] args) {
        // 상품 A와 B로 이루어진 세트 상품을 효율적으로 포장하는 프로그램
        // 상품 A와 B는 각각 5개씩 준비
        // A와 B는 두사람이 독립적으로 준비
        // A와 B가 모두 준비된 이후 세트 상품 포장 시작
        // 포장이 필요한 세트 상품은 총 5개

        ProductReady productReady = new ProductReady();
        Runnable runnableA = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    productReady.ready("A");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("-- A 상품 준비 완료 --");
            }
        };
        ProductReady2 productReady2 = new ProductReady2();
        Runnable runnableB = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    productReady2.ready("B");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("-- B 상품 준비 완료 --");
            }

        };

        Set setProduct = new Set();

        Thread thread = new Thread(runnableA);
        Thread thread1 = new Thread(runnableB);
        thread.start();
        thread1.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        setProduct.set();
    }
}

class ProductReady {
    int num = 1;

    public void ready(String name) {
        System.out.println(name + " 상품 준비 " + num + "/5");
        num++;
    }

}

class ProductReady2 {
    int num = 1;

    public void ready(String name) {
        System.out.println(name + " 상품 준비 " + num + "/5");
        num++;
    }
}

class Set {
    int num = 1;

    public void set() {
        System.out.println("== 세트 상품 포장 시작 ==");
        for (int i = 1; i <= 5; i++) {
            System.out.println("세트 상품 포장 " + num + "/5");
            num++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("== 세트 상품 포장 완료 ==");
    }
}