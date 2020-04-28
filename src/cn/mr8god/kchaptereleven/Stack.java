package cn.mr8god.kchaptereleven;

import java.util.LinkedList;

/**
 * @author Mr8god
 * @date 2020/4/22
 * @time 15:54
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();
    public void push(T v){ storage.addFirst(v);}
    public T peek() { return storage.getFirst();}
    public T pop(){return storage.removeFirst();}
    public boolean empty(){return storage.isEmpty();}
    @Override
    public String toString(){ return storage.toString();}
}
