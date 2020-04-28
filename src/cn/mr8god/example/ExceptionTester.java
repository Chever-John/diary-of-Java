package cn.mr8god.example;

/**
 * @author
 * @date
 * @time
 */
class Sample{
    int method1(int x )throws Exception{
        if (x < 0){
            throw new Exception("x<0");// 异常发生的现场
        }
        return x++;
    }
}
public class ExceptionTester {
    public static void main(String[] args) {
        try {
            System.out.println("Begin");
            new Sample().method1(1);// 出现SpercialException异常。
            //System.exit(0);
        } catch (Exception e){
            System.out.println("Wrong");
//            throw e;
        } finally {
            System.out.println("Finally");
        }
        System.out.println("End");
    }
}
