package cn.mr8god.cchapterthree;

import static net.mindview.util.Print.print;

/**
 * @author Mr8god
 * @date 2020/4/13
 * @time 8:15
 */
public class StringOperators {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int z = 2;
        String s = "x, y, z ";
        print(s + x + y + z);
        print(x + " " + s);
        s += "(summed) = ";
        print(s + (x + y + z));
        print("" + x);


    }
}
