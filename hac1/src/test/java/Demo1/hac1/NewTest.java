package Demo1.hac1;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=2,enabled=false)
  public void a() {
	  System.out.println("hai");
  }
  @Test(priority=1)
  public void b()
  {
	  System.out.println("hello");
  }
  
}
