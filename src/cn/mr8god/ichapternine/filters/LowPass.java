package cn.mr8god.ichapternine.filters;

/**
 * @author Mr8god
 * @date 2020/4/17
 * @time 23:19
 */
public class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff){ this.cutoff = cutoff; }
    @Override
    public Waveform process(Waveform input){
        return input;
    }
}
