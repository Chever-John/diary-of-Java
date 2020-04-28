package cn.mr8god.dchapterfour;

import java.util.Random;

/**
 * @author Mr8god
 * @date 2020/4/13
 * @time 10:34
 */
public class ForEachFloat {
    public static void main(String[] args) {
        Random rand = new Random(47);
        float f[] = new float[10];
        for (int i = 0; i < 10; i++){
            f[i] = rand.nextFloat();
        }
        for (float x : f){
            System.out.println(x);
        }
    }
}
