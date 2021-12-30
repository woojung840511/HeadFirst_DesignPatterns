package designpatterns.ch01_strategy.FlyBehavior;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("날고 있어요!!");
    }
}
