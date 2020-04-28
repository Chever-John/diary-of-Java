package cn.mr8god.kchaptereleven;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @author Mr8god
 * @date 2020/4/26
 * @time 1:37
 */
public class ForEachCollections {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<String>();
        Collections.addAll(cs,
                "Take the long way home".split(" "));
        for (String s :
                cs) {
            System.out.print("'" + s + "' ");
        }
    }
}
