package designpatterns.ch01_strategy.QuackBehavior;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("꽥");
    }
}
