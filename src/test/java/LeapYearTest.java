import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import school.cesar.until.BodyMassIndex;
import school.cesar.until.LeapYear;

public class LeapYearTest {

    @Test
    public void leapyear_DivisibleBy4_true() {

        Assertions.assertEquals(true, LeapYear.calculate(2020));

    }

    @Test
    public void leapyear_DivisibleBy400_false() {

        Assertions.assertEquals(false, LeapYear.calculate(1901));

    }

    @Test
    public void leapyear_DivisableBy100_true() {

        Assertions.assertEquals(true, LeapYear.calculate(1904));

    }
}
