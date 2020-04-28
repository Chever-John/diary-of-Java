package cn.mr8god.dchapterfour;

/**
 * @author Mr8god
 * @date 2020/4/13
 * @time 10:27
 */
public class WhileTest {
    static boolean conditon(){
        boolean result = Math.random() < 0.99;
        System.out.print(result + ", ");
        return result;
    }

    public static void main(String[] args) {
        while (conditon()){
            System.out.println("Inside 'while'");
        }
        System.out.println("Exited 'while'");
    }
}
