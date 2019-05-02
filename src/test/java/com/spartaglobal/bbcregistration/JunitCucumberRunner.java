package com.spartaglobal.bbcregistration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"pretty", "html:reports"},
            features = "C:\\Users\\TGoddard\\IdeaProjects\\bbcregistration\\src\\test\\java\\resources\\features\\registration.feature"
    )


    public class JunitCucumberRunner { }
