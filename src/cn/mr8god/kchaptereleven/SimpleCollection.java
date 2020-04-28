package cn.mr8god.kchaptereleven;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author Mr8god
 * @date 2020/4/20
 * @time 9:32
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<Integer>();
        for (int i = 0; i < 10; i++){
            c.add(i);
        }
        for (Integer i :
                c) {
            System.out.print(i + ", ");
        }
    }
}
