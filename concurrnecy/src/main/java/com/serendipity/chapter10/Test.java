package com.serendipity.chapter10;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/13 17:28
 */
public class Test {
    public static void main(String[] args) {
        A a=new A();
        a.show();
        B b=new B();
        b.show();
    }
}
class A{
    public void show(){
        show2();
    }
    public void show2(){
        System.out.println("A");
    }
}
class B extends A{
    @Override
    public void show2(){
        System.out.println("B");
    }
}
class C extends B{
    @Override
    public void show(){
        super.show();
    }
    @Override
    public void show2(){
        System.out.println("C");
    }


}
