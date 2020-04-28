package cn.mr8god.echapterfive;

import java.util.Arrays;

import static net.mindview.util.Print.print;

/**
 * @author Mr8god
 * @date 2020/4/15
 * @time 19:33
 */
public class ArrayClassObj {
    public static void main(String[] args) {
        Integer[] a = new Integer[20];
        for (int i = 0; i < a.length; i++){
            a[i] = i;
        }
        print(Arrays.toString(a));
    }
}
