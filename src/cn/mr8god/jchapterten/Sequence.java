
package cn.mr8god.jchapterten;

interface Selector{
    boolean end();
    Object current();
    void next();
}
/**
 * @author Mr8god
 * @date 2020/4/18
 * @time 23:20
 */
public class Sequence {
    private Object[] items;
    public void add(Object x){
        if (next < items.length){
            items[next++] = x;
        }
    }

    private int next = 0;

    public Sequence(int size) { items = new Object[size];}

    private class SequenceSelector implements Selector{
        private int i = 0;

        @Override
        public boolean end() { return i == items.length; }

        @Override
        public Object current() { return items[i]; }

        @Override
        public void next() {
            if (i < items.length){
                i++;
            }
        }
    }
    public Selector selector(){ return new SequenceSelector(); }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++){
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
