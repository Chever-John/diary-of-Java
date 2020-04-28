package cn.mr8god.cchapterthree;

import java.util.Random;

import static net.mindview.util.Print.print;


/**
 * @author Mr8god
 * @date 2020/4/13
 * @time 2:41
 */
public class MathOps {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i, j, k;
        j = rand.nextInt(100) + 1;
        print("j : " + j);
        k = rand.nextInt(100) + 1;
        print("k : " + k);
        i = j + k;
        print("j + k : " + i);
        i = j - k;
        print("j - k : " + i);
        i = k / j;
        print("k / j : " + i);
        i = k * j;
        print("k * j : " + i);
        i = k % j;
        print("k % j : " + i);
        j %= k;
        print("j %= k : " + j);
        float u, v, w;
        v = rand.nextFloat();
        print("v : " + v);
        w = rand.nextFloat();
        print("v : " + w);
        u = v + w;
        print("v + w : " + u);
        u = v - w;
        print("v - w : " + u);
        u = v * w;
        print("v * w : " + u);
        u = v / w;
        print("v / w : " + u);
        u += v;
        print("u += v: " + u);
        u -= v;
        print("u -= v: " + u);
        u *= v;
        print("u *= v: " + u);
        u /= v;
        print("u /= v: " + u);







    }
}
