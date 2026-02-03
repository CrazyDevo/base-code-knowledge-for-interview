package java_06;

public class J01_ReverseString {


    public static void main(String[] args) {

        String str="Java";

   String result= reverseString(str);

        System.out.println(result);



    }

    private static String reverseString(String str) {

        String result="";

        //starting point;condition;increase or decrease
        for(int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
        }


        return result;
    }
}
