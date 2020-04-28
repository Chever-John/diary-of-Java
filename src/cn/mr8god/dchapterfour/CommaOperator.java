package cn.mr8god.dchapterfour;

/**
 * @author Mr8god
 * @date 2020/4/13
 * @time 10:31
 */
public class CommaOperator {
    public static void main(String[] args) {
        for (int i = 1, j = i + 10; i < 5; i++, j = i * 2){
            System.out.println("i = " + i + " j = " + j);
        }
    }
}
