import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by ylyuan on 11/1/16.
 */
public class LengthTest {

    @Test
    public void should_return_true_then_compare_1_meter_with_1_meter() throws Exception {
        Length length1 = new Length(1, Length.Unit.Meter);
        Length length2 = new Length(1, Length.Unit.Meter);

        assertTrue(length1.equalTo(length2));
    }

    @Test
    public void should_return_false_then_compare_1_meter_with_2_meter() throws Exception {
        Length length1 = new Length(1, Length.Unit.Meter);
        Length length2 = new Length(2, Length.Unit.Meter);

        assertFalse(length1.equalTo(length2));
    }

    @Test
    public void should_return_false_then_compare_1_meter_with_1_centimeter() throws Exception {
        Length length1 = new Length(1, Length.Unit.Meter);
        Length length2 = new Length(1, Length.Unit.CentiMeter);

        assertFalse(length1.equalTo(length2));
    }

    @Test
    public void should_return_true_then_compare_1_meter_with_100_centimeter() throws Exception {
        Length length1 = new Length(1, Length.Unit.Meter);
        Length length2 = new Length(100, Length.Unit.CentiMeter);

        assertTrue(length1.equalTo(length2));
    }

    @Test
    public void should_return_false_then_compare_1_centimeter_with_1_meter() throws Exception {
        Length length1 = new Length(1, Length.Unit.CentiMeter);
        Length length2 = new Length(1, Length.Unit.Meter);

        assertFalse(length1.equalTo(length2));
    }

    @Test
    public void should_return_true_then_compare_100_centimeter_with_1_meter() throws Exception {
        Length length1 = new Length(100, Length.Unit.CentiMeter);
        Length length2 = new Length(1, Length.Unit.Meter);

        assertTrue(length1.equalTo(length2));
    }
}