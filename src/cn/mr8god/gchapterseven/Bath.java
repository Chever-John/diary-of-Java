package cn.mr8god.gchapterseven;

import static net.mindview.util.Print.print;

class Soap{
    private String s;
    Soap(){
        print("Soap()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return "Soap{" +
                "s='" + s + '\'' +
                '}';
    }
}
/**
 * @author Mr8god
 * @date 2020/4/26
 * @time 10:14
 */
public class Bath {
    private String
        s1 = "Happy",
        s2 = "Happy",
        s3, s4;
    private Soap castille;
    private int i;
    private float toy;
    public Bath(){
        print("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
    }
    { i = 47; }

    @Override
    public String toString() {
        if (s4 == null){
            s4 = "Joy";
        }
        return "Bath{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", s4='" + s4 + '\'' +
                ", i=" + i +
                ", toy=" + toy +
                ", castille=" + castille +
                '}';
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        print(b);
    }
}
