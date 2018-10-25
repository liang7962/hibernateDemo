package com.example.demo.gcTest;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class GCTest {
//    强引用
/*    public static void main(String[] args){
        new GCTest().fun1();

    }
    public void fun1() {
        Object object = new Object();
        Object[] objArr = new Object[1000];
        System.out.println(objArr);
        System.gc();//通知GVM回收资源
        System.out.println(objArr);
    }*/

//        弱引用执行gc会回收对象
/*    public static void main(String[] args) {
        WeakReference<People> reference = new WeakReference<People>(new People("zhouqian", 20));
        System.out.println(reference.get());
        System.gc();//通知GVM回收资源
        System.out.println(reference.get());
    }
}

class People {
    public String name;
    public int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "[name:" + name + ",age:" + age + "]";
    }*/

//    虚引用
    public static void main(String[] args) {
        ReferenceQueue<String> queue = new ReferenceQueue<String>();
        PhantomReference<String> pr = new PhantomReference<String>(new String("hello"), queue);
        System.out.println(pr.get());
    }


}




