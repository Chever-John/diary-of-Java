package cn.mr8god.dchapterfour;

/**
 * @author Mr8god
 * @date 2020/4/13
 * @time 12:06
 */
public class ForEachString {
    public static void main(String[] args) {
        for (char c :
                "An African Swallow".toCharArray()) {
            System.out.print(c + " ");
        }
    }
}
