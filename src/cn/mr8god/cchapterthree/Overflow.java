package cn.mr8god.cchapterthree;

/**
 * @author Mr8god
 * @date 2020/4/13
 * @time 9:46
 */
public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big = " + big);
        int bigger = big * 4;
        System.out.println("bigger = " + bigger);
    }
}
