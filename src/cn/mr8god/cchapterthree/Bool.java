package cn.mr8god.cchapterthree;

import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * @author Mr8god
 * @date 2020/4/13
 * @time 3:07
 */
public class Bool {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        print("i = " + i);
        print("j = " + j);
        print("i > j is  " + (i > j));
        print("i < j is  " + (i < j));
        print("i >= j is  " + (i >= j));
        print("i <= j is  " + (i <= j));
        print("i == j is  " + (i == j));
        print("i != j is  " + (i != j));
        print("(i < 10) && (j < 10) is "
                + ((i < 10) && (j < 10)) );
        print("(i < 10) || (j < 10) is "
                + ((i < 10) || (j < 10)) );


    }
}
