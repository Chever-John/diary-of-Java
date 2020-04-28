package cn.mr8god.echapterfive;

/**
 * @author Mr8god
 * @date 2020/4/15
 * @time 19:51
 */
public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[]{"江某人", "江某人的妹妹", "江某人的妈妈"});
    }
}

class Other{
    public static void main(String[] args) {
        for (String s:
             args) {
            System.out.print(s + " ");
        }
    }
}