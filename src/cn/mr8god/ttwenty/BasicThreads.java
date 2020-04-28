package cn.mr8god.ttwenty;

/**
 * @author Mr8god
 * @date 2020/4/26
 * @time 22:50
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
