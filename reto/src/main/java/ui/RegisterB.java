package ui;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterB {

    public static final Target BUTTON_REGISTER = Target.the("button REGISTER")
            .locatedBy(" //unauthenticated-header/div[1]/div[3]/ul[2]/li[2]/a[1]\n");
}
