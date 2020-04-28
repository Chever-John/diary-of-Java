package cn.mr8god.dchapterfour;

/**
 * @author Mr8god
 * @date 2020/4/13
 * @time 10:25
 */
public class ListCharacters {
    public static void main(String[] args) {
        for (char c = 0; c < 128; c++){
            if (Character.isLowerCase(c)){
                System.out.println("value: " + (int)c + " character: " + c);
            }
        }
    }
}
