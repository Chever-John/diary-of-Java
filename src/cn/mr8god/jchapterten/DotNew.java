package cn.mr8god.jchapterten;

/**
 * @author Mr8god
 * @date 2020/4/18
 * @time 10:04
 */
public class DotNew {
    public class Inner{}

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
