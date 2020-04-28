package cn.mr8god.hchaptereight;

import static net.mindview.util.Print.print;

/**
 * @author Mr8god
 * @date 2020/4/16
 * @time 20:15
 */

class Meal{
    Meal(){ print("Meal()");}
}

class Bread{
    Bread(){ print("Bread()");}
}

class Cheese{
    Cheese(){ print("Cheese()");}
}

class Lettuce{
    Lettuce(){ print("Lettuce()");}
}
class Lunch extends Meal{
    Lunch(){ print("Lunch()");}
}
class PortableLunch extends Lunch{
    PortableLunch(){ print("PortableLunch()");}
}
public class Sandwich extends PortableLunch{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    public Sandwich(){ print("Sandwich()");}

    public static void main(String[] args) {
        new Sandwich();
    }
}
