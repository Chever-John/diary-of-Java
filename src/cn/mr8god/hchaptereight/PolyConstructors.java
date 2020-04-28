package cn.mr8god.hchaptereight;


import static net.mindview.util.Print.print;

class Glyph{
    void draw(){ print("Glyph.draw()");}
    Glyph(){
        print("Glyph() before draw()");
        draw();
        print("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int r){
        radius = r;
        print("RoundGlyph.RoundGlyph(), radius = " + radius );
    }

    @Override
    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}


/**
 * @author Mr8god
 * @date 2020/4/17
 * @time 15:06
 */
public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
