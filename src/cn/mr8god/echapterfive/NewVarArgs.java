package cn.mr8god.echapterfive;

/**
 * @author Mr8god
 * @date 2020/4/15
 * @time 20:12
 */
public class NewVarArgs {
    static void printArray(Object... args){
        for (Object obj :
                args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Integer(47), new Float(3.14), new Double(11.11));
        printArray(47, 3.14F, 11.11);
        printArray("one", "two", "three");
        printArray(new A(), new A(), new A());
        printArray((Object[])new Integer[]{ 1, 2, 3, 4});
        printArray();
    }

}
