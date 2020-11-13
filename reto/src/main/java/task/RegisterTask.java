package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.RegisterB;

public class RegisterTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(RegisterB.BUTTON_REGISTER));

    }

    public static RegisterTask register(){
        return new RegisterTask();
    }
}
