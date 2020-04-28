package cn.mr8god.cchapterthree;

/**
 * @author Mr8god
 * @date 2020/4/13
 * @time 8:51
 */
public class Casting {
    public static void main(String[] args) {
        int i = 200;
        long lng = (long) i;
        lng = i;
        long lng2 = (long)200;
        lng2 = 200;
        i = (int)lng2;
    }
}
