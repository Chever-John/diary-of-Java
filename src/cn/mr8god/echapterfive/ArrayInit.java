package cn.mr8god.echapterfive;

import java.util.Arrays;

import static net.mindview.util.Print.print;

/**
 * @author Mr8god
 * @date 2020/4/15
 * @time 19:44
 */
public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {
                new Integer(1),
                new Integer(2),
        };
        Integer[] b = new Integer[]{
                new Integer(1),
                new Integer(2),
        };
        print(Arrays.toString(a));
        print(Arrays.toString(b));
    }
}
