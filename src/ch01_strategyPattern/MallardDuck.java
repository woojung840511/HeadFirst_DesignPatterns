package ch01_strategyPattern;

import ch01_strategyPattern.FlyBehavior.FlyWithWings;
import ch01_strategyPattern.QuackBehavior.Quack;

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
