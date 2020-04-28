package cn.mr8god.hchaptereight.music;

import static net.mindview.util.Print.print;

/**
 * @author Mr8god
 * @date 2020/4/16
 * @time 15:25
 */

public class Music {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute);
        tune(violin);
        tune(frenchHorn);
    }
}
