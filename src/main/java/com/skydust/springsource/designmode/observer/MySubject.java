package com.skydust.springsource.designmode.observer;

/**
 * 观察者模式，对象发生变化执行动作的时候，依赖该对象的对象会受到通知并执行相应的变化
 *
 * @author laoliangliang
 */
public class MySubject extends AbstractSubject {

    public void executeTask() {
        System.out.println("MySubject execute!");
        notifyObserver();
    }


    public static void main(String[] args) {
        MySubject test = new MySubject();
        Observer1 ob1 = new Observer1();
        Observer2 ob2 = new Observer2();

        test.addObserver(ob1);
        test.addObserver(ob2);
        test.executeTask();
    }
}
