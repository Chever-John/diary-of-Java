package cn.mr8god.ichapternine.interfaces;

import java.util.Random;

/**
 * @author Mr8god
 * @date 2020/4/18
 * @time 20:56
 */
public interface RandVals {
    Random RAND = new Random(47);
    int RANDOM_INT = RAND.nextInt(10);
    long RANDOM_LONG = RAND.nextLong() * 10;
    float RANDOM_FLOAT = RAND.nextFloat() * 10;
    double RANDOM_DOUBLE = RAND.nextDouble() * 10;
}
