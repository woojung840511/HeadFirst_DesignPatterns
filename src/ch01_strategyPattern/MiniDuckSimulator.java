package ch01_strategyPattern;

import ch01_strategyPattern.Duck.MallardDuck;
import ch01_strategyPattern.Duck.ModelDuck;
import ch01_strategyPattern.FlyBehavior.FlyRocketPowered;

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
