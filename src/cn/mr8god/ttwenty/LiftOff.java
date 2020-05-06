package cn.mr8god.ttwenty;

/**
 * @author Mr8god
 * @date 2020/4/26
 * @time 22:37
 */
public class LiftOff implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff(){}
    public LiftOff(int countDown){
        this.countDown = countDown;
    }
    public String status(){
        return "#" + id +"(" + (countDown > 0 ? countDown : "LiftOff!") + "), ";
    }
    @Override
    public void run(){
        while (countDown-- > 0){
            System.out.println(status());
            Thread.yield();
        }
    }
    public static class Tester{
        public static void main(String[] args) {
            LiftOff lift = new LiftOff();
            lift.run();
        }
    }
}
