import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;



// (DISCLAIMER) the below methods must be run one at a time, rather than running the whole class
public class UserInputTest {
    private final InputStream originalSystemIn = System.in;

    @AfterEach
    public void restoreSystemInStream() {
        System.setIn(originalSystemIn); // Restore original System.in
    }

    // (DISCLAIMER) the below methods must be run one at a time, rather than running the whole class
    @Test
    public void testValidInput() {
        // Simulate user input "3"
        String simulatedInput = "3\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        int result = UserInput.requestInt(5);
        assertEquals(3, result);
    }

    @Test
    public void testInvalidInputThenValid() {
        // Simulate user input "abc", then "4"
        String simulatedInput = "abc\n4\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        int result = UserInput.requestInt(5);
        assertEquals(4, result);
    }

    @Test
    public void testInputOutOfBounds() {
        // Simulate user input "7", then "3"
        String simulatedInput = "7\n3\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        int result = UserInput.requestInt(5);
        assertEquals(3, result);
    }
}

