package cn.mr8god.echapterfive;

/**
 * @author Mr8god
 * @date 2020/4/15
 * @time 21:13
 */
public class VarargType {
    static void f(Character... args){
        System.out.print(args.getClass()    );
        System.out.println(" length " + args.length);
    }

    static void g(int... args){
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
        System.out.println("int[]: " + new int[0].getClass());
    }
}
