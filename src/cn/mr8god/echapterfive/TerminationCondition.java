package cn.mr8god.echapterfive;

/**
 * @author Mr8god
 * @date 2020/4/15
 * @time 12:23
 */

class Book{
    boolean  checkedOut = false;
    Book(boolean checkOut){
        checkedOut = checkOut;
    }

    void checkIn(){
        checkedOut = false;
    }
    protected void finalize(){
        if (checkedOut){
            System.out.println("Error: checked out");
        }
    }
}
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }
}
