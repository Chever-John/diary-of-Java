package cn.mr8god.ichapternine.filters;

/**
 * @author Mr8god
 * @date 2020/4/17
 * @time 23:20
 */
public class HighPass extends Filter {
    double cutoff;
    public HighPass(double cutoff){ this.cutoff = cutoff; }
    @Override
    public Waveform process (Waveform input){ return input; }
}
