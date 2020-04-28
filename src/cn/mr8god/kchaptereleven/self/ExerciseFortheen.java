package cn.mr8god.kchaptereleven.self;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author Mr8god
 * @date 2020/4/22
 * @time 9:23
 */
public class ExerciseFortheen {
    static void Insert(LinkedList<Integer> linkedList, Integer [] ia){
        for (Integer i :
                ia) {
            ListIterator<Integer> lt = linkedList.listIterator(linkedList.size()/2);
            lt.add(i);
        }
        System.out.println(linkedList);
    }
    static class Test{
        public static void main(String[] args) {
            LinkedList<Integer> linkedList = new LinkedList<Integer>();
            Integer[] a = new Integer[]{1,2,3,4,5,6,7,8};
            Insert(linkedList, a);
        }
    }
}
