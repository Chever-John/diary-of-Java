package cn.mr8god.ttwenty;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Mr8god
 * @date 2020/4/26
 * @time 23:12
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
