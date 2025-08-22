import org.example.MaxService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxServiceTest {

    @Test
    public void testShoulFindMax() {
        MaxService service = new MaxService();

        int a = 5;
        int b = 3;

        int expected = 88;
        int actual = service.max( a, b );

        Assertions.assertEquals( expected, actual );
    }
}
