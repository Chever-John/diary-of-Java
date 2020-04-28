package cn.mr8god.cchapterthree;

/**
 * @author Mr8god
 * @date 2020/4/13
 * @time 3：04
 */
class Value{
    int i;
}
public class EqualsMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
    }
}
