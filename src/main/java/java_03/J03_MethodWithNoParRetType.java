package java_03;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;

public class J03_MethodWithNoParRetType {


    public static void main(String[] args) {

       int number= generateRandomNumber();

        System.out.println(number);

        System.out.println(generateRandomNames());
    }

    public static int generateRandomNumber(){
        Random random = new Random();
       return random.nextInt(100);
    }

    public static List<String> generateRandomNames(){


        List<String> names = new ArrayList<>();

        Faker faker = new Faker();
        for (int i = 0; i < 5; i++) {

            names.add(faker.name().fullName());
        }
     return names;
    }
}
