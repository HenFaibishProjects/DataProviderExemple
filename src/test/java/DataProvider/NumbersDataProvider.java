package DataProvider;

import org.testng.annotations.DataProvider;

public class NumbersDataProvider {

    @DataProvider(name = "validInputs")
    public static Object[][] buildValidTables() throws Exception {
        Object[][] validInputs = new Object[][]{
                {0,4,2,false},
                {30,50,10,true},
                {45,45,90,false},
                {5,5,5,false},
                {88,1,1,true}
        };
        return validInputs;
    }
}