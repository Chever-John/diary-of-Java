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
//        // 直接运行从Runnable导出的类，因为这个类具有run()方法
//        // 所以可以使用类来运行，但是它不会产生任何内在的线程能力
//        // 要实现线程行为，你必须显式地将一个任务附着到线程上
//        public static void main(String[] args) {
//            LiftOff lift = new LiftOff();
//            lift.run();
//        }

        // 虽然效果是一样的，但是呢原理是不同的
        // 将Runnable对象转变为工作任务的传统方式是把它提交给一个Thread构造器
        // 然后使用Thread来驱动LiftOff对象。
        public static void main(String[] args) {
            Thread t = new Thread(new LiftOff());
            t.start();
            System.out.println("看看会有啥效果呢");
        }
        // 有一个小细节需要注意，
        // 我们可以看到“看看会有啥效果”会第一个出现在最开始，在我们的start方法之前先发生了
        // 其实是因为LiftOff.run()是有不同的线程执行的，因此你仍旧可以执行main()线程中的其他操作
        
    }
}
