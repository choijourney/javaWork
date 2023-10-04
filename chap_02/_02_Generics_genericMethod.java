package chap_02;

public class _02_Generics_genericMethod {
    public static void main(String[] args) {
        // 제네릭스 generics  같은기능을 하는 메서드를 여러개를 쓰지않게
        // 많은 타입을 하나의 메서드로 쓸수있음
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};
// 기본참조형인 int,double은 제네릭스메서드로 바로 사용할수없다. Integer, Double로 반환을
//해줘야한다.( wrapper클래스)  자료참조형인 String은 바로 제네릭스 사용가능하다

        printintArray(iArray);
        printdArray(dArray);
        printsArray(sArray);


        System.out.println("------");

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    // T : Type 의 T  제네릭스 메서드 - 어떤 타입이든 다받아주는 메서드
    private static <T> void printAnyArray(T[] array) {
        for (T t : array                ) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void printsArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printdArray(Double[] dArray) {
        for (double d : dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    private static void printintArray(Integer[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
