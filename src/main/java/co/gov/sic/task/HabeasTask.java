package co.gov.sic.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

import static co.gov.sic.UI.HabeasUI.BTN_HABEAS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HabeasTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_HABEAS),
                Click.on(BTN_HABEAS)
        );

    }

    public static HabeasTask on(){
        return instrumented(HabeasTask.class);
    }


}
