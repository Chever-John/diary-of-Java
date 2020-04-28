package cn.mr8god.kchaptereleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class ReversibleArrayList<T> extends ArrayList<T>{
    public ReversibleArrayList(Collection<T> c){ super(c);}
    public Iterable<T> reversed(){
        return new Iterable<T>() {
            int current = size() - 1;
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public T next() {
                        return get(current--);
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}
/**
 * @author Mr8god
 * @date 2020/4/26
 * @time 1:58
 */
public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList<String>(
                Arrays.asList("To be or not to be".split(" "))
        );
        for (String s :
                ral) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s :
             ral.reversed()) {
            System.out.print(s + " ");
        }
    }
}
