package cn.mr8god.ttwenty.twoonefive;

/**
 * @author Mr8god
 * @date
 * @time
 */
public class Chopstick {
    private boolean taken = false;
    public synchronized void take() throws InterruptedException {
        while (taken) {
            wait();
        }
        taken = true;
    }
    public synchronized void drop() {
        taken = false;
        notifyAll();
    }
}
