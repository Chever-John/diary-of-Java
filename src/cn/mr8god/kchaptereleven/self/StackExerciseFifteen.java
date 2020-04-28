package cn.mr8god.kchaptereleven.self;

import cn.mr8god.kchaptereleven.Stack;

/**
 * @author Mr8god
 * @date 2020/4/22
 * @time 18:46
 */
public class StackExerciseFifteen {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String s = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        char[] cha = s.toCharArray();
        for (int i = 0; i < cha.length;){
            switch (cha[i++]){
                case '+': stack.push(cha[i++]);break;
                case '-':
                    System.out.print(stack.pop());
                default:
            }
        }
    }
}
