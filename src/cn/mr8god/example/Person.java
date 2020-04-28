package cn.mr8god.example;

/**
 * @author Mr8god
 * @date 2020/4/14
 * @time 17:05
 */
public class Person {
    public int age;
    public Person grow() {
        age ++;
        return this;
    }
    public static void main(String[] args) {
        Person p = new Person();
        //可以连续调用同一个方法
        p.grow().grow().grow();
        System.out.println("p对象的age的值是："+p.age);
    }
}