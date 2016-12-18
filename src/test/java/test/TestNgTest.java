package test;

import com.vimalselvam.testng.listener.ExtentTestNgFormatter;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * This is a sample TestNG test.
 */
public class TestNgTest {

    // The instance of the ExtentTestNgFormatter can be obtained as follows
    private ExtentTestNgFormatter formatter = ExtentTestNgFormatter.getInstance();

    @AfterMethod
    public void afterMethod(ITestResult iTestResult) throws IOException {
        Reporter.log("After Method: " + iTestResult.getMethod().getMethodName());
    }

    @Test(groups = {"group1"})
    public void simpleTest() {
        Reporter.log("Simple test");
        Reporter.log("Another log");
    }

    @Test(groups = {"group2"})
    public void anotherSimpleTest() {
        Reporter.log("Another Simple test");
    }
}
