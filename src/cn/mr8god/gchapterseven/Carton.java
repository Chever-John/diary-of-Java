package cn.mr8god.gchapterseven;

import static net.mindview.util.Print.print;

/**
 * @author Mr8god
 * @date 2020/4/16
 * @time 1:50
 */

class Art{
    Art(){ print("Art constructor");}
}

class Drawing extends Art{
    Drawing(){ print("Drawing constructor");}
}
public class Carton extends Drawing {
    public Carton(){ print("Carton constructro"); }

    public static void main(String[] args) {
        Carton x = new Carton();
    }
}
