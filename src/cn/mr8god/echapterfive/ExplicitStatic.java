package cn.mr8god.echapterfive;

import static net.mindview.util.Print.print;

/**
 * @author Mr8god
 * @date 2020/4/15
 * @time 2:04
 */

class Cup{
    Cup(int marker){
        print("Cup(" + marker + ")");
    }
    void f(int marker){
        print("f(" + marker + ")");
    }
}

class Cups{
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups(){
        print("Cups()");
    }
}
public class ExplicitStatic {
    public static void main(String[] args) {
        print("Inside main()");
//        Cups.cup1.f(99);
    }
    static Cups cup2 = new Cups();

}
