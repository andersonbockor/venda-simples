package br.com.anderson.cucumber.stepdefs;

import br.com.anderson.VendasimplesApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = VendasimplesApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
