package cn.mr8god.ttwenty;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.print;

/**
 * @author Mr8god
 * @date 2020/4/27
 * @time 11:41
 */
public class DaemonFromFactory implements Runnable {
    @Override
    public void run() {
        try {
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                print(Thread.currentThread() + " " + this);
            }
        }catch (InterruptedException e){
            print("Interrupted");
        }
    }

    public static void main(String[] args) throws Exception{
        ExecutorService exec = Executors.newCachedThreadPool(
                new DaemonThreadFactory());
        for (int i = 0; i < 10; i++){
            exec.execute(new DaemonFromFactory());
        }
        print("All daemons started");
        TimeUnit.MILLISECONDS.sleep(500);
    }
}
