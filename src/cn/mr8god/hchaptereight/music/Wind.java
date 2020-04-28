package cn.mr8god.hchaptereight.music;

/**
 * @author Mr8god
 * @date 2020/4/16
 * @time 15:28
 */
public class Wind extends Instrument {
    @Override
    public void play(Note n){
        System.out.println("Wind.play() " + n);
    }
}
