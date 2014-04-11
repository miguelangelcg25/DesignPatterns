package programming_to_an_interface;

import programming_to_an_interface.behaviors.FlyWithWings;
import programming_to_an_interface.behaviors.MuteQuack;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        
        mallard.setQuackBehavior(new MuteQuack());
        mallard.setFlyBehavior(new FlyWithWings());
        
        mallard.performQuack();
        mallard.performFly();
    }
}
