package chap_02.converter;

public class KRWConverter implements Convertible{   // 추상클래스를 구현하는 클래스
    @Override
    public void convert(int USD) {
        System.out.println(USD +" 달러 = "+ (USD*1400) + " 원");
    }
}
