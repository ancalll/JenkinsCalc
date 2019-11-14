package ancaTest;

import anca.JenkinsCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JenkinsCalcTest {

  @Test
  public void addTest() {
    assertEquals(10, JenkinsCalculator.addNumbers(5, 5));
  }

  @Test
  void subtractTest() {
    assertEquals(5, JenkinsCalculator.subtractNumbers(10, 5));
  }
}
