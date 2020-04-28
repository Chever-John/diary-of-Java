package cn.mr8god.ichapternine.filters;

/**
 * @author Mr8god
 * @date 2020/4/17
 * @time 23:16
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform{" +
                "id=" + id +
                '}';
    }
}
