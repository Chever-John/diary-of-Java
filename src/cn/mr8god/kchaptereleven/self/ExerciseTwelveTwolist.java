package cn.mr8god.kchaptereleven.self;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Mr8god
 * @date 2020/4/21
 * @time 22:28
 */
public class ExerciseTwelveTwolist {
    int length;
    List<Integer> list1 = new ArrayList<Integer>(length);
    List<Integer> list2 = new ArrayList<Integer>(length);
    ListIterator<Integer> li;
    // 构造函数，给list1赋值，并且将li指向list1的最末尾的一个元素
     ExerciseTwelveTwolist(int length){
        this.length = length;
        for (int i = 1; i < length; i++){
            list1.add(i);
        }
        li = list1.listIterator(length - 1);
    }
    // 对list2进行初始化
    void list2(){
        while (li.hasPrevious()){
            // 当ListIterator li前面具有元素时，将当前的元素
            // 赋值给list2，并且向前移动（即li.previous的功能）
            list2.add(li.previous());
        }
    }
    void out1(){
        System.out.println(list1);
    }
    void out2(){
        System.out.println(list2);
    }
    static class Test{
        public static void main(String[] args) {
            ExerciseTwelveTwolist ett = new ExerciseTwelveTwolist(10);
            ett.list2();
            ett.out1();
            ett.out2();
        }
    }
}
