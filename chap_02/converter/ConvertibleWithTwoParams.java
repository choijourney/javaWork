package chap_02.converter;
@FunctionalInterface    // 메서드 하나만 쓸수있음
public  interface ConvertibleWithTwoParams {
    void convert(int USD, int KRW);
}
