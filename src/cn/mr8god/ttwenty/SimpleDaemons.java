package cn.mr8god.ttwenty;

import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.print;

/**
 * @author Mr8god
 * @date 2020/4/27
 * @time 0:01
 */
public class SimpleDaemons implements Runnable {
    @Override
    public void run() {
        try {
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                print(Thread.currentThread() + " " + this);
            }
        }catch (InterruptedException e){
            print("sleep() interrupted");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++){
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }
        print("All daemons started");
        TimeUnit.MILLISECONDS.sleep(175);
    }
}
