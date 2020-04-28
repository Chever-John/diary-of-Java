package cn.mr8god.ichapternine.filters;

/**
 * @author Mr8god
 * @date 2020/4/17
 * @time 23:22
 */
public class BandPass extends Filter {
    double lowCutoff, highCutoff;
    public BandPass(double lowCut, double highCut){
        lowCutoff = lowCut;
        highCutoff = highCut;
    }

    @Override
    public Waveform process(Waveform input) { return input; }
}
