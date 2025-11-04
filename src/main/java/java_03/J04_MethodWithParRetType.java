package java_03;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class J04_MethodWithParRetType {

    public static void main(String[] args) {

        System.out.println(generateRandomDatas("number"));

    }

    public static List<String> generateRandomDatas(String dataType){


        List<String> data = new ArrayList<>();

        Faker faker = new Faker();
        for (int i = 0; i < 5; i++) {

            if (dataType.equals("name")) {
                data.add(faker.name().fullName());
            } else if (dataType.equals("number")) {
                data.add(faker.number().numberBetween(1,1000)+"");
            }

        }
        return data;
    }
}
