package cn.mr8god.echapterfive;

/**
 * @author Mr8god
 * @date 2020/4/15
 * @time 20:26
 */
public class OptionalTrailArguments {
    static void f(int required, String... trailing){
        System.out.print("required: " + required + " ");
        for (String str :
                trailing) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, "one");
        f(2, "one", "two");
        f(0);
    }
}
