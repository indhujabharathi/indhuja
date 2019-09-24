package Demo1.hac1;
import org.testng.asserts.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NewTest3 {
  @Test(priority=2)
  public void f() {
	  Assert.assertEquals(true, true);
	  Assert.assertEquals(true, false);
	  Assert.assertEquals(false, true);
  }

@Test(priority=1)
public void f1(){
SoftAssert sa=new SoftAssert();
sa.assertEquals(true,false);
sa.assertEquals(true, true);
sa.assertEquals(true, true);
//sa.assertAll();
}
}