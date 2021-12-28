package designpatterns.ch01_strategyPattern.Duck;

import designpatterns.ch01_strategyPattern.FlyBehavior.FlyNoWay;
import designpatterns.ch01_strategyPattern.QuackBehavior.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다");
    }


}
