package cn.mr8god.ttwenty;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

class ExceptionThread2 implements Runnable{
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("run() by " + t);
        System.out.println(
                "eh = " + t.getUncaughtExceptionHandler()
        );
        throw new RuntimeException();
    }
}

class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("caught " + e);
    }
}
/**
 * 为了使用 Thread.UncaughtExceptionHandler.uncaughtException(),
 * 我们创建了一个新类型的ThreadFactory，它将在每个新创建的Thread对象
 * 上附着一个 Thread.UncaughtExceptionHandler。
 * 于是我们将这个工厂传递给 Executors 创建新的 ExecutorService 的方法
 */
class HandlerThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r){
        System.out.println(this + " creating new Thread");
        Thread t = new Thread(r);
        System.out.println("created " + t);
        t.setUncaughtExceptionHandler(
                new MyUncaughtExceptionHandler()
        );
        System.out.println(
                "eh = " + t.getUncaughtExceptionHandler()
        );
        return t;
    }
}
/**
 * @author Mr8god
 * @date 2020/4/28
 * @time 11:00
 */
public class CaptureUncaughtException  {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool(
                new HandlerThreadFactory()
        );
        exec.execute(new ExceptionThread2());
    }
}
