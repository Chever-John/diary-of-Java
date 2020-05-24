package cn.homework.ex2;

import java.util.Scanner;

/**
 * @author Mr8god
 * @date 2020/5/23
 * @time
 */
public class Palindrome{
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("input one interger");
//        int num = input.nextInt();
//        while (num != 0) {
//            System.out.println(num % 10);
//            num /= 10;
//        }

        System.out.println("Please input one Interger ranging from 1 to 99999");
        Scanner in = new Scanner(System.in);
        Long a = in.nextLong();
        String s = Long.toString(a);
        char[] ch = s.toCharArray();
        System.out.println("What you input is a " + ch.length +" digit number");



//        if (ch[0] == ch[4] && ch[1] == ch[3]) {
//            System.out.println("This is a Palindrome.");
//        } else {
//            System.out.println("This is not a Palindrome.");
//        }


        int i = s.length();
        int j = 0;
        while (j <= (i / 2) - 1 && s.charAt(j) == s.charAt(i - j - 1)) {
            j++;
        }
        if (j == i / 2) {
            System.out.println("This is a Palindrome.");
        } else {
            System.out.println("This is not a Palindrome.");
        }


    }
}
