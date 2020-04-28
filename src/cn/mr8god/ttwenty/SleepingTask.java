package cn.mr8god.ttwenty;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Mr8god
 * @date 2020/4/26
 * @time 23:49
 */
public class SleepingTask extends LiftOff {
    @Override
    public void run() {
        try{
            while (countDown-- > 0){
                System.out.print(status());
                TimeUnit.MILLISECONDS.sleep(100);
            }
        }catch (InterruptedException e){
            System.err.println("Interrupted");
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++){
            exec.execute(new SleepingTask());
        }
        exec.shutdown();
    }
}
