package java_01;

public class ArrayPractice {

    public static void main(String[] args) {

        //int[] arr=new int[6];
        int [] arr={1,2,3,4,5};

       // System.out.println(arr[0]); //1
       // System.out.println(arr[1]); //2


        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }


        System.out.println("----------------------------------");

        //       4   =   5      -1
        int lastIndex=arr.length-1;

        for (int i = lastIndex; i >= 0; i--) {

            System.out.println(arr[i]);
        }


    }
}
