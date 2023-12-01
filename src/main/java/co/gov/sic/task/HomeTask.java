package co.gov.sic.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.gov.sic.UI.HomeUI.BTN_DATOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class HomeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.sic.gov.co/"),
                Click.on(BTN_DATOS)
        );

    }

    public static HomeTask on(){
        return instrumented(HomeTask.class);
    }


}
