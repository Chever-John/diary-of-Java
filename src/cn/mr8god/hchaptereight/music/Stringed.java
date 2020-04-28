package cn.mr8god.hchaptereight.music;

import static net.mindview.util.Print.print;

/**
 * @author Mr8god
 * @date 2020/4/16
 * @time 15:56
 */
class Stringed extends Instrument{
    @Override
    public void play(Note n){
        print("Stringed.play() " + n);
    }
}
