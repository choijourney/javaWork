package practice;

public class shoppig {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.pickClothes("빨강색 긴팔");
        shop.pickClothes("벨벳 긴팔");
        shop.pickClothes("그레이 긴팔");

        shop.pickThings("핑크별모자");


        if (shop.getCount() > 50) {
            shop.pickClothes();
        } else shop.limit();

        System.out.println("-----");

        shop.setCount(40);
        System.out.println(shop.getCount());
        shop.strickLimit();

        shop.strickLimit("흑청바지");
        shop.strickLimit("진주가방");
        shop.strickLimit("03핑크 틴트");
        shop.strickLimit("가죽자켓");

        shop.setCount(50);

        shop.strickLimit("검정 워커");
    }
}


class Shop {
    String clothes;
    int pickNum;


    int count = 0;
    boolean withCar;

    Shop(String clothes, int pickNum, boolean withCar) {
        this.clothes = clothes;
        this.pickNum = pickNum;
        this.withCar = withCar;
        System.out.println("스타필드왔다!!!.!!.!! ^ㅇ^");

    }

    Shop() {
        this("핑크색 긴팔", 1, false);

    }

    void pickClothes(String clothes) {
        ++count;
        System.out.println(clothes + " " + pickNum + "개 주세요 (산 옷 개수: " + count + " )");

    }

    void pickClothes() {
        pickClothes("핑크색 긴팔");
    }  //메서드 오버로딩 , 라이딩

    String pickThings(String clothes) {
        ++count;
        String st = clothes + " " + this.pickNum + "개 주세요 (산 옷 개수: " + count + " )";
        System.out.println(st);
        return st;

    }

    void limit(int count) {
        if (!withCar && (this.count > 50 || count > 50)) {
            System.out.println("차없으니까 그만사");

        }
    }

    void limit() {

        count = 50;
        System.out.println("차없으니까 그만사");

    }

    void strickLimit() {
        if (getCount() < 50) {
            pickClothes();
        } else limit();
    }

    void strickLimit(String clothes) {
        if (getCount() < 50) {
            pickThings(clothes);
        } else limit();
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public int getPickNum() {
        return pickNum;
    }

    public void setPickNum(int pickNum) {
        this.pickNum = pickNum;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isWithCar() {
        return withCar;
    }

    public void setWithCar(boolean withCar) {
        this.withCar = withCar;
    }


}