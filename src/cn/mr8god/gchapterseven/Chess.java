package cn.mr8god.gchapterseven;

import static net.mindview.util.Print.print;

/**
 * @author Mr8god
 * @date 2020/4/16
 * @time 1:54
 */

class Game{
    Game(int i){
        print("Game constructor");
    }
}

class BoardGame extends Game{
    BoardGame(int i){
        super(i);
        print("BoardGame constructor");
    }
}
public class Chess extends BoardGame{
    Chess(){
        super(11);
        print("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
