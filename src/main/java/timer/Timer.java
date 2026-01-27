package timer;

public class Timer {


    public static void main(String[] args) {

        int timer=90;



        for (int i = timer; i >=0 ; i--) {
            sleep(1);

            System.out.println(i+" seconds left");
        }

    }

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        }catch (Exception e){

        }
    }
}
