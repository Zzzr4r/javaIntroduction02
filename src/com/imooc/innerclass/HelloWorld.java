package com.imooc.innerclass;

/**
 * 内部类
 */
//外部类HelloWorld
public class HelloWorld {
    /*
    成员内部类
     */
    /*//外部类的私有属性name
    private String name = "imooc";

    //外部类的成员属性
    int age = 20;

    //成员内部类Inner
    public class Inner {
        String name = "爱慕课";

        //内部类中的方法
        public void show() {
            System.out.println("外部类中的name：" + HelloWorld.this.name);
            System.out.println("内部类中的name：" + name);
            System.out.println("外部类中的age：" + age);
        }
    }

    //测试成员内部类
    public innerclass void main(String[] args) {

        //创建外部类的对象
        HelloWorld o = new HelloWorld();

        //创建内部类的对象
        Inner inn = o.new Inner();

        //调用内部类对象的show方法
        inn.show();
    }*/
    /*
    静态内部类
     */
    // 外部类中的静态变量score
    private static int score = 84;

    // 创建静态内部类
    public static class SInner {
        // 内部类中的变量score
        int score = 91;

        public void show() {
            System.out.println("访问外部类中的score：" + HelloWorld.score);
            System.out.println("访问内部类中的score：" + score);
        }
    }

    // 测试静态内部类
    public static void main(String[] args) {
        // 直接创建内部类的对象
        SInner si = new SInner();

        // 调用show方法
        si.show();
    }
}