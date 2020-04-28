package cn.mr8god.gchapterseven;

import static net.mindview.util.Print.print;

/**
 * @author Mr8god
 * @date 2020/4/16
 * @time 2:06
 */

class Homer{
    char doh(char c){
        print("doh(char)");
        return 'd';
    }
    float doh(float f){
        print("doh(float)");
        return 1.0f;
    }
}

class Milhouse{}

class Bart extends Homer{
    void doh(Milhouse milhouse){
        print("doh(Milhouse)");
    }
}
public class Hide {
    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
    }
}
