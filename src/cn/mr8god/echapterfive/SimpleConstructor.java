package cn.mr8god.echapterfive;

/**
 * @author Mr8god
 * @date 2020/4/14
 * @time 10:22
 */

class Rock{
    Rock(){
        System.out.print("Rock ");
    }
}
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            new Rock();
        }
    }
}
