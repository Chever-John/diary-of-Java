package cn.mr8god.echapterfive;

/**
 * @author Mr8god
 * @date 2020/4/14
 * @time 11:21
 */

class Person{
    public void eat(Apple apple){
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peeler{
    static Apple peel(Apple apple){
        return apple;
    }
}
class Apple{
    Apple getPeeled(){ return Peeler.peel(this); }
}
public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());

    }

}
