package cn.mr8god.ttwenty;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Mr8god
 * @date 2020/4/27
 * @time 17:39
 */
public class SelfManaged implements Runnable {
    private int countDown = 5;
//    private Thread t = new Thread(this);
    public SelfManaged() {}

    @Override
    public String toString() {
        return Thread.currentThread().getName() +
                "(" + countDown + "), ";
    }

    @Override
    public void run() {
        while (true){
            System.out.print(this);
            if (--countDown == 0){
                return;
            }
        }
    }
    public static class Tester{
        public static void main(String[] args) {
            ExecutorService exec = Executors.newCachedThreadPool();
            for (int i = 0; i < 5; i++){
                exec.execute(new SelfManaged());
            }
            exec.shutdown();
        }
    }

//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++){
//            new SelfManaged();
//
//        }
//    }
}
