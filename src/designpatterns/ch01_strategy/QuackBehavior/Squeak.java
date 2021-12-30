package designpatterns.ch01_strategy.QuackBehavior;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
