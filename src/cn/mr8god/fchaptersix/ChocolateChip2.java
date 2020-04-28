package cn.mr8god.fchaptersix;

import cn.mr8god.fchaptersix.access.dessert.Cookie;

/**
 * @author Mr8god
 * @date 2020/4/16
 * @time 0:50
 */
public class ChocolateChip2 extends Cookie {
    public ChocolateChip2(){
        System.out.println("ChocolateChip2 constructor");
    }
    public void chomp(){ bite();}

    public static void main(String[] args) {
        ChocolateChip2 x = new ChocolateChip2();
        x.chomp();
    }
}
