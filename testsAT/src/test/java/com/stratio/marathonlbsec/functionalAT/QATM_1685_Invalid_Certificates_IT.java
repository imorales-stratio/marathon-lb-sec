package com.stratio.marathonlbsec.functionalAT;

import com.stratio.qa.cucumber.testng.CucumberRunner;
import com.stratio.tests.utils.BaseTest;
import cucumber.api.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {
        "src/test/resources/features/functionalAT/020_Certificates/QATM_1685_Invalid_Certificates_IT.feature"
},format = "json:target/cucumber.json")
public class QATM_1685_Invalid_Certificates_IT extends BaseTest {

    public QATM_1685_Invalid_Certificates_IT() {
    }

    @Test(enabled = true, groups = {"invalid_certificates"})
    public void QATM_1685_Invalid_Certificates_IT() throws Exception {
        new CucumberRunner(this.getClass()).runCukes();
    }
}