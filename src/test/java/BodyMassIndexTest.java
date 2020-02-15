import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import school.cesar.until.BodyMassIndex;

public class BodyMassIndexTest {

    @Test
    public void calculate_bmiUnder17_SeverelyUnderweight() {

        Assertions.assertEquals("Severely underweight", BodyMassIndex.calculate(16));
    }

    @Test
    public void calculate_bmiBetween17And18Dot5_Underweight() {
        Assertions.assertEquals("Underweight", BodyMassIndex.calculate(18.49f));

    }

    @Test
    public void calculate_bmiBetween18And25Dot25_Healthyweight() {
        Assertions.assertEquals("Healthy Weight", BodyMassIndex.calculate(24.49f));

    }

    @Test
    public void calculate_bmiBetween25And30_Overweight() {
        Assertions.assertEquals("Over Weight", BodyMassIndex.calculate(29.9f));

    }

    @Test
    public void calculate_bmi30Over_Overweight() {
        Assertions.assertEquals("Obese", BodyMassIndex.calculate(30f));

    }


}
