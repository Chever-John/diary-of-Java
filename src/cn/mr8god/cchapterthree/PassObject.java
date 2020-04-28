package cn.mr8god.cchapterthree;

import static net.mindview.util.Print.print;

/**
 * @author Mr8god
 * @date 2020/4/13
 * @time 2:36
 */
class Letter{
    char c;
}
public class PassObject {
    static void f(Letter y){
        y.c = 'g';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        print("1: x.c: " + x.c);
        f(x);
        print("2: x.c: " + x.c);
    }
}
