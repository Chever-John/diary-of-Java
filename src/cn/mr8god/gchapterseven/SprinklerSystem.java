package cn.mr8god.gchapterseven;

/**
 * @author Mr8god
 * @date 2020/4/16
 * @time 1:18
 */

class WaterSource{
    private String s;
    WaterSource(){
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return "WaterSource{" +
                "s='" + s + '\'' +
                '}';
    }
}
public class SprinklerSystem {
    private String valve1, valve2, valvae3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return "SprinklerSystem{" +
                "valve1='" + valve1 + '\'' +
                ", valve2='" + valve2 + '\'' +
                ", valvae3='" + valvae3 + '\'' +
                ", valve4='" + valve4 + '\'' +
                ", source=" + source +
                ", i=" + i +
                ", f=" + f +
                '}';
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }
}
