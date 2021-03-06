package com.stratio.marathonlbsec.functionalAT;

import com.stratio.qa.cucumber.testng.CucumberRunner;
import com.stratio.tests.utils.BaseTest;
import cucumber.api.CucumberOptions;
import org.testng.annotations.Test;
import org.testng.annotations.Factory;
import com.stratio.qa.data.BrowsersDataProvider;

@CucumberOptions(features = {
        "src/test/resources/features/functionalAT/010_Installation/CCT_Installation_IT.feature",
        "src/test/resources/features/functionalAT/020_Certificates/01_MARATHONLB_1386_AppCertificate.feature",
        "src/test/resources/features/functionalAT/020_Certificates/02_MARATHONLB_1386_ClientCertificate.feature",
        "src/test/resources/features/functionalAT/030_Logs/MARATHONLB_1388_CentralizedLogs.feature"
},format = "json:target/cucumber.json")
public class Nightly_IT extends BaseTest {

    public Nightly_IT() {
    }

    @Test(enabled = true, groups = {"nightly"})
    public void nightly() throws Exception {
        new CucumberRunner(this.getClass()).runCukes();
    }
}