package cn.mr8god.cchapterthree;

import static net.mindview.util.Print.print;

/**
 * @author Mr8god
 * @date 2020/4/13
 * @time 8:09
 */
public class TernaryIfElse {
    static int ternary(int i){
        return i < 10 ? i * 100 : i * 10;
    }
    static int standartIfElse(int i){
        if (i < 10){
            return i * 100;
        }else {
            return i * 10;
        }
    }

    public static void main(String[] args) {
        print(ternary(9));
        print(ternary(10));
        print(standartIfElse(9));
        print(standartIfElse(10));

    }
}
