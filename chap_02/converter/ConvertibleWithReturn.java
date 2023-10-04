package chap_02.converter;
@FunctionalInterface
public interface ConvertibleWithReturn {
    int convert(int USD, int KRW);  // return값이있는메서드
}
