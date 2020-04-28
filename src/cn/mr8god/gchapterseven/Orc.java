package cn.mr8god.gchapterseven;

import static net.mindview.util.Print.print;

/**
 * @author Mr8god
 * @date 2020/4/16
 * @time 2:23
 */

class Villain{
    private String name;
    protected void set(String nm){ name = nm;}
    public Villain(String name){ this.name = name;}

    @Override
    public String toString() {
        return "Villain{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class Orc extends Villain{
    private int orcNumber;
    public Orc(String name , int orcNumber){
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name , int orcNumber){
        set(name);
        this.orcNumber = orcNumber;
    }
    @Override
    public String toString(){
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger", 12);
        print(orc);
        orc.change("Bob", 19);
        print(orc);
    }
}
