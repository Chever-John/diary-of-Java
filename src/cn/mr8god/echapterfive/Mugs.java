package cn.mr8god.echapterfive;

import static net.mindview.util.Print.print;

/**
 * @author Mr8god
 * @date 2020/4/15
 * @time 9:52
 */

class Mug{
    Mug(int marker){
        print("Mug(" + marker + ")");
    }
    void  f(int marker){
        print("f(" + marker + ")");
    }
}
public class Mugs {
    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        print("mug1 & mug2 initialized");
    }
    Mugs(){
        print("Mugs()");
    }
    Mugs(int i){
        print("Mugs(int)");
    }

    public static void main(String[] args) {
//        print("Inside main()");
//        new Mugs();
//        print("new Mugs() completed");
        new Mugs(1);
//        print("new Mugs(1) completed");
    }
}
