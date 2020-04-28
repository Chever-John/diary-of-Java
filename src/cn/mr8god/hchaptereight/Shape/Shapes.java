package cn.mr8god.hchaptereight.Shape;

/**
 * @author Mr8god
 * @date 2020/4/16
 * @time 16:26
 */
public class Shapes {
    private static RandomShapeGenerator gen =
            new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++){
            s[i] = gen.next();
        }

        for (Shape shp :
                s) {
            shp.erase();
        }
    }
}
