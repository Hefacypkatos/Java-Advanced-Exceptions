package Task1;

public class Divider {

    public static double divide(double firstVal, double secondVal) throws CannotDivideBy0Exception {
            if (secondVal == 0){
                throw new CannotDivideBy0Exception("Cannot divide by 0");
            }
            if (firstVal == 0){
                throw new CannotDivideBy0Exception("Cannot divide by 0 V2");
            }

        return firstVal/secondVal;
    }
}
