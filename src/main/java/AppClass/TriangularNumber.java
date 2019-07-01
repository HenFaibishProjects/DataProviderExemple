package AppClass;

import java.util.Scanner;
import java.util.stream.IntStream;

public class TriangularNumber {

    public boolean testit(int angle1 , int angle2 , int angle3)
    {
         if (IntStream.of(angle1,angle2,angle3).sum()==90) {
             return true;
         }
         else {
             return false;
         }
    }
}
