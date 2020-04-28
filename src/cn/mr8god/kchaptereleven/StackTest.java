package cn.mr8god.kchaptereleven;

/**
 * @author Mr8god
 * @date 2020/4/22
 * @time 18:28
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s :
                "I have a cute sister.".split(" ")) {
            stack.push(s);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
