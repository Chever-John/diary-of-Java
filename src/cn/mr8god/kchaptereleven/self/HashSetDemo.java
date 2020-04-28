package cn.mr8god.kchaptereleven.self;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Mr8god
 * @date 2020/4/22
 * @time 21:34
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);

        for (Integer s :
                hs) {
            System.out.print(s + " ");
        }
    }
}
