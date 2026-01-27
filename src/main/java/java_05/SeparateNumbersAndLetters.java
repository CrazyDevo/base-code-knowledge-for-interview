package java_05;

public class SeparateNumbersAndLetters {


    public static void main(String[] args) {


        String input="1a2b3c";


        separateString(input);



    }

    private static void separateString(String input) {
        StringBuilder letters=new StringBuilder();
        StringBuilder numbers=new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.append(c);
            } else if (Character.isLetter(c)) {
                letters.append(c);

            }


        }

        System.out.println("Numbers: " + numbers.toString());
        System.out.println("Letters: " + letters.toString());



    }


}
