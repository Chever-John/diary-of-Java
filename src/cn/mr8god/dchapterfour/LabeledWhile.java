package cn.mr8god.dchapterfour;

import static net.mindview.util.Print.print;

/**
 * @author Mr8god
 * @date 2020/4/13
 * @time 13:50
 */
public class LabeledWhile {
    public static void main(String[] args) {
        int i = 0;
        outer:
        while (true){
            print("Outer while loop");
            while (true){
                i++;
                print("i = " + i);
                if (i == 1){
                    print("continue");
                    continue ;
                }
                if (i == 3){
                    print("continue outer");
                    continue outer;
                }
                if (i == 5){
                    print("break");
                    break ;
                }
                if (i == 7){
                    print("break outer");
                    break outer;
                }
            }
        }
    }
}
