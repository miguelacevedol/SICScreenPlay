package co.gov.sic.stepDefinitions;

import co.gov.sic.questions.ValidacionQuestion;
import co.gov.sic.task.HabeasTask;
import co.gov.sic.task.HomeTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SicStepDefinitions {
    @Before
    public void setupActor() {
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }
    @Dado("que el usuario abre el navegador e ingrese a la sección Portección de datos personales")
    public void queElUsuarioAbreElNavegadorEIngreseALaSecciónPortecciónDeDatosPersonales() {
        theActorCalled("user").wasAbleTo(
                HomeTask.on()
        );
    }
    @Cuando("el usuario confirme ingrese en el Habeas Data Financiero")
    public void elUsuarioConfirmeIngreseEnElHabeasDataFinanciero() {
        theActorInTheSpotlight().attemptsTo(
                HabeasTask.on()
        );
    }
    @Entonces("el usuario podrá validar la información presentada")
    public void elUsuarioPodráValidarLaInformaciónPresentada() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionQuestion.from(),
                        Matchers.equalTo(true)
                )
        );
    }
}
