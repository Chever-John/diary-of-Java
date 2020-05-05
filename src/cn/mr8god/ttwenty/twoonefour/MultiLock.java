package cn.mr8god.ttwenty.twoonefour;

import static net.mindview.util.Print.print;

/**
 * @author Mr8god
 * @date 2020/5/5
 * @time
 */
public class MultiLock {
    public synchronized void f1(int count){
        if (count-- > 0) {
            print("f1() calling f2() with count " + count);
            f2(count);
        }
    }
    public synchronized void f2(int count){
        if (count-- > 0) {
            print("f2() calling f1() with count " + count);
            f1(count);
        }
    }

    public static void main(String[] args) throws Exception{
        final MultiLock multiLock = new MultiLock();
        new Thread(){
            @Override
            public void run() {
                multiLock.f1(10);
            }
        }.start();
    }
}
