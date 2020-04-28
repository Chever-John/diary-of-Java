package cn.mr8god.kchaptereleven.self;

import java.util.*;

import static net.mindview.util.Print.print;

/**
 * @author
 * @date
 * @time
 */
public class c11e4 {
    static String next(){
        Random rnd = new Random(47);
        while (true){
            switch (rnd.nextInt(2)){
                case 0: return "Snow White";
                case 1: return "World war";
                default:
            }
        }
    }
    static Collection fill(Collection<String>collection){
        collection.add(next());
        collection.add(next());
        return collection;
    }
    public static class Test{
        public static void main(String[] args) {
            print(fill(new ArrayList<String >()));
            print(fill(new LinkedList<>()));
            print(fill(new HashSet<>()));
            print(fill(new LinkedHashSet<String>()));
            print(fill(new TreeSet<>(

            )));
        }
    }
}

