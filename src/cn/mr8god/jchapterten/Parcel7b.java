package cn.mr8god.jchapterten;

/**
 * @author Mr8god
 * @date 2020/4/19
 * @time 10:56
 */
public class Parcel7b {
    class MyContents implements Contents{
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }
    public Contents contents(){return new MyContents();}

    public static void main(String[] args) {
        Parcel7b p = new Parcel7b();
        Contents c = p.contents();
    }
}
