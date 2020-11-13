package ui;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterFormat {

    public static final Target FIRST_NAME= Target.the("fist name").locatedBy("//input[@id='firstName']");
    public static final Target LAST_NAME= Target.the("last name").locatedBy("//input[@id='lastName']");
    public static final Target EMAIL= Target.the("email").locatedBy("//input[@id='email']");
    public static final Target MONTH= Target.the("month").locatedBy("//option[contains(text(),'June')]");
    public static final Target DAY= Target.the("day").locatedBy("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[4]/div[2]/div[1]/div[2]/select[1]/option[9]");
    public static final Target YEAR= Target.the("year").locatedBy("//option[contains(text(),'1994')]");
}
