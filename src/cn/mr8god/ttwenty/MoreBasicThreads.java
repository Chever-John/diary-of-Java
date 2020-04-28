package cn.mr8god.ttwenty;

/**
 * @author Mr8god
 * @date 2020/4/26
 * @time 22:53
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for LiftOff");
    }
}
