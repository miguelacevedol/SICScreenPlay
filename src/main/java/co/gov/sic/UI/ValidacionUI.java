package co.gov.sic.UI;

import net.serenitybdd.screenplay.targets.Target;

public class ValidacionUI {
    public static Target LBL_HABEAS=Target.the("perfil").
                locatedBy("//p[contains(text(),'La Ley 1266 de 2008, también conocida como Ley de ')]");
}
