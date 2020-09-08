import java.util.Random;

public class ThreadArray {
    public static void main(String[] args)
    {
        Thread[] t_arr = new Thread[10];
        Random r_gen = new Random();
        for (int i = 0; i < 10; i++)
        {
            t_arr[i] = new Thread() {
                @Override
                public void run()
                {
                    try {
                        int t = r_gen.nextInt(500);
                        Thread.sleep(r_gen.nextInt(t));
                        System.out.println("Thread " + Integer.toString(t) + " slept for " + Integer.toString(t));
                    } catch (InterruptedException e) {
                        ;
                    }
                }
            };
            t_arr[i].start();
        }
        for (int i = 0; i < 10; i++)
        {
            try {
                t_arr[i].join();
            } catch (InterruptedException e) {
                ;
            }
        }

    }
}
