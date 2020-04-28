package cn.mr8god.kchaptereleven;

import java.util.ArrayList;

/**
 * @author Mr8god
 * @date 2020/4/20
 * @time 9:02
 */
public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++){
            apples.add(new Apple());
        }
        for (int i = 0; i < apples.size(); i++){
            System.out.println(apples.get(i).id());
        }
        for (Apple c :
                apples) {
            System.out.println(c.id());
        }
    }
}
