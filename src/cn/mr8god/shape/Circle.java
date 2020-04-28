package cn.mr8god.shape;

import static java.lang.System.*;

/**
 * @author Mr8god
 * @date 2020/4/822:04
 */
public class Circle extends Shape{
    void doStuff(Shape s){
        s.erase();
        out.println("我是来自子类Circle里边的doStuff方法。");
    }

}
