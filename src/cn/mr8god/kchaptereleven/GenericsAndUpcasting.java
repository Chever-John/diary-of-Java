package cn.mr8god.kchaptereleven;


import java.util.ArrayList;

class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Braeburn extends Apple{}
/**
 * @author Mr8god
 * @date 2020/4/20
 * @time 9:09
 */
public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for (Apple c :
                apples) {
            System.out.println(c);
        }
    }
}
