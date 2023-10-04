package chap_02.detector;

public interface Detectable {
    String name= "감지자";
    //public static final String name 안보이지만 있음
    void detect();  // 감지  메서드 뼈대만듦
    // public abstract void detect();  인터페이스에는
    // 앞에 public abstract가 안보이지만있음
}
