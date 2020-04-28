package cn.mr8god.kchaptereleven.self;

import java.util.ArrayList;

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
public class SequenceNewSetforeleven {
    private ArrayList<Object> items = new ArrayList<Object>();
    public void add(Object x){
        items.add(x);
    }

    private int next = 0;

    private class SequenceSelector implements Selector{
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.size();
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void next() {
            i++;
        }
    }
    public Selector selector(){
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        SequenceNewSetforeleven s3 = new SequenceNewSetforeleven();
        for (int i = 0; i < 10; i++){
            s3.add(i);
        }
        Selector selector = s3.selector();
//        while(!selector.end()){
//            System.out.print(selector.current() + " ");
//            selector.next();
//        }
        s3.add(10);
        s3.add(11);
        s3.add(12);
        s3.add(13);
        s3.add(11);
        s3.add("hello everyone!");
        while (!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
