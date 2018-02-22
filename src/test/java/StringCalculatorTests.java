import org.junit.Test;

import java.awt.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StringCalculatorTests {

    @Test
    public void EmptyStringReturnsZero() {
        StringCalculator stringCalculator = new StringCalculator();
        assertThat(stringCalculator.add(""), is(0));
    }
}
