package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.RegisterFormat;

import java.util.Map;

public class FormatTask implements Task {

    private String firstName;
    private String lastName;
    private String email;

    public FormatTask(Map<String,String>data) {
        this.firstName = data.get("firstName");
        this.lastName = data.get("lastName");
        this.email = data.get("email");
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Enter.theValue(firstName).into(RegisterFormat.FIRST_NAME),Enter.theValue(lastName).into(RegisterFormat.LAST_NAME)
        ,Enter.theValue(email).into(RegisterFormat.EMAIL), Click.on(RegisterFormat.MONTH), Click.on(RegisterFormat.EMAIL)
        ,Click.on(RegisterFormat.YEAR));

    }

    public static FormatTask formOne(Map<String,String>data){

        return new FormatTask(data);
    }
}
