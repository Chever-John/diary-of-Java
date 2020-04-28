package cn.mr8god.jchapterten;

/**
 * @author Mr8god
 * @date 2020/4/19
 * @time 13:10
 */
public interface ClassInterface {
    void howdy();
    class Test implements ClassInterface{
        @Override
        public void howdy() {
            System.out.println("Howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
