package programming_to_an_interface.behaviors;

import programming_to_an_interface.behaviors.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
