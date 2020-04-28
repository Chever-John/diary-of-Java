package cn.mr8god.jchapterten;

/**
 * @author Mr8god
 * @date 2020/4/18
 * @time 9:52
 */
public class Parcel5 {
    public Destination destination(String s){
        class PDestination implements Destination{
            private String label;
            private PDestination(String whereTo ){
                label = whereTo;
            }
            @Override
            public String readLabel(){ return label; }
        }
        return new PDestination(s);

    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
    }
}