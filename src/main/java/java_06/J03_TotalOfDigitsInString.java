package java_06;

public class J03_TotalOfDigitsInString {

    public static void main(String[] args) {

        String str = "1a2b3";

    int result=sumDigits(str);
        System.out.println(result);



    }

    private static int sumDigits(String str) {
        int result=0;

        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)){
              //  result+=Integer.parseInt(each+"");
                result+=(each-'0');


            }

        }

        return result;



    }
}
