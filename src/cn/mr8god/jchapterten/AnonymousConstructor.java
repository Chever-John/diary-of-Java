package cn.mr8god.jchapterten;

import static net.mindview.util.Print.print;

abstract class Base{
    public Base(int i){
        print("Base constructor, i = " + i);
    }
    public abstract void f();
}
/**
 * @author Mr8god
 * @date 2020/4/19
 * @time 11:09
 */
public class AnonymousConstructor {
    public static Base getBase(int i){
        return new Base(i) {
            @Override
            public void f() {
                print("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
