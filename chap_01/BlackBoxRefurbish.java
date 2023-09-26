package chap_01;

public class BlackBoxRefurbish {
    // 블랙박스 리퍼제품 전시제품을 할인해서 판매.
    String modelName; // 모델이름
    String resolution; // 화질
    private int price; // 가격   // private을 쓰면 price는 이클래스 안에서만 사용가능
    String color; //색상

//  getter와 setter 자동으로만들기 - 맨위 code 클릭 generate 클릭 getter, setter,
// getter와 setter 둘다 생성 선택지에서 선택후 클릭 변수 선택후 ok 클릭
// 자동생성하면 public이 자동생성돼있음
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <100000){
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
