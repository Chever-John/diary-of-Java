package cn.mr8god.jchapterten;

/**
 * @author Mr8god
 * @date 2020/4/19
 * @time 12:33
 */
public class Parcel10 {
    public Destination destination (final String dest, final float price){
        return new Destination() {
            private int cost;
            {
                cost = Math.round(price);
                if (cost > 100){
                    System.out.println("Over budget!");
                }else {
                    System.out.println("Not Over budget!");
                }
            }
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Tasmania", 11.395F);
    }
}
