package java_04;

public class J04_PrintElementsInReversedOrder {


    public static void main(String[] args) {

        printElementsInArrayInReverseOrder(new int[]{1,2,3,4,5});


    }



    public static void printElementsInArrayInReverseOrder(int[] arr) {

        for (int i = arr.length-1; i >=0; i--) {
            System.out.println(arr[i]);
        }

    }
}
