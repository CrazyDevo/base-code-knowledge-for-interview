package java_05;

import java.util.HashMap;
import java.util.Map;

public class J02_SeparateNumbersAndLettersInArray {


    public static void main(String[] args) {

        String[] arr = {"1","a","2","b","3","c"};

        System.out.println(separateString(arr));


    }


        /*
        You will create a method:
        Parameter : String[] arr

        Return the result numbers and letters separately;


         */


    private static Map<String, String> separateString(String[] input) {
        //  StringBuilder letters=new StringBuilder();
        // StringBuilder numbers=new StringBuilder();

        String letters="";
        String numbers="";
                  //0
        String str="a";
        str.charAt(0); // a but it will be char instead of string


        for (String c : input) {

            if (Character.isDigit(c.charAt(0))) {
                numbers += c;
                //  numbers.append(c);
            } else if (Character.isLetter(c.charAt(0))) {
                letters += c;
                //  letters.append(c);

            }

        }
        //System.out.println("Numbers: " + numbers.toString());
        //System.out.println("Letters: " + letters.toString());

        System.out.println("Numbers: " + numbers);
        System.out.println("Letters: " + letters);

        Map<String, String > map = new HashMap<>();
        map.put("letters", letters);
        map.put("numbers", numbers);

        return map;



    }

}
