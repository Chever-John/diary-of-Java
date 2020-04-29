package cn.mr8god.ttwenty;

/**
 * @author Mr8god
 * @date 2020/4/29
 * @time 8:09
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;
    public abstract int next();
    public void cancel(){canceled = true;}

    public boolean isCanceled() {
        return canceled;
    }
}
