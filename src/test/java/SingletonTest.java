import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import singleton.Singleton;

public class SingletonTest {

    @Test
    @DisplayName("Object Reference Check")
    void singleInstance()
    {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        Assertions.assertSame(obj1, obj2);
        Assertions.assertSame(obj2, obj3);
    }
    

}
