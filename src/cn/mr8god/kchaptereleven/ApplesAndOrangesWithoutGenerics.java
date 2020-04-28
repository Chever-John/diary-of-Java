package cn.mr8god.kchaptereleven;


import java.util.ArrayList;

class Apple{
    private static long counter;
    private final long id = counter++;
    public long id(){ return id; }
}

class Orange{}
/**
 * @author Mr8god
 * @date 2020/4/20
 * @time 8:27
 */
public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++){
            apples.add(new Apple()) ;
        }
//        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++){
            ((Apple)apples.get(i)).id();
        }
    }
}
