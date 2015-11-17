package com.shilu.designPattern.l01;
import com.shilu.designPattern.l01.fly.FlyBehavior;
import com.shilu.designPattern.l01.quack.QuackBehavior;
/**
 * Created by shilu on 15-10-27.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack(){
        quackBehavior.quack();
    };

    public void swim(){};

    public void display(){};

    public void performFly(){
        flyBehavior.fly();
    };

}
