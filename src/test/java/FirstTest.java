import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FirstTest {

    private final FirstClass uut = new FirstClass();

    @Test
    void first_test() {
        assertNotNull(uut.getNonNullObject());
    }
}
