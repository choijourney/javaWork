package chap_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _11_QuizStream {
    public static void main(String[] args) {
        // 입장료는 1인당 5000원
        // 20세 이상 손님들에게만 입장료부과. 그외무료

        List<Customer> customerList = new ArrayList<>();
        customerList = Arrays.asList(new Customer("챈들러", 50)
                , new Customer("레이첼", 42),
                new Customer("모니카", 21),
                new Customer("벤자민", 18),
                new Customer("제임스", 5));

        System.out.println("미술관 입장료");
        System.out.println("------------");

//
//        customerList.stream().filter(age -> age.age >= 20)
//                .map(age -> age.name + " 5000원")
//                .forEach(System.out::println);
//
//
//        customerList.stream().filter(age -> age.age < 20)
//                .map(age -> age.name + " 무료")
//                .forEach(System.out::println);

        customerList.stream().map
                (x->x.age>=20 ? x.name+ " 5000원" : x.name+ " 무료")
                .forEach(System.out::println);

    }
}


class Customer {
    String name;
    int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;

    }



}