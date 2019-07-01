package DataProvider;

import org.testng.annotations.DataProvider;

public class NumbersDataProvider {

    @DataProvider(name = "validInputs")
    public static Object[][] buildValidTables() throws Exception {
        Object[][] validInputs = new Object[][]{
                {0,4,2},
                {30,4,2},
                {45,45,90},
                {5,5,5},
        };
        return validInputs;
    }
}