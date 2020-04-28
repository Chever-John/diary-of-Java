package cn.mr8god.echapterfive;

/**
 * @author Mr8god
 * @date 2020/4.15
 * @time 23:10
 */
public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s :
                Spiciness.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());

        }
    }
}
