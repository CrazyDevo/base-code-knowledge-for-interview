package java_02;

import java.util.*;

public class ListPractice {


    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();

        List<String> list1=new ArrayList<>(); //Polymorphism


        list.add("Adam");

        System.out.println(list);  //Arrays.toString(array)


        list.add("Mahym");

        list.remove(0);

        System.out.println("After remove");
        System.out.println(list);

        System.out.println(list.size());

        //index will be starting from 0
        /*
        1. element index 0
        2. element index 1
        .
        .
        .
        n. element index list.size()-1
         */

        //----------------------------------------------

        List<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        numbers.get(0);
        numbers.get(1);
        numbers.get(2);
        numbers.get(numbers.size()-1);
//                     i=numbers.size()-1 ---> last index
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        //-----------------------------------------


      //  List<Integer> nums=List.of(30,45,67,8,9,0,12,90,34,54);

        List<Integer> nums=new ArrayList<>(Arrays.asList(30,45,67,8,9,0,12,90,34,54));

        Collections.sort(nums); //from min to max

        System.out.println(nums);

        Collections.reverse(nums);

        System.out.println(nums);


        //System.out.println(Collections.max(nums));
        System.out.println(nums.get(0));


      //  System.out.println(Collections.min(nums));
        System.out.println(nums.get(nums.size()-1));




        //-----------------------------------------


        List<String> names=new ArrayList<>(Arrays.asList("Santiago","Fred","Mahym","Adam","Borislow","Dimitry"));

        //I want to get the names if it is starting with D or F

        List<String> filteredNames=new ArrayList<>();
        for (String name : names) {

            if (name.startsWith("D") || name.startsWith("F")){

                filteredNames.add(name);
            }
        }


        System.out.println(filteredNames);














    }
}
