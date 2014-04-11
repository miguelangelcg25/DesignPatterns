package programming_to_an_interface;

import programming_to_an_interface.behaviors.FlyNoWay;
import programming_to_an_interface.behaviors.FlyWithWings;
import programming_to_an_interface.behaviors.MuteQuack;
import programming_to_an_interface.behaviors.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.setQuackBehavior(new Quack());
        this.setFlyBehavior(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
