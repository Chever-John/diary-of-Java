
package cn.mr8god.kchaptereleven.self;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/**
 * @author Mr8god
 * @date 2020/4/18
 * @time 23:20
 */
public class SequenceForIterator {
    private Object[] items;
    public SequenceForIterator(int size) { items = new Object[size];}

    public static void main(String[] args) {

        List<Integer> a = new LinkedList<>();
        for (int i = 0; i < 10; i++){
            a.add(i);
        }
        Iterator<Integer> b = a.iterator();
        while (b.hasNext()){
            Integer c = b.next();
            System.out.print(c + " ");
        }
    }
}
