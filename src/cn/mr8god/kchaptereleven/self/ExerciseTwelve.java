package cn.mr8god.kchaptereleven.self;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Mr8god
 * @date 2020/4/21
 * @time 21:51
 * 这个代码是《Java编程思想》第十一章持有对象的练习12（3）：
 * 创建并组装一个List,然后再创建第二个具有相同尺寸的List，
 * 将第一个List列表反序插入第二个列表中
 *
 * 这里边我的思路是首先用hasNext将LsIterator的指针滑到了容器的最后的位置
 * 然后我再使用previous，一步步，慢慢的往前滑，顺便赋值给int2
 * 其实我大可不必这么复杂，还调用previous，直接for倒序赋值就完事了
 * 但是这么一来我对previous的理解深入了，确实，这段代码中如果没有hasNext的话
 * previous是无法运行的，会报错，会爆越界，确实，我指针指在了第一个，
 * 我还要赋值，拿什么给他赋值呀，over，收获良多
 *
 */
public class ExerciseTwelve {
    public static void main(String[] args) {
        List<Integer> int1 = new ArrayList<>(10);
        List<Integer> int2 = new ArrayList<>(10);
        for (int i = 0; i < 10; i++){
            int1.add(i);
        }
//        System.out.println(int1);
        int counter = 0;
        ListIterator<Integer> lulala = int1.listIterator();
        while (lulala.hasNext()) {
            System.out.print(lulala.next() + "(" + counter++ + ") , ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++){
            int2.add(lulala.previous());
        }
        System.out.println(int2);
    }
}
