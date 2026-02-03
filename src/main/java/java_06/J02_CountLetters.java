package java_06;

public class J02_CountLetters {

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
