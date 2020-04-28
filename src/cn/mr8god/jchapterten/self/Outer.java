package cn.mr8god.jchapterten.self;

/**
 * @author Mr8god
 * @date 2020/4/19
 * @time 13:31
 */
public class Outer {
    public class Inner{

    }
    Inner fanhui(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer out = new Outer();
        Inner inn = out.fanhui();
        System.out.println(inn);
    }
}
