package cn.mr8god.jchapterten;

/**
 * @author Mr8god
 * @date 2020/4/19
 * @time 13:13
 */
public class TestBed {
    public void f() {
        System.out.println("f()");
    }

    public static class Tester{
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }
}
