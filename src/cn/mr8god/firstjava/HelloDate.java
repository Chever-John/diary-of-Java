package cn.mr8god.firstjava;
//: object/HelloDate.java
import java.util.Date;

/** The first Thinking in Java example program.
 * Displays a string and today's date.
 * @author Mr8god
 * @date 2020/4/13
 * @time 1:41
 * @version 1.0
 */
public class HelloDate {
    /** Entry point to class & application.
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
    }
} /* Output:(55% match)
Hello,it's:
wed
*///:~