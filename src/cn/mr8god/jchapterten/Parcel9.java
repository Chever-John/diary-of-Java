package cn.mr8god.jchapterten;

/**
 * @author Mr8god
 * @date 2020/4/26
 * @time 14:53
 */
public class Parcel9 {
    public Destination destionation(final String dest){
        return new Destination() {
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destionation("Tasmania");
    }
}
