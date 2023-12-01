package co.gov.sic.UI;

import net.serenitybdd.screenplay.targets.Target;
public class HomeUI {
    public static Target BTN_DATOS=Target.the("datos personales")
            .locatedBy("//a[@title='Protección de datos personales']");

}
