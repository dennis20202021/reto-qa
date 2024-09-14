package org.demo.qa.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ParameterDefinitions {

    @ParameterType(".*")
    public Actor actor(String name) {
        return OnStage.theActorCalled(name);
    }

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

}
