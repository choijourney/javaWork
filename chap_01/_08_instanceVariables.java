package chap_01;

public class _08_instanceVariables {
    public static void main(String[] args) {

        // 클래스

        String monelName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";
        // 블랙박스를 만들고있다. 이 내용들을 타입이 달라서 배열에 한번에 넣을수 없다.
        // 이럴 때 class 를 쓴다.

        BlackBox bbox = new BlackBox();
        bbox.modelName = "하양이";
        bbox.resolution = "UHD";
        bbox.price = "300000";
        bbox.color = "화이트";
        // BlackBox 클래스로부터 bbox 객체 생성
        // bbox 객체는 BlackBox 클래스의 인스턴스

        System.out.println(bbox.modelName);
        System.out.println(bbox.resolution);
        System.out.println(bbox.price);
        System.out.println(bbox.color);

        BlackBox b1 = new BlackBox();
        b1.modelName = "그레이";
        System.out.println(b1.modelName);
        // b1 이라는 BlackBox의 인스턴스를 하나 더생성

        BlackBox b2 = new BlackBox();
        b2.modelName = "초록이";
        System.out.println(b2.modelName);

        // 특정 범위를 초과하는 충돌 감지 시 자동 신고 기능 개발 여부
        System.out.println("- 개발 전 -");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);

        // 기능 개발
        BlackBox.canAutoReport = true;  // 원래 false였는데 true로 바꿔줌

        System.out.println("- 개발 후 -");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);
        // b1.canAutoReport 같이 인스턴스에 클래스변수를 쓰는것보다
        // BlackBox.canAutoReport 권장


        BlackBox.canAutoReport = false; // false로 다시 바꿔줌
        b1.autoReport(); // 자동 신고 기능 메서드 지원 안됨
        BlackBox.canAutoReport = true;
        b1.autoReport(); // 지원 됨

        b1.insertMemoryCard(256); // 메모리카드 용량 알려주는 메서드

        // 일반 영상 : 1 타입
        // 이벤트 영상 (충돌감지) : 2 타입
        int fileCount = b1.getVideoFileCount(1); // 일반 영상
        System.out.println("일반 영상 파일 수 : " + fileCount+ "개");

        fileCount = b1.getVideoFileCount(2); // 이벤트 영상
        System.out.println("이벤트 영상 파일 수 : " + fileCount+ "개");


    }
}
