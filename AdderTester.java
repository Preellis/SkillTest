import static org.junit.Assert.*;
import org.junit.*;
public class AdderTester {
  @Test
  public void testAdd(){
    assertEquals(2, Adder.add(1,2));
  }
}
