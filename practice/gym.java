package practice;

public class gym {
    public static void main(String[] args) {
        Gym gym = new Gym();
        System.out.println("-------");
        gym.setWeight(70, 13);
// setter는 설정하는거라 return이 필요없어서 void를 쓴다 return값이 없어서 sout안에 쓸수없다
        System.out.println("선생님 제 목표는! " + gym.getWeight() + "kg 입니다!");
        // getter는 return값이있어서 쓸수있다
        gym.setTrainer("KKR");
        System.out.println("오늘은 " + gym.getTrainer() + "쌤과 함께합니다~^-^");
    }
}

class Gym {
    String trainer;
    int numberOfTimes;
    int count = 1;
    int weight;


    int weightCount;
    String body;
    int dumbelWeight;


    Gym(String trainer, int numberOfTimes, int weight) {
        System.out.println("안녕하세요 오늘도 뿌셔볼까요?");
        this.trainer = trainer;
        this.numberOfTimes = numberOfTimes;
        this.weight = weight;

    }

    Gym() {
        this("KJK", 30, 70);
        System.out.println("오늘 수업은 김종국 트쌤과 함께합니다~^-^!");
        exercise("하체", 100);
        inbody(70, 2);
        bye(50);
    }


    void exercise(String body, int dumbelWeight) {
        System.out.println("오늘은 " + body + " 운동을 해볼까요?");
        System.out.println("와 무게 " + dumbelWeight + " 치셨네요 짝짝짝 잘하셨어요!!");
    }


    void inbody(int weight, int weightCount) {
        System.out.println("인바디 한번 재볼까요?");
        weight -= weightCount;
        System.out.println(weightCount + "만큼 빠져서 " + weight + "kg이네요");
        System.out.println("그래도 체지방은 더 빼셔야합니다.");
    }


    void bye(int numberOfTimes) {
        numberOfTimes -= count;
        System.out.println("오운완! 수고하셨습니다! 회원권 " + numberOfTimes + "번 남으셨습니다.");
    }


    void setWeight(int weight, int weightCount) {
        this.weight = weight - weightCount;

    }
//        public void setWeight(int weight) {
//        this.weight = weight;
//    }

    public int getWeight() {
        return weight;
    }   // 인수와 weight이 이름이 같을때 this를 씀


    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }


}