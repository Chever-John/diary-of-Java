package cn.mr8god.hchaptereight;

/**
 * @author Mr8god
 * @date 2020/4/16
 * @time 16:45
 */

class Super{
    public int field = 0;
    public int getField(){ return field; }
}

class Sub extends Super {
    public int field = 1;
    @Override
    public int getField(){ return field; }
    public int getSuperField(){ return super.field;}
}
public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.field = " + sup.field + ", sup.getField() = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sup.field = " + sup.field + ", sup.getField() = " + sup.getField() + ", sub.getSuperField() = " + sub.getSuperField());

    }
}
