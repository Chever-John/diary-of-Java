package cn.mr8god.ttwenty;

class UnresponsiveUI{
    private volatile double d = 1;
    public UnresponsiveUI() throws Exception{
        while(d > 0){
            d = d + (Math.PI + Math.E) / d;
        }
        System.in.read();// Never gets there.
    }
}
/**
 * @author Mr8god
 * @date 2020/4/28
 * @time 8:56
 */
public class ResponsiveUI extends Thread {
    private static volatile double d = 1;
    public ResponsiveUI(){
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while (true){
            d = d + (Math.PI + Math.E) / d;
        }
    }

    public static void main(String[] args) throws Exception {
//        new UnresponsiveUI();
        new ResponsiveUI();
        System.in.read();
        System.out.println(d);
    }
}
