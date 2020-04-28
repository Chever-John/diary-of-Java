package cn.mr8god.ttwenty;

import java.util.concurrent.ThreadFactory;

/**
 * @author Mr8god
 * @date 2020/4/27
 * @time 11:40
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
