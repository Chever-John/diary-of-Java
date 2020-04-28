package cn.mr8god.cchapterthree;

import static net.mindview.util.Print.print;

/**
 * @author Mr8god
 * @date 2020/4/13
 * @time 2:32
 */
class Tank{
    int level;
}
public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 8;
        t2.level = 47;
        print("1: t1.level: " + t1.level +
                ", t2.level: " + t2.level);
        t1 = t2;
        print("2: t1.level: " + t1.level +
                ", t2.level: " + t2.level);
        t1.level = 27;
        print("3: t1.level: " + t1.level +
                ", t2.level: " + t2.level);
    }
}
