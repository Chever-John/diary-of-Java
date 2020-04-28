package cn.mr8god.fchaptersix.access.dessert;

/**
 * @author Mr8god
 * @date 2020/4/16
 * @time 0:49
 */
public class ChocolateChip extends Cookie {
    public ChocolateChip(){
        System.out.println("ChocolateChip constructor");
    }
    public void chomp(){
        bite();
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}
