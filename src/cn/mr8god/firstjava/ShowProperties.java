package cn.mr8god.firstjava;

/**
 * @author Mr8god
 * @date 2020/4/13
 * @time 1:46
 */
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(
                System.getProperty("java.library.path")
        );
    }
}
