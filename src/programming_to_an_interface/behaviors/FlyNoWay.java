package programming_to_an_interface.behaviors;

import programming_to_an_interface.behaviors.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
