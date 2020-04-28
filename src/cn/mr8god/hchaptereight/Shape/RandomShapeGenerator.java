package cn.mr8god.hchaptereight.Shape;

import java.util.Random;

/**
 * @author Mr8god
 * @date 2020/4/16
 * @time 16:23
 */
public class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next(){
        switch (rand.nextInt(3)){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}
