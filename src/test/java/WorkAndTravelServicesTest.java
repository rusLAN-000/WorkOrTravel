import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.WorkAndTravelServices;

public class WorkAndTravelServicesTest {

    @Test
    public void WorkAndTravelCheapHoliday() {
        WorkAndTravelServices services = new WorkAndTravelServices();

        int expected = 3;
        int actual = services.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void WorkAndTravelRichHoliday() {
        WorkAndTravelServices services = new WorkAndTravelServices();

        int expected = 2;
        int actual = services.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}
