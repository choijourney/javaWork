package chap_02;

public class _15_Quiz11TryCatch {
    public static void main(String[] args) {
        // 발생 가능 문제 2가지 조건 : 상품구매가능시간 , 상품매진
        // 각 문제에대한 사용자 정의 예외 클래스 작성
        // 에러 코드에 따른 의도적 예외 발생 및 예외 처리 (throw)
        // 코드 0 이면 상품구매완료  1이면 상품구매가능시간아님  2면 상품매진

//        int time = 20;
//        int productNum = 0;
//
//        try {
//            if (time >= 20 && productNum > 1) {
//                System.out.println("상품 구매를 완료하였습니다");
//            } else if (time < 20) {
//                throw new timeOver("상품 구매 가능 시간이 아닙니다.");
//            } else if (productNum == 0) {
//                throw new soldOut("해당 상품은 매진되었습니다.");
//            }
//        } catch (timeOver e) {
//            System.out.println(e.getMessage() + "\n상품 구매는 20시부터 가능합니다.");
//
//        } catch (soldOut e) {
//            System.out.println(e.getMessage() + "\n다음 기회에 이용해주세요.");
//        }

        int errorCode= 2;
       try{
           if(errorCode==0){
               System.out.println("상품 구매를 완료하였습니다.");
           } else if (errorCode==1) {
               throw new TimeOverException("상품 구매 가능 시간이 아닙니다.");
           } else if (errorCode==2) {
               throw new SoldOutException("해당 상품은 매진되었습니다.");
           }
       }catch (TimeOverException e){
           System.out.println(e.getMessage()+ "\n상품 구매는 20시부터 가능합니다.");
       }catch (SoldOutException e){
           System.out.println(e.getMessage());
           System.out.println("다음 기회에 이용해주세요.");
       }



    }
}

class TimeOverException extends Exception {     // 사용자정의 예외 클래스 extends Exception 필수
    public TimeOverException(String message) {  // 메시지 적는 생성자
        super(message);

    }
}

class SoldOutException extends Exception {
    public SoldOutException(String message) {
        super(message);
    }
}