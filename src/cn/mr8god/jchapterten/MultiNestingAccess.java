package cn.mr8god.jchapterten;


class MNA{
    private void f() { }
    class A{
        private void g(){ }
        public class B{
            void h(){
                g();
                f();
            }
        }
    }

}
/**
 * @author Mrgod
 * @date 2020/4/19
 * @time 13:24
 */
public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
}
