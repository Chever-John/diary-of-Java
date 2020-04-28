package cn.mr8god.jchapterten;


class WithInner{
    class Inner{}
}
/**
 * @author Mr8god
 * @date 2020/4/19
 * @time 15:11
 */
public class InheritInner extends WithInner.Inner {
    InheritInner(WithInner wi){
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
