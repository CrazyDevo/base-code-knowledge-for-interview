package java_01;

public class StringPractice {

    public static void main(String[] args) {

        String name="Adam";

        //I want to print chars from beginning


     name.charAt(0); //A
     name.charAt(1); //d
     name.charAt(2); //a
     name.charAt(3); //m //until end name.length()-1// ;

     //for loop
                //last i= name.length()-1
        for (int i = 0; i <name.length() ; i++) {
            System.out.println(i+ " name.charAt(i) = " + name.charAt(i));
        }


        System.out.println("-----------------------------------------");

        //I want to print chars from last
        //     3     =     4       -1
        /*int lastIndex=name.length()-1;
        System.out.println(name.charAt(lastIndex));  //3
        System.out.println(name.charAt(lastIndex-1)); //2
        System.out.println(name.charAt(lastIndex-2)); //1
        System.out.println(name.charAt(lastIndex-3)); //0

         */


       for (int i=name.length()-1;i>=0;i--)    {
           System.out.println(name.charAt(i));
       }



    }
}
