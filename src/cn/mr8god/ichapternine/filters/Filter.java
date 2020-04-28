package cn.mr8god.ichapternine.filters;

/**
 * @author Mr8god
 * @date 2020/4/17
 * @time 23:17
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input){ return input; }
}
