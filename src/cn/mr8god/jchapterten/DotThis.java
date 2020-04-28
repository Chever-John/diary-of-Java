package cn.mr8god.jchapterten;

/**
 * @author Mr8god
 * @date 2020/4/18
 * @time 8:23
 */
public class DotThis {
    void f(){ System.out.println("DotThis.f()"); }
    public class Inner{
        public DotThis outer(){
            return DotThis.this;
        }
    }
    public Inner inner(){ return new Inner();}

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
