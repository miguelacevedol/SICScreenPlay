package co.gov.sic.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

import static co.gov.sic.UI.ValidacionUI.LBL_HABEAS;

public class ValidacionQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Scroll.to(LBL_HABEAS);
        return LBL_HABEAS.resolveFor(actor).isDisplayed();
    }
    public static Question<Boolean> from(){
        return  new ValidacionQuestion();
    }
}
