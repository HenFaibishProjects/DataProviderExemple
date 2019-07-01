package Tests;

import DataProvider.NumbersDataProvider;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import AppClass.*;
import java.util.logging.Logger;

public class testTriangularNumber {

    private static final Logger LOGGER = Logger.getLogger(testTriangularNumber.class.getName());
    ITestResult result;
    TriangularNumber triangularNumber = new TriangularNumber();

    @BeforeClass
    public void createObject() {
    }

    @Test(dataProviderClass = NumbersDataProvider.class, dataProvider = "validInputs")
    public void getExistingFile(int a, int b, int c , boolean expectedResult) {
        LOGGER.info("Test With Values " + a + "," + b + "," + c);
        Assert.assertEquals(triangularNumber.testit(a, b, c), expectedResult);

    }

}