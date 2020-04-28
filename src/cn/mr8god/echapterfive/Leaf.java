package cn.mr8god.echapterfive;

/**
 * @author Mr8god
 * @date 2020/4/14
 * @time 11:18
 */
public class Leaf {
    int i = 0;
    Leaf increment(){
        i++;
        System.out.println("Mr8god" + " ");
        return this;
    }
    void print(){
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}
