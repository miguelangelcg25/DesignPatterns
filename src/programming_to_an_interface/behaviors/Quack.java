package programming_to_an_interface.behaviors;

import programming_to_an_interface.behaviors.QuackBehavior;

public class Quack implements QuackBehavior {

    public void quack() {
        System.out.println("Quack");
    }
}
