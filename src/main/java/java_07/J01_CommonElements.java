package java_07;

import java.util.ArrayList;
import java.util.List;

public class J01_CommonElements {
/*
Write a method that returns common elements.

["Java", "API", "Selenium"]
["API", "Cucumber", "Java"]
 */

    public static void main(String[] args) {

        String[] array1={"Java", "API", "Selenium"};
        String[] array2={"API", "Cucumber", "Java"};


     List<String> res= findCommonElements(array1,array2);

        System.out.println(res);



    }

    private static List<String> findCommonElements(String[] array1, String[] array2) {

        List<String> result=new ArrayList<>();

        for (String eachFromFirstArray : array1) {

            for (String eachFromSecondArray : array2) {

                if (eachFromFirstArray.equals(eachFromSecondArray)){
                    result.add(eachFromFirstArray);
                    break;
                }


            }

        }

        return result;

    }
}
