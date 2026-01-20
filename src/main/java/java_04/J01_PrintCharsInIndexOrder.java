package java_04;

public class J01_PrintCharsInIndexOrder {


    public static void main(String[] args) {
        printCharsInString("Adam");
    }

    public static void printCharsInString(String str){

        /*
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(str.length() - 1));

         */

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        /*
        m
        a
        d
        A
         */
    }
}
