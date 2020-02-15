package school.cesar.until;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class BodyMassIndex {

    public static String calculate(float bmi) {
        if (bmi < 17) {
            return "Severely underweight";
        }

        if (bmi < 18.5) {

            return "Underweight";

        }

        if (bmi < 24.49) {

            return "Healthy Weight";
        }

        if (bmi < 30) {

            return "Over Weight";
        }

        return "Obese";


    }
}
