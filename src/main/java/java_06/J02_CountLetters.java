package java_06;

public class J02_CountLetters {
/*
Write a method that counts how many letters exist in a given String.

Input: "Java123"
Output: 4
 */
    public static void main(String[] args) {
        String str="Java123";


      int result=  countLetters(str);
        System.out.println(result);
    }

    private static int countLetters(String str) {

        int counter=0;

        for (char each : str.toCharArray()) {
            if (Character.isLetter(each))
                counter++;
        }

        return counter;
    }
}
