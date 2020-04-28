package cn.mr8god.echapterfive;

import static net.mindview.util.Print.print;

/**
 * @author Mr8god
 * @date 2020/4/15
 * @time 12:59
 */

class Window{
    Window(int marker){print("Window(" + marker + ")");}
}

class House{
    Window w1 = new Window(1);
    House(){
        print("House()");
        w3 = new Window(33);
    }
    Window w2 = new Window(2);
    void f(){ print("f()");}
    Window w3 = new Window(3);
}
public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f();
    }
}
