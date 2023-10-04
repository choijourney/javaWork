package chap_02.converter;
@FunctionalInterface
public interface Convertible {
    void convert(int USD);  // 인터페이스 메서드는 자동으로 추상메서드

    // void convert2(int EUR);  FunctionalInterface에는 메서드를 두개이상쓰면 오류남
}
