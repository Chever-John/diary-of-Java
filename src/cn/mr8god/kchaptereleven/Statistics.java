package cn.mr8god.kchaptereleven;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author Mr8god
 * @date 2020/4/26
 * @time 0:39
 */
public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < 10000; i++){
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }
}
