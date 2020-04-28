package cn.mr8god.dchapterfour;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;
import static net.mindview.util.Range.range;

/**
 * @author Mr8god
 * @date 2020/4/13
 * @time 12:46
 */
public class ForEachInt {
    public static void main(String[] args) {
        for (int i :
                range(10)) {
            printnb(i + " ");
        }
        print();
        for (int i :
                range( 5, 10)) {
            printnb(i + " ");
        }
        print();
        for (int i :
                range(5, 20, 3)) {
            printnb(i + " ");
        }
        print();
    }

}
