package designpatterns.ch01_strategyPattern.QuackBehavior;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("꽥");
    }
}
