import builder.Student;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mutabilitydetector.unittesting.MutabilityAssert;

public class BuilderTest {

    @Test
    @DisplayName("Check Immutability of class")
    public void immutable()
    {
        MutabilityAssert.assertImmutable(Student.class);
    }

}
