package cn.mr8god.ttwenty.twoonethree;

/**
 * @author Mr8god
 * @date 2020/4/29
 * @time 10:08
 */
public class EvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;

    @Override
    public int next() {
        ++currentEvenValue;
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
