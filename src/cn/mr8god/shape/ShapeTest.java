package cn.mr8god.shape;


/**
 * @ Mr8god
 * @ 2020/4/11
 */
class ShapeTest {
    public static void main(String[] args) {
        Shape sh = new Shape();

        sh.draw();
        sh.erase();
        sh.move();
        sh.getColor();
        sh.setColor();

        Circle ci = new Circle();
        ci.draw();
        ci.erase();
        ci.move();
        ci.getColor();
        ci.setColor();
        ci.doStuff(ci);
    }

}