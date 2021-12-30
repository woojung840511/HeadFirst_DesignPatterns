package designpatterns.ch01_strategy;

import designpatterns.ch01_strategy.Duck.MallardDuck;
import designpatterns.ch01_strategy.Duck.ModelDuck;
import designpatterns.ch01_strategy.FlyBehavior.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        duck.performQuack();
        duck.performFly();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        // 실행 중에 오리의 행동을 바꾸고 싶으면 원하는 행동에 해당하는 setter를 호출하면 된다.
        modelDuck.performFly();
    }
}
