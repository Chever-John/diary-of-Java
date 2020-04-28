package cn.mr8god.kchaptereleven;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author Mr8god
 * @date 2020/4/22
 * @time 20:37
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random rnd = new Random(47);
        Set<Integer> intset = new HashSet<Integer>();
        for (int i = 0; i < 3; i++){
            intset.add(rnd.nextInt(30));
        }
        System.out.println(intset);
    }
}
