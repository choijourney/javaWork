package chap_01.camera;

public class ActionCam extends Camera{
    public final String lens;  // 광각렌즈 값을 고정하기위해 final을 씀
 // public final String lens = "광각 렌즈" 이렇게 써도되고 
    public ActionCam(){         //생성자 안에 써도 된다
        super("액션 카메라");
        lens = "광각 렌즈";      
    }
    // 생성자는 객체가 만들어지자마자 같이 만들어지기때문에 lens 값을 생성자에 넣어도됨

    public void makeVideo(){
        System.out.println(this.name+ ":" 
                + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다");
    }
}
