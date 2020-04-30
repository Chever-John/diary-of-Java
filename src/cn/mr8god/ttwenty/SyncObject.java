package cn.mr8god.ttwenty;

import static net.mindview.util.Print.print;

class DualSynch{
    private Object syncObject = new Object();

    public synchronized void f(){
        for (int i = 0; i < 5; i++){
            print("f()");
            Thread.yield();
        }
    }

    public void g(){
        synchronized (syncObject){
            for (int i = 0; i < 5; i++){
                print("g()");
                Thread.yield();
            }
        }
    }
}


/**
 * @author Mr8god
 * @date 2020/4/30
 * @time 23:50
 */

public class SyncObject {
    public static void main(String[] args) {
        final DualSynch ds = new DualSynch();
        new Thread(){
            @Override
            public void run() {
                ds.f();
            }
        }.start();
        ds.g();
    }
}
