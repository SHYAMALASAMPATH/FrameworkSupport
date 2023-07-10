package rahulshettyacademy.tests;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Feature1Tests extends TestSetup {
    private ExtentTest extentTest;

    @BeforeMethod
    public void setupTest() {
        extentTest = TestSetup.extent.createTest("Feature 1 Test");
    }

    @Test
    public void test1() {
        // Test code for feature 1
        extentTest.log(Status.INFO, "Running test1");
        Assert.assertEquals(2 + 2, 4); // Example assertion

        extentTest.pass("Test passed");
    }

    @Test
    public void test2() {
        // Test code for feature 1
        extentTest.log(Status.INFO, "Running test2");
        Assert.assertTrue(false, "Example failure reason"); // Example failure

        extentTest.fail("Test failed");
    }

    @AfterMethod
    public void afterMethod() {
        TestSetup.extent.flush();
    }
}
