package com.amazon.tasks;
/*
 * @(#) HomeTask.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

import static com.amazon.UI.HomeUI.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class HomeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.amazon.com/"),
                Enter.theValue("Tv").into(TXT_SEARCH).thenHit(Keys.ENTER)
        );

    }

    public static HomeTask on(){
        return instrumented(HomeTask.class);
    }


}
