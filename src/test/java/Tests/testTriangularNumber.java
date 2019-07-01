package Tests;

import DataProvider.NumbersDataProvider;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import AppClass.*;

public class testTriangularNumber {


    @BeforeClass
    public void createObject() {
        // Do Something
    }

    @Test(dataProviderClass = NumbersDataProvider.class,dataProvider = "validInputs")
        public void getExistingFile(int a,int b,int c) {
        TriangularNumber triangularNumber = new TriangularNumber() ;
        triangularNumber.testit(a,b,c);

    }

}
