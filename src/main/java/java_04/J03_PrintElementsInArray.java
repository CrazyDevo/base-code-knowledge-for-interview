package java_04;

public class J03_PrintElementsInArray {


    public static void main(String[] args) {



        printElementsInArray(new int[]{1,2,3,4,5});


    }





    public static void printElementsInArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("-------------------");


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
