package designpatterns.ch01_strategy.Duck;

import designpatterns.ch01_strategy.FlyBehavior.FlyWithWings;
import designpatterns.ch01_strategy.QuackBehavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck display");
    }


}
