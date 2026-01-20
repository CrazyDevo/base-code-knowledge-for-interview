package java_04;

public class J02_PrintCharsInReversedOrder {


    public static void main(String[] args) {

        printChars("Adam");



    }


    public static void printChars(String str){

        for (int i = str.length()-1; i >=0; i--) {
            System.out.println(str.charAt(i));
        }

    }
}
